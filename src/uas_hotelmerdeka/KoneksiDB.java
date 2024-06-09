package uas_hotelmerdeka;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class KoneksiDB {
    public static Connection connectionmysql;

    public static Connection Koneksidbhotel() {
        if (connectionmysql == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/HotelMerdeka";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                connectionmysql = DriverManager.getConnection(url, user, pass);
                JOptionPane.showMessageDialog(null, "Koneksi Berhasil🔥🔥🔥");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ups, Koneksi Gagal");
            }
        }
        return connectionmysql;
    }
}
