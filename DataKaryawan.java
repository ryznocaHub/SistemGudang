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
public class DataKaryawan extends Manusia{
    private String Gender;
    private String Jabatan;
    
    void setData(String ID,String Nama, String No_Hp, String Alamat){
            setAlamat(Alamat);  
            //pada pengisian ID hanya boleh input berupa angka
            if(ID.matches("[0-9]*")){
                //Pengecekan agar ID yang diinputkan dimulai dari angka 11 
                //dan panjang ID karyawan sebanyak 5 angka
                if(ID.length() == 5 && 11000 <= Integer.parseInt(ID) && 12000 > Integer.parseInt(ID)){
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
    
    //method mengganti isi variabel
    void setGender(String Gender){
        this.Gender = Gender;
    }    
    void setJabatan(String Jabatan){
        this.Jabatan = Jabatan;
    }
    
    //method mendapatkan nilai variabel
    String getGender(){
        return this.Gender;
    }    
    String getJabatan(){
        return this.Jabatan;
    }
}