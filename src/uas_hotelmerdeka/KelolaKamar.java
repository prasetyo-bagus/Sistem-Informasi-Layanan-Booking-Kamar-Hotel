package uas_hotelmerdeka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

public class KelolaKamar extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;

    public KelolaKamar() {
        initComponents();
        conn = KoneksiDB.Koneksidbhotel(); 
        simpanDalamTabel();
        
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Cek apakah klik dilakukan di luar tabel
                if (!evt.getSource().equals(tblKelolaKamar)) {
                    btnTambah.setEnabled(true);
                    tfNomerKamar.setEnabled(true); // Aktifkan kembali tfNomerKamar
                    
                    tfNomerKamar.setText("");
                    tfTipeKamar.setText("");
                    tfHarga.setText("");
                    tfKapasitas.setText("");
                    tfFasilitas.setText("");
                }
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfFasilitas = new javax.swing.JTextField();
        tfNomerKamar = new javax.swing.JTextField();
        tfHarga = new javax.swing.JTextField();
        tfKapasitas = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        tfTipeKamar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKelolaKamar = new javax.swing.JTable();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1980, 1080));
        jPanel1.setSize(new java.awt.Dimension(1980, 1080));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 132, 255));
        jLabel2.setText("KELOLA KAMAR HOTEL MERDEKA");

        jPanel2.setBackground(new java.awt.Color(242, 242, 245));

        jLabel3.setText("Nomer Kamar");

        jLabel4.setText("Tipe Kamar");

        jLabel1.setText("Harga / Malam");

        jLabel6.setText("Kapasitas");

        jLabel5.setText("Fasilitas");

        btnTambah.setBackground(new java.awt.Color(52, 199, 89));
        btnTambah.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 204, 10));
        btnEdit.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 59, 48));
        btnHapus.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfKapasitas, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                            .addComponent(tfHarga, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfNomerKamar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfFasilitas)
                            .addComponent(tfTipeKamar))))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfNomerKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfTipeKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        tblKelolaKamar.setBackground(new java.awt.Color(242, 242, 247));
        tblKelolaKamar.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        tblKelolaKamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "No Kamar", "Tipe Kamar", "Harga / Malam", "Kapasitas", "Fasilitas"
            }
        ));
        tblKelolaKamar.setFocusable(false);
        tblKelolaKamar.setGridColor(new java.awt.Color(242, 242, 245));
        tblKelolaKamar.setRequestFocusEnabled(false);
        tblKelolaKamar.setRowHeight(40);
        tblKelolaKamar.setSelectionBackground(new java.awt.Color(10, 132, 255));
        tblKelolaKamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKelolaKamarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKelolaKamar);

        btnKembali.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        btnKembali.setText("⇤");
        btnKembali.setBorder(null);
        btnKembali.setBorderPainted(false);
        btnKembali.setContentAreaFilled(false);
        btnKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnKembali.setFocusTraversalKeysEnabled(false);
        btnKembali.setSelected(true);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKembali)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(580, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnKembali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(436, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed

        
        String noKamar = tfNomerKamar.getText();
        String tipeKamar = tfTipeKamar.getText();
        String hargapermalam = tfHarga.getText();
        String kapasitas = tfKapasitas.getText();
        String fasilitas = tfFasilitas.getText();
        
        if (tfNomerKamar.getText().isEmpty() || tfTipeKamar.getText().isEmpty() || tfHarga.getText().isEmpty() ||
            tfKapasitas.getText().isEmpty() || tfFasilitas.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Semua field wajib diisi.");
        return;
        }
        
        if (!hargapermalam.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Harga Harus Berupa Angka");
        return;
    }
        
        try {
            String sql = "INSERT INTO Kamar (nomor_kamar, tipe_kamar, harga_per_malam, kapasitas, fasilitas) VALUES (?, ?, ?, ?, ?) ";
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, noKamar);
            pst.setString(2, tipeKamar);
            pst.setString(3, hargapermalam);
            pst.setString(4, kapasitas);
            pst.setString(5, fasilitas);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data Kamar Berhasil Di Simpan");   
            
            tfNomerKamar.setText("");
            tfTipeKamar.setText("");
            tfHarga.setText("");
            tfKapasitas.setText("");
            tfFasilitas.setText("");
            
            simpanDalamTabel();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Harga Harus Berupa Angka");
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan SQL");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Tambahkan");
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new Dashboard().setVisible(true);
        new KelolaKamar().setVisible(false);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        if (tfNomerKamar.getText().isEmpty() || tfTipeKamar.getText().isEmpty() || tfHarga.getText().isEmpty() ||
            tfKapasitas.getText().isEmpty() || tfFasilitas.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Semua field wajib diisi.");
        return;
        }
        
        try {
            java.sql.Connection conn=KoneksiDB.Koneksidbhotel();
            String sql= " UPDATE Kamar SET "
                    + "nomor_kamar = '"+tfNomerKamar.getText() + "',"
                    + "tipe_kamar = '"+tfTipeKamar.getText() + "',"
                    + "harga_per_malam = '"+tfHarga.getText() + "',"
                    + "kapasitas = '"+tfKapasitas.getText() + "',"
                    + "fasilitas = '"+tfFasilitas.getText() + "'"
                    + "where nomor_kamar = '" + tfNomerKamar.getText()+ "'";
            
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil.");
                    
            tfNomerKamar.setText("");
            tfTipeKamar.setText("");
            tfHarga.setText("");
            tfKapasitas.setText("");
            tfFasilitas.setText("");
            tfNomerKamar.enable();
            tfNomerKamar.requestFocusInWindow();
            
            simpanDalamTabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Edit Data Gagal");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblKelolaKamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKelolaKamarMouseClicked
        int row = tblKelolaKamar.getSelectedRow();
        tfNomerKamar.setText(tblKelolaKamar.getModel().getValueAt(row, 1).toString());
        tfTipeKamar.setText(tblKelolaKamar.getModel().getValueAt(row, 2).toString());
        tfHarga.setText(tblKelolaKamar.getModel().getValueAt(row, 3).toString());
        tfKapasitas.setText(tblKelolaKamar.getModel().getValueAt(row, 5).toString());
        tfFasilitas.setText(tblKelolaKamar.getModel().getValueAt(row, 4).toString());
        tfNomerKamar.disable();
        
        btnTambah.setEnabled(false);
    }//GEN-LAST:event_tblKelolaKamarMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        
        String noKamar = tfNomerKamar.getText();
    if (noKamar.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Pilih data kamar yang akan dihapus.");
        return;
    }
    
    // Konfirmasi penghapusan
    int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus kamar ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            // Koneksi ke database dan query penghapusan
            java.sql.Connection conn = KoneksiDB.Koneksidbhotel();
            String sql = "DELETE FROM Kamar WHERE nomor_kamar = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, noKamar);
            
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data Kamar Berhasil Dihapus.");
                
                // Bersihkan text field setelah penghapusan
                tfNomerKamar.setText("");
                tfTipeKamar.setText("");
                tfHarga.setText("");
                tfKapasitas.setText("");
                tfFasilitas.setText("");
                
                tfNomerKamar.setEnabled(true);
                tfNomerKamar.requestFocusInWindow();
                
                // Perbarui tabel
                simpanDalamTabel();
            } else {
                JOptionPane.showMessageDialog(null, "Data Kamar Tidak Ditemukan.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan SQL.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Kamar Gagal Dihapus.");
        }
    }    
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(KelolaKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaKamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKelolaKamar;
    private javax.swing.JTextField tfFasilitas;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfKapasitas;
    private javax.swing.JTextField tfNomerKamar;
    private javax.swing.JTextField tfTipeKamar;
    // End of variables declaration//GEN-END:variables

    private void simpanDalamTabel() {
        /*
            |Membuat Tampilan Model Tabel
        */
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("No Kamar");
        model.addColumn("Tipe Kamar");
        model.addColumn("Harga / Malam");
        model.addColumn("Kapasitas");
        model.addColumn("Fasilitas");
        
        /*
            |Menampilkan Data Ke Dalam Tabel
        */
        try {
            int no = 1;
            String sql = " SELECT * FROM Kamar";
            java.sql.Connection conn=(Connection)KoneksiDB.Koneksidbhotel();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()) {
                model.addRow(new Object[] {
                    no++,
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6)
                });
            }
            tblKelolaKamar.setModel(model);
        } catch (Exception e) {
            
        }
    }
}
