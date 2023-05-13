package model;

import exception.IdErrorException;
import exception.InputKosongException;
import exception.JenisErrorException;

/*
KELOMPOK 3
Nama : Gabriel Allba Shemi Yuma
NPM : 210711150

Nama : Andreas Margono
NPM : 210711135
*/
public class Ruangan {
    private int id;
    private String nama;
    private String kapasitas;
    private String luas;

    public Ruangan(){
        this.id = 0;
        this.nama = "";
        this.kapasitas = "";
        this.luas = "";
    }
    public Ruangan(int id, String nama, String kapasitas, String luas) throws InputKosongException{
        if(nama.isEmpty() || kapasitas.isEmpty()|| luas.isEmpty()){
            throw new InputKosongException();
        }
        this.id = id;
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.luas = luas;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public String getLuas() {
        return luas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void setLuas(String luas) {
        this.luas = luas;
    }
    
    @Override
    public String toString(){
        return nama;
    }
    
    public String showData(){
        return 
                this.nama + " | " + 
                this.kapasitas + " | " +
                this.luas + " | ";
    }
            
}
