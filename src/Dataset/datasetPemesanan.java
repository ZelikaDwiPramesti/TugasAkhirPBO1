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
public class datasetPemesanan {
    private ArrayList<String> idpemesanan;
    private ArrayList<String> paket;
    private ArrayList<String> ukuran;
    
    public datasetPemesanan (){
        idpemesanan = new ArrayList<>();
        paket = new ArrayList<>();
        ukuran = new ArrayList<>();
    }
    
public void addIdPemesanan (String value){
    this.idpemesanan.add(value);
}
public ArrayList<String> getIdPemesanan(){
    return this.idpemesanan;
}

public void addPaket (String value){
    this.paket.add(value);
}
public ArrayList<String> getPaket(){
    return this.paket;
}

public void addUkuran (String value){
    this.ukuran.add(value);
}
public ArrayList<String> getUkuran(){
    return this.ukuran;
}
}
