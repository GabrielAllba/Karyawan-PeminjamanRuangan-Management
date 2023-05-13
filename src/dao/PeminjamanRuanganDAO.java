package dao;
/*
KELOMPOK 3
Nama : Gabriel Allba Shemi Yuma
NPM : 210711150

Nama : Andreas Margono
NPM : 210711135
*/
import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Karyawan;
import model.PeminjamanRuangan;
import model.Ruangan;

public class PeminjamanRuanganDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertPeminjaman(PeminjamanRuangan d){
        con = dbCon.makeConnection();
        String sql = "INSERT INTO peminjaman_ruangan(id_karyawan, id_ruangan, tanggal, lama_peminjaman, fasilitas) "+ "VALUES ('" + d.getKaryawan().getId()+"', '"+d.getRuangan().getId()+"', '"+d.getTanggal()+"', '"+d.getLama_peminjaman()+"', '"+d.getFasilitas()+"')";
        System.out.println("Adding Peminjaman Ruangan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " Peminjaman Ruangan");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Peminjaman Ruangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
     public List<PeminjamanRuangan> showPeminjaman(String query){
        con = dbCon.makeConnection();
        String sql;
        if(query.length()==0){
            sql = "SELECT pr.*, r.*, k.* FROM peminjaman_ruangan AS pr INNER JOIN karyawan AS k ON pr.id_karyawan = k.id INNER JOIN ruangan AS r ON r.id = pr.id_ruangan";    
        }else{
            sql = "SELECT pr.*, r.*, k.* FROM peminjaman_ruangan AS pr INNER JOIN karyawan AS k ON pr.id_karyawan = k.id INNER JOIN ruangan AS r ON r.id = pr.id_ruangan WHERE k.nama like '"+query+"' OR k.jenis like '"+query+"' "+" OR r.nama like '"+query+"' OR pr.tanggal like '"+query+"' OR pr.lama_peminjaman like '"+query+"' or pr.fasilitas like '"+query+"' or k.bebanMengajar like '"+query+"' or k.jamKerja like '"+query+"'";    
        }
        
        System.out.println("Mengambil data Mata Kuliah...");
        
        List<PeminjamanRuangan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    
                    
                    
                    Karyawan k = new Karyawan(
                            rs.getString("k.id"),
                            rs.getString("k.nama"),
                            rs.getString("k.jenis"),
                            rs.getInt("k.tahunMasuk"),
                            rs.getString("k.noTelepon"),
                            rs.getString("k.bebanMengajar"),
                            rs.getInt("k.jamKerja")
                        );
                    

                    
                    Ruangan r = new Ruangan(
                        rs.getInt("r.id"),
                        rs.getString("r.nama"),
                        rs.getString("r.kapasitas"),
                        rs.getString("r.luas")
                    );
                    
                    PeminjamanRuangan pr = new PeminjamanRuangan(
                            rs.getInt("pr.id"),
                            rs.getString("pr.tanggal"),
                            rs.getString("pr.lama_peminjaman"),
                            rs.getString("pr.fasilitas"),
                            k,
                            r
                    );
                    
                    list.add(pr);
                }
                
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return list;
    }
    
    
   
    
    public void updatePeminjaman(PeminjamanRuangan pr, int id){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE peminjaman_ruangan SET tanggal = '"+pr.getTanggal()+"', "+ "lama_peminjaman = '"+pr.getLama_peminjaman()+"', " + " fasilitas = '"+pr.getFasilitas()+"', "+"id_karyawan = '"+pr.getKaryawan().getId()+"', "+" id_ruangan = '"+pr.getRuangan().getId()+"' WHERE id = '"+id+"'";
        
        System.out.println(sql);
        System.out.println("Editing Peminjaman Ruangan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " Peminjaman Ruangan "+pr.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing peminjaman ruangan...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deletePeminjaman(int id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM peminjaman_ruangan WHERE id = "+id;    
  
        System.out.println("Deleting asdfasdfasdf...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " Peminjaman "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting peminjaman ruangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
}
