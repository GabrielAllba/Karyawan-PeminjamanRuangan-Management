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
import model.Ruangan;

public class RuanganDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
     public void insertRuangan(Ruangan d){
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
    }
    
    public List<Ruangan> showRuanganBySearch(String query){
        con = dbCon.makeConnection();
        String sql = "";
        
        if(query.length()==0){
            sql = "SELECT * FROM ruangan";
        }else{
            sql = "SELECT * FROM ruangan WHERE id LIKE '"+query+"' "+" OR nama LIKE '"+query+"'"+" OR kapasitas LIKE '"+query+"'"+" OR luas like '"+query+"';";    
        }
        
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
    
    
   
    
     public void updateRuangan(Ruangan d, int id){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE ruangan SET nama = '"+d.getNama()+"', " + "kapasitas = '"+d.getKapasitas()+"' "+"WHERE id = '"+id+"'";
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
    } 
    
    public void deleteRuangan(int id){
        con = dbCon.makeConnection();
        System.out.println("INT ID : "+id);
        String sql = "DELETE FROM ruangan WHERE id = '" + id+ "'";
        
        System.out.println("Deleting Ruangan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " Ruangan "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting ruangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    } 
    
}
