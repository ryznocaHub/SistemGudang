/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SistemGudang.program;

/**
 *
 * @author USER
 */
public class DataGudang {
    
    private int Kode;
    private String Jenis;
    private String Nama;
    private int Kapasitas;
    private int Luas;
    private int Status=0;
    
    void setData(String Kode,String Nama,String Jenis, String Kapasitas, String Luas){
        setJenis(Jenis);       
                
        if(Nama.matches("[a-z,A-Z,' ']*")){
            //Pengecekan agar Nama Gudang yang diinputkan berupa huruf dan spasi
            setNama(Nama);             
        }else{
            setStatus(2);
        }
        
        if(Kapasitas.matches("[0-9]*")){
            //Pengecekan agar Kapasitas yang diinputkan berupa angka
            setKapasitas(Integer.parseInt(Kapasitas));  
        }else{
            setStatus(3);
        }
        
        if(Luas.matches("[0-9]*")){
            //Pengecekan agar Luas yang diinputkan berupa angka
            setLuas(Integer.parseInt(Luas));  
        }else{
            setStatus(4);
        }
        
        //pada pengisian Kode hanya boleh input berupa angka
        if(Kode.matches("[0-9]*")){
            //Pengecekan agar Kode yang diinputkan dimulai dari angka 33
            //dan panjang Kode Gudang sebanyak 5 angka
            if(Kode.length() == 5 && 33000 <= Integer.parseInt(Kode) && 34000 > Integer.parseInt(Kode)){
              setKode(Integer.parseInt(Kode));  
            }else{
                setStatus(1);
            }
        }else{
            setStatus(5);
        }
        
    }
    
    //method mendapatkan nilai variabel
    int getKode(){
        return this.Kode;
    }
    String getJenis(){
        return this.Jenis;
    }
    String getNama(){
        return this.Nama;
    }
    int getKapasitas(){
        return this.Kapasitas;
    }
    int getLuas(){
        return this.Luas;
    }
    int isStatus(){
        return this.Status;
    }
    
    //method mengganti isi variabel
    void setKode(int Kode){
        this.Kode = Kode;
    }
    void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
    void setNama(String Nama){
        this.Nama = Nama;
    }
    void setKapasitas(int Kapasitas){
        this.Kapasitas = Kapasitas;
    }
    void setLuas(int Luas){
        this.Luas = Luas;
    }
    void setStatus(int Status){
        this.Status = Status;
    }
}
