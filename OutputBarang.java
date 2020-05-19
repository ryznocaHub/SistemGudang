/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SistemGudang.program;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.SistemGudang.program.editKapasitas;
import com.SistemGudang.program.editStok;

/**
 *
 * @author USER
 */
public class OutputBarang extends javax.swing.JFrame {
    
    //Proses mengkosongkan tampilan tabel
    public void kosongkanTblOutput(){
            txtKode.setEditable(true);
            txtKode.setText(null);
            tbNama.setSelectedItem(this);
            txtJumlah.setText(null);
            tbID.setSelectedItem(this);
        }
    
    //Proses mengeluarkan data pada tabel O_barang
    private void tampilkanDataOutput(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Pengambilan");
        model.addColumn("Tanggal");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah");
        model.addColumn("ID Karyawan");
        
        try{
            String sql = "SELECT * FROM Output_barang";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                                          res.getString(2),
                                          res.getString(3),
                                          res.getString(4),
                                          res.getString(5),       
                                         });
            }
            tabelOutput.setModel(model);
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    //Proses menampilkan DropDown dari Nama Barang yang sudah ada di Gudang
    public void tampilkanNama()
    {   
        try
        {   
            String sql = "select nama_barang from barang";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next())
            {
                tbNama.addItem(res.getString("Nama_Barang"));
            }
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
    
    //Proses menampilkan DropDown dari ID Supplier yang sudah ada
    public void tampilkanID()
    {   
        try
        {   
            String sql = "select ID_Karyawan from Karyawan";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next())
            {
                tbID.addItem(res.getString("ID_Karyawan"));
            }
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());            
        }
    }
    /**
     * Creates new form OutputBarang
     */
    public OutputBarang() {
        initComponents();
        tampilkanDataOutput();
        tampilkanNama();
        tampilkanID();
        kosongkanTblOutput();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbTambah_Output = new javax.swing.JButton();
        tbKembali_Output = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tbHapus_Output = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelOutput = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tbID = new javax.swing.JComboBox<>();
        tbNama = new javax.swing.JComboBox<>();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtJumlah = new javax.swing.JTextField();
        txtKode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbTambah_Output.setText("Tambah Data");
        tbTambah_Output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambah_OutputActionPerformed(evt);
            }
        });
        getContentPane().add(tbTambah_Output, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 212, -1, -1));

        tbKembali_Output.setText("Kembali");
        tbKembali_Output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKembali_OutputActionPerformed(evt);
            }
        });
        getContentPane().add(tbKembali_Output, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 212, -1, -1));

        jLabel5.setText("Tanggal Output");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 78, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Form Output Barang");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 11, -1, -1));

        jLabel2.setText("Jumlah");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        tbHapus_Output.setText("Hapus");
        tbHapus_Output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapus_OutputActionPerformed(evt);
            }
        });
        getContentPane().add(tbHapus_Output, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 212, -1, -1));

        jLabel4.setText("ID Karyawan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 172, -1, -1));

        tabelOutput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelOutput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelOutputMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelOutput);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, 430, 100));

        jLabel3.setText("Nama Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel6.setText("Kode Output");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 51, -1, -1));

        tbID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih ID Karyawan -" }));
        getContentPane().add(tbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 169, 160, -1));

        tbNama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Nama Barang -" }));
        getContentPane().add(tbNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, -1));

        txtDate.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 160, 30));
        getContentPane().add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 160, -1));

        txtKode.setText("jTextField1");
        getContentPane().add(txtKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbTambah_OutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambah_OutputActionPerformed
        // TODO add your handling code here:
        
        //Proses mendapatkan data tanggal
        String tampilan ="yyyy-MM-dd" ;
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(txtDate.getDate()));

        DataOutputBarang x = new DataOutputBarang();
        x.setData(txtKode.getText(), tanggal, tbNama.getSelectedItem().toString() , txtJumlah.getText(), tbID.getSelectedItem().toString());
        //jika data yang diOutputkan sesuai dengan kriteria
        //maka akan dilakukan pengOutputan data pada database
        if(x.isStatus()==0){
            //mencoba terhubung dengan database da
            try{
                int reply = JOptionPane.showConfirmDialog(null, "Keluarkan "+txtJumlah.getText()+" barang ?");
                if(reply == JOptionPane.YES_OPTION){
                    //Query Penambahan data pada Database
                    String sql = "INSERT INTO Output_Barang VALUES ('"+x.getKodeOutput()+"','"+x.getTanggal()+"','"+x.getNama()+"','"+x.getJumlah()+"','"+x.getID()+"')";
                    java.sql.Connection conn = (Connection)Konfig.configDB();
                    java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                    pstm.execute();
                    
                    //Proses Pengurangan Stok pada barang yang tidak jadi dimasukkan
                    editStok A = new editStok(tbNama.getSelectedItem().toString(),tabelOutput);
                    int  jumlahUpdate= Integer.parseInt(tabelOutput.getValueAt(0, 0).toString()) - Integer.parseInt(txtJumlah.getText());
                    A.Query(tbNama.getSelectedItem().toString(), jumlahUpdate,tabelOutput);

                    //Penambahan Kapasitas pada tabel Gudang dikarenakan barang berkurang
                    String Kode =tabelOutput.getValueAt(0, 0).toString();
                    editKapasitas B = new editKapasitas(tabelOutput.getValueAt(0, 0).toString() , tabelOutput);
                    jumlahUpdate = Integer.parseInt(tabelOutput.getValueAt(0, 0).toString()) + Integer.parseInt(txtJumlah.getText());
                    B.Query(Kode, jumlahUpdate);
                    
                    
                    kosongkanTblOutput();
                    tampilkanDataOutput();
                }else if(reply == JOptionPane.NO_OPTION){
                    kosongkanTblOutput();
                }                
                //jika tidak terhubung dengan database
                //atau terdapat masalah pada proses berinteraksi dengan database
            }catch(HeadlessException | SQLException e){
                //JOptionPane.showMessageDialog(this, e.getMessage());
                JOptionPane.showMessageDialog(this, "Kode Gudang sudah terdaftar \nSilahkan masukkan Kode lain");

            }
        }else if(x.isStatus()== 1 ){
            JOptionPane.showMessageDialog(null, "Terdapat Huruf pada pengisian Kode Output ");
            txtKode.setText(null);
        }else if(x.isStatus()==2){
            JOptionPane.showMessageDialog(null, "Kode Output dimulai dengan kode 66 dan berjumlah 5 angka \n\n Example : 44009");
            txtKode.setText(null);
        }else if(x.isStatus()==3){
            JOptionPane.showMessageDialog(null, "Silahkan pilih Tanggal Output");
            txtDate.setDate(null);
        }else if(x.isStatus()==4){
            JOptionPane.showMessageDialog(null, "Silahkan pilih nama barang ");
            tbNama.setSelectedItem(this);
        }else if(x.isStatus()==5){
            JOptionPane.showMessageDialog(null, "Terdapat huruf pada pengisian Jumlah");
            txtJumlah.setText(null);
        }else if(x.isStatus()==6){
            JOptionPane.showMessageDialog(null, "Silahkan pilih ID Supplier");
            tbID.setSelectedItem(this);
        }
    }//GEN-LAST:event_tbTambah_OutputActionPerformed

    private void tbHapus_OutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapus_OutputActionPerformed
        // TODO add your handling code here:

        //Proses Penambahan Stok pada barang yang baru masuk
        
        editStok A = new editStok(tbNama.getSelectedItem().toString(),tabelOutput);
        //Proses menentukan nilai Stok Baru
        int  jumlahUpdate= Integer.parseInt(tabelOutput.getValueAt(0, 0).toString()) + Integer.parseInt(txtJumlah.getText());
        JOptionPane.showConfirmDialog(null, Integer.toString(jumlahUpdate));
        //Mengganti nilai stok pada barang dan mencari Kode Gudang
        A.Query(tbNama.getSelectedItem().toString(), jumlahUpdate,tabelOutput);
                
        //Pengurangan Kapasitas pada tabel Gudang
        String Kode =tabelOutput.getValueAt(0, 0).toString();
        //dapet kode gudang
        editKapasitas B = new editKapasitas(tabelOutput.getValueAt(0, 0).toString() , tabelOutput);
        //dapet kapasitas
        jumlahUpdate = Integer.parseInt(tabelOutput.getValueAt(0, 0).toString()) - Integer.parseInt(txtJumlah.getText());
        B.Query(Kode, jumlahUpdate);
        /////////////////////////////////////////////////
        try{
            int reply = JOptionPane.showConfirmDialog(null, " Jika anda menghapus data, Stok barang akan bertambah \n apakah anda yakin untuk menghapus data ?");
            if(reply == JOptionPane.YES_OPTION){
                String sql = "DELETE FROM Output_Barang WHERE Kode_PengOutputan = '"+txtKode.getText()+"'";
                java.sql.Connection conn = (Connection)Konfig.configDB();
                java.sql.PreparedStatement pstm = conn.prepareCall(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null,"Berhasil Menghapus Data");
                kosongkanTblOutput();
                tampilkanDataOutput();
            }else if(reply == JOptionPane.NO_OPTION){
                kosongkanTblOutput();
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showConfirmDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tbHapus_OutputActionPerformed

    private void tabelOutputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelOutputMouseClicked
        // TODO add your handling code here:
        int baris = tabelOutput.rowAtPoint(evt.getPoint());

        String kode = tabelOutput.getValueAt(baris,0).toString();
        txtKode.setText(kode);

        String  date= tabelOutput.getValueAt(baris,1).toString();
        txtDate.setDateFormatString(date);

        String  nama= tabelOutput.getValueAt(baris,2).toString();
        tbNama.setSelectedItem(nama);

        String  Jumlah= tabelOutput.getValueAt(baris,3).toString();
        txtJumlah.setText(Jumlah);

        String  ID= tabelOutput.getValueAt(baris,4).toString();
        tbID.setSelectedItem(ID);
    }//GEN-LAST:event_tabelOutputMouseClicked

    private void tbKembali_OutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKembali_OutputActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tbKembali_OutputActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OutputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutputBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabelOutput;
    private javax.swing.JButton tbHapus_Output;
    private javax.swing.JComboBox<String> tbID;
    private javax.swing.JButton tbKembali_Output;
    private javax.swing.JComboBox<String> tbNama;
    private javax.swing.JButton tbTambah_Output;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKode;
    // End of variables declaration//GEN-END:variables
}
