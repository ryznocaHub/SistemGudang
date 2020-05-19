/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SistemGudang.program;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.SistemGudang.program.editStok;
import com.SistemGudang.program.editKapasitas;
/**
 *
 * @author USER
 */
public class Barang extends javax.swing.JFrame {
    public void kosongkanTblBarang(){
        txtNama_Barang.setEditable(true);
        txtNama_Barang.setText(null);
        txtKode_Gudang.setSelectedItem(this);
        txtHarga.setText(null);
        txtStok.setText(null);
    }
    
    private void tampilkanDataBarang(){
        //pembuatan tabel sesuai dengan data yang akan ditampilkan
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Barang");
        model.addColumn("Harga");
        model.addColumn("Stok");
        model.addColumn("Kode Gudang");
        
        try{
            String sql = "SELECT * FROM barang";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            //penelusuran seluruh data pada table didalam database
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                                          res.getString(2),
                                          res.getString(3),
                                          res.getString(4),
                                          });
            }
            tabelBarang.setModel(model);
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
        
    public void tampilkanList()
    {   
        try
        {   
            String sql = "select * from gudang";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next())
            {
                txtKode_Gudang.addItem(res.getString("Kode_Gudang"));
            }
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Tidak ada data gudang \nSilahkan input data gudang terlebih dahulu");
            //
        }
    }
    
    /**
     * Creates new form Barang
     */
    public Barang() {
        initComponents();
        
        tampilkanDataBarang();
        tampilkanList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTambah_Barang = new javax.swing.JButton();
        tbKembali_Barang = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tbUpdate_Barang = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tbHapus_Barang = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        txtNama_Barang = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        txtKode_Gudang = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbTambah_Barang.setText("Tambah Data");
        tbTambah_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambah_BarangActionPerformed(evt);
            }
        });

        tbKembali_Barang.setText("Kembali");
        tbKembali_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKembali_BarangActionPerformed(evt);
            }
        });

        jLabel5.setText("Kode Gudang penyimpanan");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Data Barang");

        tbUpdate_Barang.setText("Update");
        tbUpdate_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbUpdate_BarangActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama");

        tbHapus_Barang.setText("Hapus");
        tbHapus_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapus_BarangActionPerformed(evt);
            }
        });

        jLabel4.setText("Stok");

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        txtNama_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama_BarangActionPerformed(evt);
            }
        });

        jLabel3.setText("Harga");

        txtKode_Gudang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Kode Gudang -" }));
        txtKode_Gudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKode_GudangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tbKembali_Barang)
                        .addGap(31, 31, 31)
                        .addComponent(tbUpdate_Barang)
                        .addGap(43, 43, 43)
                        .addComponent(tbTambah_Barang)
                        .addGap(33, 33, 33)
                        .addComponent(tbHapus_Barang))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKode_Gudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtKode_Gudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbKembali_Barang)
                    .addComponent(tbUpdate_Barang)
                    .addComponent(tbTambah_Barang)
                    .addComponent(tbHapus_Barang))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbTambah_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambah_BarangActionPerformed
        // TODO add your handling code here:
                      
        //Pengurangan Kapasitas pada tabel Gudang
        editKapasitas B = new editKapasitas(txtKode_Gudang.getSelectedItem().toString() , tabelBarang);
        int jumlahUpdate = Integer.parseInt(tabelBarang.getValueAt(0, 0).toString()) - Integer.parseInt(txtStok.getText());
        if(jumlahUpdate < 0){
            jumlahUpdate = Math.abs(jumlahUpdate);
            JOptionPane.showMessageDialog(this, "Terdapat "+jumlahUpdate+" Barang tidak dapat diinputkan \n dikarenakan kapasitas Gudang yang melebihi batas");
            jumlahUpdate=0;
        }
        B.Query(txtKode_Gudang.getSelectedItem().toString(), jumlahUpdate);
        /////////////////////////////////////////////////
        DataBarang x = new DataBarang();
        x.setData(txtNama_Barang.getText() , txtHarga.getText(), txtStok.getText(),txtKode_Gudang.getSelectedItem().toString());
        //jika data yang diinputkan sesuai dengan kriteria
        //maka akan dilakukan penginputan data pada database
        if(x.isStatus()==0){
            //mencoba terhubung dengan database
            try{
                int reply = JOptionPane.showConfirmDialog(null, "Simpan Data Barang ?");
                if(reply == JOptionPane.YES_OPTION){
                    //Query Penambahan data pada Database
                    String sql = "INSERT INTO Barang VALUES ('"+x.getNama()+"','"+x.getHarga()+"','"+x.getStok()+"','"+x.getKodegdg()+"')";
                    java.sql.Connection conn = (Connection)Konfig.configDB();
                    java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                    pstm.execute();
                    kosongkanTblBarang();
                    tampilkanDataBarang();
                }else if(reply == JOptionPane.NO_OPTION){
                    kosongkanTblBarang();
                }
                //jika tidak terhubung dengan database
            }catch(HeadlessException | SQLException e){
                //JOptionPane.showMessageDialog(this, e.getMessage());
                JOptionPane.showMessageDialog(this, "Nama Barang sudah terdaftar \nSilahkan masukkan Nama lain");

            }
        }else if(x.isStatus()==1){
            JOptionPane.showMessageDialog(null, "Terdapat angka pada pengisian Nama Barang");
            txtNama_Barang.setText(null);
        }else if(x.isStatus()==2){
            JOptionPane.showMessageDialog(null, "Terdapat huruf pada pengisian Harga Barang ");
            txtHarga.setText(null);
        }else if(x.isStatus()==3){
            JOptionPane.showMessageDialog(null, "Terdapat huruf pada pengisian Stok Barang ");
            txtStok.setText(null);
        }else if(x.isStatus()==4){
            JOptionPane.showMessageDialog(null, "Silahkan pilih Kode Gudang");
            txtKode_Gudang.setSelectedItem(null);
        }
    }//GEN-LAST:event_tbTambah_BarangActionPerformed

    private void tbUpdate_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbUpdate_BarangActionPerformed
        // TODO add your handling code here:

        DataBarang x = new DataBarang();
        x.setData( txtNama_Barang.getText() , txtHarga.getText(), txtStok.getText() , txtKode_Gudang.getSelectedItem().toString());
        if(x.isStatus()==0){
            try{
                //Query Update database
                 String sql = "UPDATE Barang SET Nama_Barang = '"+x.getNama()+"',Harga ='"+x.getHarga()+"',Stok = '"+x.getStok()+"',Kode_Gudang = '"+x.getKodegdg()+"'WHERE Nama_Barang = '"+txtNama_Barang.getText()+"'" ;
                 java.sql.Connection conn = (Connection)Konfig.configDB();
                 java.sql.PreparedStatement pstm = conn.prepareCall(sql);
                 pstm.execute();
                 JOptionPane.showMessageDialog(null,"Berhasil Mengubah Data");
                 kosongkanTblBarang();
                 tampilkanDataBarang();
            }catch(HeadlessException | SQLException e){
                //JOptionPane.showMessageDialog(this, e.getMessage());
                JOptionPane.showMessageDialog(this, "Nama Barang sudah terdaftar \nSilahkan masukkan Nama lain");
                txtNama_Barang.setText(null);
            }
        }else if(x.isStatus()==1){
            JOptionPane.showMessageDialog(null, "Terdapat angka pada pengisian Nama Barang");
            txtNama_Barang.setText(null);
        }else if(x.isStatus()==2){
            JOptionPane.showMessageDialog(null, "Terdapat huruf pada pengisian Harga Barang ");
            txtHarga.setText(null);
        }else if(x.isStatus()==3){
            JOptionPane.showMessageDialog(null, "Terdapat huruf pada pengisian Stok Barang ");
            txtStok.setText(null);
        }else if(x.isStatus()==4){
            JOptionPane.showMessageDialog(null, "Silahkan pilih Kode Gudang");
            txtKode_Gudang.setSelectedItem(null);
        }
    }//GEN-LAST:event_tbUpdate_BarangActionPerformed

    private void tbHapus_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapus_BarangActionPerformed
        // TODO add your handling code here:
        try{
            //Pengambilan data kapasitas gudang
            editKapasitas B = new editKapasitas(txtKode_Gudang.getSelectedItem().toString() , tabelBarang);
            int jumlahUpdate = Integer.parseInt(tabelBarang.getValueAt(0, 0).toString()) + Integer.parseInt(txtStok.getText());
            
            int reply = JOptionPane.showConfirmDialog(null, "apakah anda yakin untuk menghapus data ?");
            if(reply == JOptionPane.YES_OPTION){
                //Penambahan Kapasitas gudang akibat pengurangan barang
                B.Query(txtKode_Gudang.getSelectedItem().toString(), jumlahUpdate);
                //Penghapusan Data dari database
                String sql = "DELETE FROM Barang WHERE Nama_Barang = '"+txtNama_Barang.getText()+"'";
                java.sql.Connection conn = (Connection)Konfig.configDB();
                java.sql.PreparedStatement pstm = conn.prepareCall(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null,"Berhasil Menghapus Data");
                kosongkanTblBarang();
                tampilkanDataBarang();
            }else if(reply == JOptionPane.NO_OPTION){
                kosongkanTblBarang();
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showConfirmDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_tbHapus_BarangActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        // TODO add your handling code here:
        int baris = tabelBarang.rowAtPoint(evt.getPoint());

        String  nama= tabelBarang.getValueAt(baris,0).toString();
        txtNama_Barang.setText(nama);

        String  harga= tabelBarang.getValueAt(baris,1).toString();
        txtHarga.setText(harga);

        String  stok= tabelBarang.getValueAt(baris,2).toString();
        txtStok.setText(stok);        
        
        String  kodee= tabelBarang.getValueAt(baris,3).toString();
        txtKode_Gudang.setSelectedItem(kodee);

    }//GEN-LAST:event_tabelBarangMouseClicked

    private void txtNama_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama_BarangActionPerformed

    private void txtKode_GudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKode_GudangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKode_GudangActionPerformed

    private void tbKembali_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKembali_BarangActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tbKembali_BarangActionPerformed

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
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    public javax.swing.JTable tabelBarang;
    private javax.swing.JButton tbHapus_Barang;
    private javax.swing.JButton tbKembali_Barang;
    private javax.swing.JButton tbTambah_Barang;
    private javax.swing.JButton tbUpdate_Barang;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JComboBox<String> txtKode_Gudang;
    private javax.swing.JTextField txtNama_Barang;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}