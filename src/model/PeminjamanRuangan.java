package model;
/*
KELOMPOK 3
Nama : Gabriel Allba Shemi Yuma
NPM : 210711150

Nama : Andreas Margono
NPM : 210711135
*/
import exception.InputKosongException;

public class PeminjamanRuangan {
    private int id;
    private String tanggal;
    private String lama_peminjaman;
    private String fasilitas;
    private Karyawan karyawan;
    private Ruangan ruangan;

    public PeminjamanRuangan(int id, String tanggal, String lama_peminjaman, String fasilitas) {
        this.id = id;
        this.tanggal = tanggal;
        this.lama_peminjaman = lama_peminjaman;
        this.fasilitas = fasilitas;
        
    }
    public PeminjamanRuangan(int id, String tanggal, String lama_peminjaman, String fasilitas, Karyawan karyawan, Ruangan ruangan) throws InputKosongException{
      
        if(tanggal.length()==0){
            throw new InputKosongException();
        }
        if(lama_peminjaman.length()==0){
            throw new InputKosongException();
        }
        if(fasilitas.length()==0){
            throw new InputKosongException();
        }    
        
        
        
        
        this.id = id;
        this.tanggal = tanggal;
        this.lama_peminjaman = lama_peminjaman;
        this.fasilitas = fasilitas;
        this.karyawan = karyawan;
        this.ruangan = ruangan;
    }

    public int getId() {
        return id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getLama_peminjaman() {
        return lama_peminjaman;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setLama_peminjaman(String lama_peminjaman) {
        this.lama_peminjaman = lama_peminjaman;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }
    
}
