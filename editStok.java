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
import com.SistemGudang.program.editKapasitas;
/**
 *
 * @author USER
 */
public class editStok {
    editStok(String nama, javax.swing.JTable tabel)
    {   DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Stok Barang Saat ini");
        try
        {   
            String sql = "select Stok from barang where Nama_Barang ='"+nama+"'";
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
    
    public void Query(String Nama , int Jumlah, javax.swing.JTable tabel){
        try
        {   
            String sql = "Update Barang SET Stok = '"+Jumlah+"'where Nama_Barang = '"+Nama+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareCall(sql);
            pstm.execute();
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());            
        }
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Gudang");
        //dapet kode gudang
        try{   
            String sql = "select Kode_Gudang from barang where Nama_Barang = '"+Nama+"'";
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
}