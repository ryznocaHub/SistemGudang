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
public class DataSupplier extends Manusia{
    
    private String NamaPerusahaan;
    
    void setData(String ID,String Nama, String No_Hp, String Perusahaan, String Alamat){
            setAlamat(Alamat);
            setNamaPerusahaan(Perusahaan);
            //pada pengisian ID hanya boleh input berupa angka
            if(ID.matches("[0-9]*")){
                //Pengecekan agar ID yang diinputkan dimulai dari angka 22 
                //dan panjang ID Supplier sebanyak 5 angka
                if(ID.length() == 5 && 22000 <= Integer.parseInt(ID) && 23000 > Integer.parseInt(ID)){
                  setID(Integer.parseInt(ID));  
                }else{
                    setStatus(5);
                }
            }else{
                setStatus(1);
            }
            
            //pada pengisian Nama hanya boleh input berupa Huruf dan spasi 
            if(Nama.matches("[a-z,A-Z,' ']*")){
                 setNama(Nama);             
            }else{
                setStatus(2);
            }
            
            //pada pengisian Nomor Handphone hanya boleh input berupa angka
            //jumlah angka yang diinputkan pada No Hp sebanyak 11-13 digit angka
            if(No_Hp.length()<13 && No_Hp.length()>10){
                if(No_Hp.matches("[0-9]*")){
                    setNoHp(No_Hp);
                }else{
                    setStatus(3);
                }
            }else{
                setStatus(4);
            }
        }
    
    //method mendapatkan nilai variabel
    String getNamaPerusahaan(){
        return this.NamaPerusahaan;
    }
    
    //method mengganti isi variabel
    void setNamaPerusahaan(String NamaPerusahaan){
        this.NamaPerusahaan = NamaPerusahaan;
    }
}
