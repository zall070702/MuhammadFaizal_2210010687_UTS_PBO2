/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiuts;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class Koneksi1 {
        public static Connection koneksiTS() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/utsdata"; // Ganti "aplikasiuts" dengan nama database Anda.
            String user = "root"; // Ganti sesuai username MySQL Anda.
            String password = ""; // Ganti sesuai password MySQL Anda.
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
        return conn;
    }
}
