package Dataset;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class datasetPelanggan {
    private ArrayList<String> idpelanggan;
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> telp;
    
    public datasetPelanggan (){
        idpelanggan = new ArrayList<>();
        nama = new ArrayList<>();
        alamat = new ArrayList<>();
        telp = new ArrayList<>();
}

public void addIdPelanggan (String value){
    this.idpelanggan.add(value);
}
public ArrayList<String> getIdPelanggan(){
    return this.idpelanggan;
}

public void addNama (String value){
    this.nama.add(value);
}
public ArrayList<String> getNama(){
    return this.nama;
}

public void addAlamat (String value){
    this.alamat.add(value);
}
public ArrayList<String> getAlamat(){
    return this.alamat;
}

public void addTelpon (String value){
    this.telp.add(value);
}
public ArrayList<String> getTelpon(){
    return this.telp;
}
}