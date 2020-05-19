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
public class tambahBarang {
    //Proses pengambilan Data Stok pada tabel barang
    public void tambahStok(String nama, javax.swing.JTable tabel)
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
}
