package control;
/*

Nama : Gabriel Allba Shemi Yuma
NPM : 210711150

Nama : Andreas Margono
NPM : 210711135

*/
import dao.PeminjamanRuanganDAO;
import java.util.List;
import model.PeminjamanRuangan;

public class PeminjamanRuanganControl {
    private PeminjamanRuanganDAO dDao = new PeminjamanRuanganDAO();
    
    public void insertPeminjaman(PeminjamanRuangan pr){
        dDao.insertPeminjaman(pr);
    }
    public List<PeminjamanRuangan> showPeminjaman(String query){
        List<PeminjamanRuangan> dataPeminjamanRuangan = dDao.showPeminjaman(query);
        return dataPeminjamanRuangan;
    }
    public void updatePeminjaman(PeminjamanRuangan pr){
        dDao.updatePeminjaman(pr);
    }
    
    public void deleteDataPeminjaman(PeminjamanRuangan pr){
        dDao.deletePeminjaman(pr);
    }
}
    