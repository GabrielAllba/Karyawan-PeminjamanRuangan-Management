package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Ruangan;

public class RuanganDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    /* public void insertRuangan(Ruangan d){
        con = dbCon.makeConnection();
        String sql = "INSERT INTO ruangan(nama, kapasitas, luas) "+ "VALUES ('" + d.getNama()+"', '"+d.getKapasitas()+"', '"+d.getLuas()+"' )";
        System.out.println("Adding Ruangan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " Ruangan");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Ruangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }*/
    
    public List<Ruangan> showRuangan(){
        con = dbCon.makeConnection();
        String sql = "SELECT * FROM ruangan";
        System.out.println("Mengambil data Ruangan...");
        
        List<Ruangan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Ruangan d = new Ruangan(
                            rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getString("kapasitas"),
                            rs.getString("luas")
                    );
                    list.add(d);
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
    
    
    /* public Ruangan searchRuangan(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM ruangan WHERE id LIKE '"+query+"' "+" OR nama LIKE '"+query+"'"+" OR kapasitas LIKE '"+query+"'"+" OR luas like '"+query+"';";
        System.out.println("Searching Ruangan...");
        Ruangan d = null;
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs !=null){
                while(rs.next()){
                    d = new Ruangan(
                            rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getString("kapasitas"),
                            rs.getString("luas")
                    );
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return d;
    } */
    
    /* public void updateRuangan(Ruangan d){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE ruangan SET id = '"+d.getId()+"', "+ "nama = '"+d.getNama()+"', " + "kapasitas = '"+d.getKapasitas()+"' "+"WHERE id = '"+d.getId()+"'";
        System.out.println(sql);
        System.out.println("Editing Ruangan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " Ruangan "+d.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing ruangan...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    } */
    
/*    public void deleteRuangan(Ruangan d){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM ruangan WHERE id = '" + d.getId()+ "'";
        
        System.out.println("Deleting Ruangan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " Ruangan "+ d.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting ruangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    } */
    
}
