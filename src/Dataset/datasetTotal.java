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
public class datasetTotal {
    private ArrayList<String> idtotal;
    private ArrayList<String> ukuran;
    private ArrayList<String> hjasa;
    private ArrayList<String> total;
    
      public datasetTotal (){
        idtotal = new ArrayList<>();
        ukuran = new ArrayList<>();
        hjasa = new ArrayList<>();
        total = new ArrayList<>();
    }
public void addIdTotal (String value){
    this.idtotal.add(value);
}
public ArrayList<String> getIdTotal(){
    return this.idtotal;
}

public void addUkuran(String value){
    this.ukuran.add(value);
}
public ArrayList<String> getUkuran(){
    return this.ukuran;
}

public void addHjasa (String value){
    this.hjasa.add(value);
}
public ArrayList<String> getHjasa(){
    return this.hjasa;
}

public void addTotal (String value){
    this.total.add(value);
}
public ArrayList<String> getTotal(){
    return this.total;
}
}
