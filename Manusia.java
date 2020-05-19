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
public class Manusia {
        private int ID;
        private String Nama;
        private String No_Hp;
        private String Alamat;
        private int status=0;
                
        //method mendapatkan nilai variabel
        int isStatus(){
            return this.status;
        }       
        int getID(){
            return this.ID;
        }
        String getNama(){
            return this.Nama;
        }
        String getNo_Hp(){
            return this.No_Hp;
        }
        String getAlamat(){
            return this.Alamat;
        }
        
        //method mengganti isi variabel
        void setID(int ID){
            this.ID=ID;
        }
        void setNama(String Nama){
            this.Nama = Nama;
        }
        void setNoHp(String No_Hp){
            this.No_Hp = No_Hp;
        }
        void setAlamat(String Alamat){
            this.Alamat = Alamat;
        }
        void setStatus(int status){
            this.status = status;
        }
}
