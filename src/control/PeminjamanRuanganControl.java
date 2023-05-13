package control;
/*
KELOMPOK 3
Nama : Gabriel Allba Shemi Yuma
NPM : 210711150

Nama : Andreas Margono
NPM : 210711135

*/
import dao.PeminjamanRuanganDAO;
import java.util.List;
import model.PeminjamanRuangan;
import table.TablePeminjamanRuangan;

public class PeminjamanRuanganControl {
    private PeminjamanRuanganDAO dDao = new PeminjamanRuanganDAO();
    
    public void insertPeminjaman(PeminjamanRuangan pr){
        dDao.insertPeminjaman(pr);
    }
    public TablePeminjamanRuangan showPeminjaman(String query){
        List<PeminjamanRuangan> dataPeminjaman = dDao.showPeminjaman(query);
        TablePeminjamanRuangan tablePeminjaman = new TablePeminjamanRuangan(dataPeminjaman);
        
        return tablePeminjaman;
    }
    
    
    public void updatePeminjaman(PeminjamanRuangan pr, int id){
        dDao.updatePeminjaman(pr, id);
    }
    
    public void deleteDataPeminjaman(int id){
        dDao.deletePeminjaman(id);
    }
}
    