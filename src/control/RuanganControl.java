package control;
/*
KELOMPOK 3
Nama : Gabriel Allba Shemi Yuma
NPM : 210711150

Nama : Andreas Margono
NPM : 210711135

*/
import dao.RuanganDAO;
import java.util.List;
import model.Ruangan;
import table.TableRuangan;

public class RuanganControl {
    private RuanganDAO dDao = new RuanganDAO();
    
    public void insertDataRuangan(Ruangan d){
        dDao.insertRuangan(d);
    }
    
    public TableRuangan showRuanganBySearch(String query){
        List<Ruangan> dataRuangan = dDao.showRuanganBySearch(query);
        TableRuangan tableRuangan = new TableRuangan(dataRuangan);
        
        return tableRuangan;
    }
    
    public List<Ruangan> getAllRuangan(String query){
        List<Ruangan> dataRuangan = dDao.showRuanganBySearch(query);
        
        return dataRuangan;
    }
    
    
    
    
    public void updateDataRuangan(Ruangan d, int id){
        dDao.updateRuangan(d, id);
    }
    
    
    public void deleteDataRuangan(int id){
        dDao.deleteRuangan(id);
    }
    
}
    