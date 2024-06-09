package uas_hotelmerdeka;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pembayaran extends javax.swing.JFrame {


    public Pembayaran() {
        initComponents();
        relasiNamaPelanggan();
        simpanDalamTabel();
        
        tfInap.setEnabled(false);
        tfTotalHarga.setEnabled(false);
        
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Cek apakah klik dilakukan di luar tabel
                if (!evt.getSource().equals(tblBookingKamar)) {
                    btnTambah.setEnabled(true);
                    cbNamapelanggan.setEnabled(true);
                }
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        tfInap = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfTotalHarga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBookingKamar = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        cbNamapelanggan = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        cbMetodeBayar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1980, 1080));
        jPanel1.setSize(new java.awt.Dimension(1980, 1080));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 132, 255));
        jLabel2.setText("PEMBAYARAN KAMAR HOTEL MERDEKA");

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

        tfInap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInapActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(52, 199, 89));
        btnTambah.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel5.setText("Lama Inap");

        btnEdit.setBackground(new java.awt.Color(255, 204, 10));
        btnEdit.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel6.setText("Nama pelanggan");

        jLabel8.setText("Total Harga");

        tblBookingKamar.setBackground(new java.awt.Color(242, 242, 247));
        tblBookingKamar.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        tblBookingKamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Nama", "No Kamar"
            }
        ));
        tblBookingKamar.setFocusable(false);
        tblBookingKamar.setGridColor(new java.awt.Color(242, 242, 245));
        tblBookingKamar.setRequestFocusEnabled(false);
        tblBookingKamar.setRowHeight(40);
        tblBookingKamar.setSelectionBackground(new java.awt.Color(10, 132, 255));
        tblBookingKamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookingKamarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBookingKamar);

        jLabel10.setText("Status");

        jLabel11.setText("Metode Pembayaran");

        btnHapus.setBackground(new java.awt.Color(255, 59, 48));
        btnHapus.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        cbNamapelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nama pelanggan" }));
        cbNamapelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNamapelangganActionPerformed(evt);
            }
        });

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Success" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        cbMetodeBayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Transfer" }));
        cbMetodeBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMetodeBayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfInap, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbNamapelanggan, javax.swing.GroupLayout.Alignment.TRAILING, 0, 224, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMetodeBayar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfTotalHarga)
                                    .addComponent(cbStatus, javax.swing.GroupLayout.Alignment.TRAILING, 0, 226, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(597, 597, 597))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnKembali)
                        .addGap(225, 225, 225)
                        .addComponent(jLabel2)
                        .addGap(557, 557, 557))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnKembali))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbNamapelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfInap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMetodeBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38)
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(475, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new Dashboard().setVisible(true);
        new Pembayaran().setVisible(false);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tfInapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInapActionPerformed

    }//GEN-LAST:event_tfInapActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
    
    String nama = cbNamapelanggan.getSelectedItem().toString();
    String inap = tfInap.getText();
    String total = tfTotalHarga.getText();
    String bayar = cbMetodeBayar.getSelectedItem().toString();
    String status = cbStatus.getSelectedItem().toString();
    
    // Validasi input
    if (nama.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nama pelanggan wajib diisi.");
        return;
    } else if (!nama.matches("[a-zA-Z\\s]+")) {
        JOptionPane.showMessageDialog(null, "Nama pelanggan hanya boleh berisi huruf dan spasi.");
        return;
    }

    if (!inap.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Jumlah Inap Harus Berupa Angka");
        return;
    }
    
    if (!total.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Total Harga Harus Berupa Angka");
        return;
    }

    int jumlahInap = Integer.parseInt(inap);
    int totalHarga = Integer.parseInt(total);
    
    try {
        java.sql.Connection conn = KoneksiDB.Koneksidbhotel();
        // Ambil pendaftaran_id berdasarkan nama pelanggan
        String sqlPendaftaran = "SELECT pendaftaran_id FROM PendaftaranHotel WHERE nama_pelanggan = ?";
        java.sql.PreparedStatement pstPendaftaran = conn.prepareStatement(sqlPendaftaran);
        pstPendaftaran.setString(1, nama);
        java.sql.ResultSet rs = pstPendaftaran.executeQuery();
        
        int pendaftaranId = 0;
        if (rs.next()) {
            pendaftaranId = rs.getInt("pendaftaran_id");
        } else {
            JOptionPane.showMessageDialog(null, "Pendaftaran tidak ditemukan untuk pelanggan ini.");
            return;
        }

        String sql = "INSERT INTO Pembayaran (pendaftaran_id, metode_pembayaran, status_pembayaran) VALUES (?, ?, ?)";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        
        pst.setInt(1, pendaftaranId);
        pst.setString(2, bayar);
        pst.setString(3, status);

        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data Pembayaran Berhasil Disimpan");

        cbNamapelanggan.setSelectedIndex(0);
        tfInap.setText("");
        tfTotalHarga.setText("");
        cbMetodeBayar.setSelectedIndex(0);
        cbStatus.setSelectedIndex(0);
        
        simpanDalamTabel();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal Menyimpan Data Pembayaran: " + e.getMessage());
    }
    
    
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String nama = cbNamapelanggan.getSelectedItem().toString();
        String inap = tfInap.getText();
        String total = tfTotalHarga.getText();
        String bayar = cbMetodeBayar.getSelectedItem().toString();
        String status = cbStatus.getSelectedItem().toString();

        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama pelanggan wajib diisi.");
            return;
        } else if (!nama.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(null, "Nama pelanggan hanya boleh berisi huruf dan spasi.");
            return;
        }

        if (!inap.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Jumlah Inap Harus Berupa Angka");
            return;
        }
        
        if (!total.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Total Harga Harus Berupa Angka");
            return;
        }

        int jumlahInap = Integer.parseInt(inap);
        int totalHarga = Integer.parseInt(total);

        try {
            java.sql.Connection conn = KoneksiDB.Koneksidbhotel();
            // Ambil pendaftaran_id berdasarkan nama pelanggan
            String sqlPendaftaran = "SELECT pendaftaran_id FROM PendaftaranHotel WHERE nama_pelanggan = ?";
            java.sql.PreparedStatement pstPendaftaran = conn.prepareStatement(sqlPendaftaran);
            pstPendaftaran.setString(1, nama);
            java.sql.ResultSet rs = pstPendaftaran.executeQuery();
            
            int pendaftaranId = 0;
            if (rs.next()) {
                pendaftaranId = rs.getInt("pendaftaran_id");
            } else {
                JOptionPane.showMessageDialog(null, "Pendaftaran tidak ditemukan untuk pelanggan ini.");
                return;
            }

            String sql = "UPDATE Pembayaran SET metode_pembayaran = ?, status_pembayaran = ? WHERE pendaftaran_id = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, bayar);
            pst.setString(2, status);
            pst.setInt(3, pendaftaranId);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Pembayaran Berhasil Diupdate");

            cbNamapelanggan.setSelectedIndex(0);
            tfInap.setText("");
            tfTotalHarga.setText("");
            cbMetodeBayar.setSelectedIndex(0);
            cbStatus.setSelectedIndex(0);
            
            simpanDalamTabel();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Mengupdate Data Pembayaran: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblBookingKamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookingKamarMouseClicked

    int row = tblBookingKamar.getSelectedRow();
    if (row >= 0) {
        cbNamapelanggan.setSelectedItem(tblBookingKamar.getModel().getValueAt(row, 1).toString());
        tfInap.setText(tblBookingKamar.getModel().getValueAt(row, 2).toString());
        tfTotalHarga.setText(tblBookingKamar.getModel().getValueAt(row, 3).toString());
        cbMetodeBayar.setSelectedItem(tblBookingKamar.getModel().getValueAt(row, 5).toString());
        cbStatus.setSelectedItem(tblBookingKamar.getModel().getValueAt(row, 4).toString());

        cbNamapelanggan.setEnabled(false);
        btnTambah.setEnabled(false);
    }



    }//GEN-LAST:event_tblBookingKamarMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String nama = cbNamapelanggan.getSelectedItem().toString();

        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama pelanggan wajib diisi.");
            return;
        } else if (!nama.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(null, "Nama pelanggan hanya boleh berisi huruf dan spasi.");
            return;
        }

        try {
            java.sql.Connection conn = KoneksiDB.Koneksidbhotel();
            // Ambil pendaftaran_id berdasarkan nama pelanggan
            String sqlPendaftaran = "SELECT pendaftaran_id FROM PendaftaranHotel WHERE nama_pelanggan = ?";
            java.sql.PreparedStatement pstPendaftaran = conn.prepareStatement(sqlPendaftaran);
            pstPendaftaran.setString(1, nama);
            java.sql.ResultSet rs = pstPendaftaran.executeQuery();
            
            int pendaftaranId = 0;
            if (rs.next()) {
                pendaftaranId = rs.getInt("pendaftaran_id");
            } else {
                JOptionPane.showMessageDialog(null, "Pendaftaran tidak ditemukan untuk pelanggan ini.");
                return;
            }

            String sql = "DELETE FROM Pembayaran WHERE pendaftaran_id = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, pendaftaranId);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Pembayaran Berhasil Dihapus");

            cbNamapelanggan.setSelectedIndex(0);
            tfInap.setText("");
            tfTotalHarga.setText("");
            cbMetodeBayar.setSelectedIndex(0);
            cbStatus.setSelectedIndex(0);
            
            simpanDalamTabel();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Menghapus Data Pembayaran: " + e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void cbNamapelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNamapelangganActionPerformed
        String cbNamaPelanggan = cbNamapelanggan.getSelectedItem().toString();
    try {
        java.sql.Connection conn = KoneksiDB.Koneksidbhotel();
        String sql = "SELECT nama_pelanggan, lama_inap, total_harga FROM PendaftaranHotel WHERE nama_pelanggan = ?";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, cbNamaPelanggan);
        java.sql.ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            tfInap.setText(rs.getString("lama_inap"));
            tfTotalHarga.setText(rs.getString("total_harga"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal Memuat  Nama Pelanggan");
        }
    }//GEN-LAST:event_cbNamapelangganActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void cbMetodeBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMetodeBayarActionPerformed
        
    }//GEN-LAST:event_cbMetodeBayarActionPerformed

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
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbMetodeBayar;
    private javax.swing.JComboBox<String> cbNamapelanggan;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBookingKamar;
    private javax.swing.JTextField tfInap;
    private javax.swing.JTextField tfTotalHarga;
    // End of variables declaration//GEN-END:variables


    private void relasiNamaPelanggan() {
    try {
        java.sql.Connection conn = KoneksiDB.Koneksidbhotel();
        String sql = "SELECT nama_pelanggan FROM PendaftaranHotel";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        java.sql.ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            cbNamapelanggan.addItem(rs.getString("nama_pelanggan"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal Memuat Nama pelanggan");
        }
    }
    
    
    private void simpanDalamTabel() {
    // Membuat Tampilan Model Tabel
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("No");
    model.addColumn("Nama");
    model.addColumn("Lama Inap");
    model.addColumn("Total Harga");
    model.addColumn("Metode Pembayaran");
    model.addColumn("Status Pembayaran");

    // Menampilkan Data Ke Dalam Tabel
    try {
        int no = 1;
        String sql = "SELECT Pembayaran.pembayaran_id, PendaftaranHotel.nama_pelanggan, "
                   + "PendaftaranHotel.lama_inap, PendaftaranHotel.total_harga, Pembayaran.metode_pembayaran, "
                   + "Pembayaran.status_pembayaran "
                   + "FROM Pembayaran "
                   + "JOIN PendaftaranHotel ON Pembayaran.pendaftaran_id = PendaftaranHotel.pendaftaran_id";
        java.sql.Connection conn = KoneksiDB.Koneksidbhotel();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet res = stm.executeQuery(sql);
        
        while (res.next()) {
            model.addRow(new Object[]{
                no++,
                res.getString("nama_pelanggan"),
                res.getInt("lama_inap"),
                res.getInt("total_harga"),
                res.getString("metode_pembayaran"),
                res.getString("status_pembayaran")
            });
        }
        tblBookingKamar.setModel(model);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Gagal menampilkan data: " + e.getMessage());
        }
    }
}
