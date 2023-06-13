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
public class datasetFotografer {
    private ArrayList<String> idfotografer;
    private ArrayList<String> status;
    
 public datasetFotografer (){
        idfotografer = new ArrayList<>();
        status = new ArrayList<>();
    }

public void addIdFotografer (String value){
    this.idfotografer.add(value);
}
public ArrayList<String> getIdFotografer(){
    return this.idfotografer;
}  

public void addStatus (String value){
    this.status.add(value);
}
public ArrayList<String> getStatus(){
    return this.status;
}
}
