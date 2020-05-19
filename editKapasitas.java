/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SistemGudang.program;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class editKapasitas {
    //Proses pengambilan Data Kapasitas pada tabel Gudang
    editKapasitas(String Kode,javax.swing.JTable tabel)
    {   DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kapasitas Gudang Saat ini");
        try
        {   
            String sql = "select Kapasitas from Gudang where Kode_Gudang ='"+Kode+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next())
            {
                model.addRow(new Object[]{res.getString(1)});
            }
            tabel.setModel(model);
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());            
        }
    }
    public void Query(String Nama, int Jumlah){
        try{
            String sql = "Update Gudang SET Kapasitas = '"+Jumlah+"'where Kode_Gudang = '"+Nama+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareCall(sql);
            pstm.execute();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
