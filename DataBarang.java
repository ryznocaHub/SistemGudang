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
public class DataBarang {
    private String Nama;
    private int Harga;
    private int Stok;
    private int Kodegdg;
    private int Status=0;
    
    void setData(String Nama, String Harga, String Stok, String Kodegdg){            

            //pada pengisian Nama hanya boleh input berupa Huruf dan spasi 
            if(Nama.matches("[a-z,A-Z,' ']*")){
                 setNama(Nama);             
            }else{
                setStatus(1);
            }
            
            //pada pengisian Harga hanya boleh input berupa angka           
            if(Harga.matches("[0-9]*")){
                setHarga(Integer.parseInt(Harga));
            }else{
                setStatus(2);
            }
            
            //pada pengisian Stok hanya boleh input berupa angka 
            if(Stok.matches("[0-9]*")){
                setStok(Integer.parseInt(Stok));
            }else{
                setStatus(3);
            }
            
            //pada pengisian Kode Gudang harus dipilih
            if(Kodegdg.matches("[0-9]*")){
                setKodegdg(Integer.parseInt(Kodegdg));
            }else{
                setStatus(4);
            }
        }
    
    //method mengganti isi variabel
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setHarga(int Harga){
        this.Harga = Harga;
    }
    public void setStok(int Stok){
        this.Stok = Stok;
    }
    public void setKodegdg(int Kodegdg){
        this.Kodegdg = Kodegdg;
    }
    public void setStatus(int Status){
        this.Status = Status;
    }
    
    //method mendapatkan nilai variabel
     String getNama(){
         return this.Nama;
     }
     int getHarga(){
         return this.Harga;
     }
     int getStok(){
         return this.Stok;
     }
     int getKodegdg(){
         return this.Kodegdg;
     }
     int isStatus(){
         return this.Status;
     }
}
