package Dataset;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class datasetAdmin {
    private ArrayList<String> idadmin;
    private ArrayList<String> nama;
    private ArrayList<String> email;
    private ArrayList<String> status;

public datasetAdmin (){
        idadmin = new ArrayList<>();
        nama = new ArrayList<>();
        email = new ArrayList<>();
        status = new ArrayList<>();
    }
public void addIdAdmin (String value){
    this.idadmin.add(value);
}
public ArrayList<String> getIdAdmin(){
    return this.idadmin;
}

public void addNama (String value){
    this.nama.add(value);
}
public ArrayList<String> getNama(){
    return this.nama;
}

public void addEmail (String value){
    this.email.add(value);
}
public ArrayList<String> getEmail(){
    return this.email;
}

public void addStatus (String value){
    this.status.add(value);
}
public ArrayList<String> getStatus(){
    return this.status;
}

}