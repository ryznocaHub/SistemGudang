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
public class DataOutputBarang {
     private int KodeOutput;
    private String Tanggal;
    private int Jumlah;
    private String Nama;
    private int ID;
    private int status = 0;
    
    void setData(String KodeOutput,String Tanggal,String Nama,String Jumlah,String ID){
            
            //pada pengisian ID hanya boleh input berupa angka
            if(KodeOutput.matches("[0-9]*")){
                //Pengecekan agar Kode Input yang diinputkan dimulai dari angka 55
                //dan panjang Kode Input Input sebanyak 5 angka
                if(KodeOutput.length() == 5 && 66000 <= Integer.parseInt(KodeOutput) && 67000 > Integer.parseInt(KodeOutput)){
                  setKodeOutput(Integer.parseInt(KodeOutput));  
                }else{
                    setStatus(2);
                }
            }else{
                setStatus(1);
            }
            
            if(Tanggal != null){
                setTanggal(Tanggal);
            }else{
                setStatus(3);
            }
            
            //Pengecekan apakah sudah memilih nama barang 
            if(Nama.equalsIgnoreCase("- Pilih Nama Barang -")){
                setStatus(4);
            }else{
                setNama(Nama);
            }
            
            //pada pengisian Jumlah hanya boleh input berupa angka            
            if(Jumlah.matches("[0-9]*")){
                this.Jumlah=Integer.parseInt(Jumlah);                
            }else{
                setStatus(5);
            }
            
            //Pengecekan apakah sudah memilih ID Supplier 
            if(ID.equalsIgnoreCase("- Pilih ID Supplier -")){
                setStatus(6);
            }else{
                setID(Integer.parseInt(ID));
            }
    }
    
    //method mengganti isi variabel
    void  setKodeOutput(int KodeOutput){
        this.KodeOutput =KodeOutput;
    }
    void  setTanggal(String Tanggal){
        this.Tanggal = Tanggal;
    }
    void  setNama(String Nama){
        this.Nama =Nama;
    }
    void  setJumlah(int Jumlah){
        this.Jumlah =Jumlah;
    }
    void  setID(int ID){
        this.ID =ID;
    }
    void setStatus(int Status){
        this.status = Status;
    }
    
    //method mendapatkan nilai variabel
    public int getKodeOutput(){
        return this.KodeOutput;
    }
    public String getTanggal(){
        return this.Tanggal;
    }
    public int getJumlah(){
        return this.Jumlah;
    }
    public String getNama(){
        return this.Nama;
    }
    public int getID(){
        return this.ID;
    }  
    public int isStatus(){
        return this.status;
    }
}
