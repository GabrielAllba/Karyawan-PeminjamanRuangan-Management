package control;
/*

Nama : Gabriel Allba Shemi Yuma
NPM : 210711150

Nama : Andreas Margono
NPM : 210711135

*/
import dao.RuanganDAO;
import java.util.List;
import model.Ruangan;

public class RuanganControl {
    private RuanganDAO dDao = new RuanganDAO();
    
    /*public void insertDataRuangan(Ruangan d){
        dDao.insertRuangan(d);
    }*/
    
    public List<Ruangan> showListRuangan(String jenis){
        List<Ruangan> dataRuangan = dDao.showRuangan();
        return dataRuangan;
    }
    
    /* public Ruangan searchRuangan(String id){
        Ruangan d = null;
        d = dDao.searchRuangan(id);
        return d;
    } */
    
    /*
    public void updateDataRuangan(Ruangan d, String id){
        dDao.updateRuangan(d, id);
    }
    */
    
    /* public void deleteDataRuangan(String id){
        dDao.deleteRuangan(id);
    }
    */
}
    