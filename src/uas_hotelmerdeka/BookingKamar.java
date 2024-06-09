package uas_hotelmerdeka;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;


public class BookingKamar extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;

    public BookingKamar() {
        initComponents();
        relasiNoKamar();
        simpanDalamTabel();
        conn = KoneksiDB.Koneksidbhotel();
        
        tfTipeKamar.setEnabled(false);
        tfHargaPerMalam.setEnabled(false);
        tfFasilitas.setEnabled(false);
        tfKapasitas.setEnabled(false);
        tfTotalHarga.setEnabled(false);
        
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Cek apakah klik dilakukan di luar tabel
                if (!evt.getSource().equals(tblBookingKamar)) {
                    btnTambah.setEnabled(true);
                    tfNamapelanggan.setEnabled(true);
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
        btnHapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfKapasitas = new javax.swing.JTextField();
        tfInap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfFasilitas = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbNomerKamar = new javax.swing.JComboBox<>();
        btnEdit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNamapelanggan = new javax.swing.JTextField();
        tfTipeKamar = new javax.swing.JTextField();
        tfTotalHarga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfHargaPerMalam = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBookingKamar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1980, 1080));
        jPanel1.setSize(new java.awt.Dimension(1980, 1080));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 132, 255));
        jLabel2.setText("BOOKING KAMAR HOTEL MERDEKA");

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

        btnHapus.setBackground(new java.awt.Color(255, 59, 48));
        btnHapus.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel1.setText("Harga Per Malam");

        jLabel7.setText("Fasilitas");

        tfInap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInapActionPerformed(evt);
            }
        });

        jLabel3.setText("Nomer Kamar");

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

        cbNomerKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nomer kamar" }));
        cbNomerKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomerKamarActionPerformed(evt);
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

        jLabel9.setText("Kapasitas");

        jLabel6.setText("Nama pelanggan");

        jLabel4.setText("Tipe Kamar");

        jLabel8.setText("Total Harga");

        tblBookingKamar.setBackground(new java.awt.Color(242, 242, 247));
        tblBookingKamar.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        tblBookingKamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "No Kamar", "Tipe Kamar", "Harga / Malam", "Kapasitas", "Fasilitas", "Lama Inap", "Total Harga", "Admin"
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
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfKapasitas)
                            .addComponent(tfFasilitas)
                            .addComponent(tfHargaPerMalam)
                            .addComponent(tfTipeKamar)
                            .addComponent(cbNomerKamar, 0, 241, Short.MAX_VALUE)
                            .addComponent(tfNamapelanggan)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfTotalHarga, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfInap, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(603, 603, 603))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfNamapelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbNomerKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfTipeKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfHargaPerMalam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(19, 19, 19)
                                        .addComponent(tfFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfInap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addContainerGap(406, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
    
    String noKamar = cbNomerKamar.getSelectedItem().toString();
    String tipeKamar = tfTipeKamar.getText();
    String harga = tfHargaPerMalam.getText();
    String pelanggan = tfNamapelanggan.getText();
    String inap = tfInap.getText();
    String fasilitas = tfFasilitas.getText();
    String kapasitas = tfKapasitas.getText();
    String total = tfTotalHarga.getText();
    
    if (pelanggan.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nama Pelanggan Wajib Diisi.");
        return;
    } else if (!pelanggan.matches("[a-zA-Z ]+")) {
        JOptionPane.showMessageDialog(null, "Nama Pelanggan Hanya Boleh Berisi Huruf.");
        return;
    }

    if (!inap.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Lama Inap Hanya Boleh Angka");
        return;
    }

    int jumlahInap = Integer.parseInt(inap);
    int hargaPerMalam = Integer.parseInt(harga);
    int totalHarga = jumlahInap * hargaPerMalam;

    tfTotalHarga.setText(String.valueOf(totalHarga));

    try {
        java.sql.Connection conn = KoneksiDB.Koneksidbhotel();
        
        // Mendapatkan kamar_id berdasarkan nomor kamar
        String getKamarId = "SELECT kamar_id FROM Kamar WHERE nomor_kamar = ?";
        java.sql.PreparedStatement getKamarIdPst = conn.prepareStatement(getKamarId);
        getKamarIdPst.setString(1, noKamar);
        java.sql.ResultSet rs = getKamarIdPst.executeQuery();
        int kamarId = 0;
        if (rs.next()) {
            kamarId = rs.getInt("kamar_id");
        } else {
            JOptionPane.showMessageDialog(null, "Nomor kamar tidak ditemukan.");
            return;
        }
        
        String sql = "INSERT INTO PendaftaranHotel (kamar_id, nama_pelanggan, lama_inap, total_harga) VALUES (?, ?, ?, ?)";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        
        pst.setInt(1, kamarId);
        pst.setString(2, pelanggan);
        pst.setInt(3, jumlahInap);
        pst.setInt(4, totalHarga);

        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data Pendaftaran Berhasil Disimpan");

        cbNomerKamar.setSelectedIndex(0);
        tfTipeKamar.setText("");
        tfHargaPerMalam.setText("");
        tfNamapelanggan.setText("");
        tfInap.setText("");
        tfFasilitas.setText("");
        tfKapasitas.setText("");
        tfTotalHarga.setText("");
        
        simpanDalamTabel();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal Menyimpan Data Pendaftaran: " + e.getMessage());
    }


    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       
    String noKamar = cbNomerKamar.getSelectedItem().toString();
    String pelanggan = tfNamapelanggan.getText();
    String inap = tfInap.getText();
    String total = tfTotalHarga.getText();

    // Mengecek apakah ada data yang dipilih untuk diedit
    if (pelanggan.isEmpty() || inap.isEmpty() || total.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Pilih data yang ingin diedit.");
        return;
    }

    if (!inap.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Lama inap harus berupa angka.");
        return;
    }

    if (!total.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Total harga harus berupa angka.");
        return;
    }

    try {
        java.sql.Connection conn = KoneksiDB.Koneksidbhotel();

        // Mendapatkan kamar_id berdasarkan nomor kamar
        String getKamarIdSql = "SELECT kamar_id FROM Kamar WHERE nomor_kamar = ?";
        java.sql.PreparedStatement getKamarIdPst = conn.prepareStatement(getKamarIdSql);
        getKamarIdPst.setString(1, noKamar);
        java.sql.ResultSet rs = getKamarIdPst.executeQuery();
        int kamarId = 0;
        if (rs.next()) {
            kamarId = rs.getInt("kamar_id");
        } else {
            JOptionPane.showMessageDialog(null, "Nomor kamar tidak ditemukan.");
            return;
        }

        String sql = "UPDATE PendaftaranHotel SET kamar_id = ?, lama_inap = ?, total_harga = ? WHERE nama_pelanggan = ?";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);

        int jumlahInap = Integer.parseInt(inap);
        int totalHarga = Integer.parseInt(total);

        pst.setInt(1, kamarId);
        pst.setInt(2, jumlahInap);
        pst.setInt(3, totalHarga);
        pst.setString(4, pelanggan);

        int updatedRows = pst.executeUpdate();

        if (updatedRows > 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil diperbarui.");
        } else {
            JOptionPane.showMessageDialog(null, "Gagal memperbarui data. Data tidak ditemukan.");
        }

        // Perbarui tabel setelah mengedit
        simpanDalamTabel();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal memperbarui data: " + e.getMessage());
    }



    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String pelanggan = tfNamapelanggan.getText();

    // Mengecek apakah ada data yang dipilih untuk dihapus
    if (pelanggan.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus.");
        return;
    }

    int confirmation = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
    if (confirmation == JOptionPane.YES_OPTION) {
        try {
            java.sql.Connection conn = KoneksiDB.Koneksidbhotel();
            String sql = "DELETE FROM PendaftaranHotel WHERE nama_pelanggan = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, pelanggan);

            int deletedRows = pst.executeUpdate();

            if (deletedRows > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
                cbNomerKamar.setSelectedIndex(0);
                tfTipeKamar.setText("");
                tfHargaPerMalam.setText("");
                tfNamapelanggan.setText("");
                tfInap.setText("");
                tfFasilitas.setText("");
                tfKapasitas.setText("");
                tfTotalHarga.setText("");
                
                simpanDalamTabel();
                
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menghapus data. Data tidak ditemukan.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void cbNomerKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomerKamarActionPerformed
         String noKamar = cbNomerKamar.getSelectedItem().toString();
    try {
        java.sql.Connection conn = KoneksiDB.Koneksidbhotel();
        String sql = "SELECT tipe_kamar, harga_per_malam, kapasitas, fasilitas FROM Kamar WHERE nomor_kamar = ?";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, noKamar);
        java.sql.ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            tfTipeKamar.setText(rs.getString("tipe_kamar"));
            tfHargaPerMalam.setText(rs.getString("harga_per_malam"));
            tfKapasitas.setText(rs.getString("kapasitas"));
            tfFasilitas.setText(rs.getString("fasilitas"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal Memuat Data Kamar");
        }
    }//GEN-LAST:event_cbNomerKamarActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new Dashboard().setVisible(true);
        new BookingKamar().setVisible(false);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tfInapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInapActionPerformed
        updateTotal();
    }//GEN-LAST:event_tfInapActionPerformed

    private void tblBookingKamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookingKamarMouseClicked
  
        int row = tblBookingKamar.getSelectedRow();
        tfNamapelanggan.setText(tblBookingKamar.getModel().getValueAt(row, 1).toString());
       
        tfNamapelanggan.disable();

        btnTambah.setEnabled(false);
    }//GEN-LAST:event_tblBookingKamarMouseClicked

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
            java.util.logging.Logger.getLogger(BookingKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingKamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbNomerKamar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBookingKamar;
    private javax.swing.JTextField tfFasilitas;
    private javax.swing.JTextField tfHargaPerMalam;
    private javax.swing.JTextField tfInap;
    private javax.swing.JTextField tfKapasitas;
    private javax.swing.JTextField tfNamapelanggan;
    private javax.swing.JTextField tfTipeKamar;
    private javax.swing.JTextField tfTotalHarga;
    // End of variables declaration//GEN-END:variables

    
    private void relasiNoKamar() {
    try {
        java.sql.Connection conn = KoneksiDB.Koneksidbhotel();
        String sql = "SELECT nomor_kamar FROM Kamar";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        java.sql.ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            cbNomerKamar.addItem(rs.getString("nomor_kamar"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal Memuat Nomor Kamar");
        }
    }

    
    
    private void updateTotal() {
        String inapText = tfInap.getText();
    if (inapText.matches("\\d+")) {
        int jumlahInap = Integer.parseInt(inapText);
        int hargaPerMalam = Integer.parseInt(tfHargaPerMalam.getText());
        int totalHarga = jumlahInap * hargaPerMalam;
        tfTotalHarga.setText(String.valueOf(totalHarga));
    } else {
        JOptionPane.showMessageDialog(null, "Jumlah Inap Harus Berupa Angka");
        }
    }
    
    private void simpanDalamTabel() {
    /*
        |Membuat Tampilan Model Tabel
    */
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("No");
    model.addColumn("Nama Pelanggan");
    model.addColumn("Nomor Kamar");
    model.addColumn("Tipe Kamar");
    model.addColumn("Harga per Malam");
    model.addColumn("Fasilitas");
    model.addColumn("Kapasitas");
    model.addColumn("Lama Inap");
    model.addColumn("Total Harga");

    /*
        |Menampilkan Data Ke Dalam Tabel
    */
    try {
        int no = 1;
        String sql = "SELECT pendaftaranHotel.nama_pelanggan, pendaftaranHotel.lama_inap, pendaftaranHotel.total_harga, " +
                     "Kamar.nomor_kamar, Kamar.tipe_kamar, Kamar.harga_per_malam, Kamar.kapasitas, Kamar.fasilitas " +
                     "FROM pendaftaranHotel " +
                     "JOIN Kamar ON pendaftaranHotel.kamar_id = Kamar.kamar_id";
        System.out.println("Query SQL: " + sql); // Debugging
        java.sql.Connection conn = (Connection) KoneksiDB.Koneksidbhotel();
        if (conn != null) {
            System.out.println("Koneksi ke database berhasil.");
        } else {
            System.out.println("Koneksi ke database gagal.");
        }
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet res = stm.executeQuery(sql);

        java.sql.ResultSetMetaData rsmd = res.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        System.out.println("Kolom yang diambil dari ResultSet:");
        for (int i = 1; i <= columnsNumber; i++) {
            System.out.print(rsmd.getColumnName(i) + " ");
        }
        System.out.println(); // Debugging

        while (res.next()) {
            System.out.println("Data ditemukan: " + res.getString("nama_pelanggan")); // Debugging
            model.addRow(new Object[]{
                no++,
                res.getString("nama_pelanggan"),
                res.getString("nomor_kamar"),
                res.getString("tipe_kamar"),
                res.getDouble("harga_per_malam"),
                res.getString("fasilitas"),
                res.getString("kapasitas"),
                res.getInt("lama_inap"),
                res.getDouble("total_harga")
            });
        }
        tblBookingKamar.setModel(model);
        System.out.println("Data berhasil ditampilkan di tabel.");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Gagal menampilkan data: " + e.getMessage());
        }
    }    
}
