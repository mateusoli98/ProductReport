package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Alert;
import resource.ViewAlert;

abstract public class ConnectionFactory {

    private static Connection conn = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        return DriverManager.getConnection(
                Environment.DATABASE_URL,
                Environment.DATABASE_NAME,
                Environment.DATABASE_PASSWORD
        );
    }

    public static void closeConnection(Connection conn, PreparedStatement ps) {
        try {
            conn.close();
            ps.close();
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public static boolean executeQuery(String query) {
        try {
            conn = getConnection();
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Error: " + ex);
            ViewAlert.show(new Alert("Erro interno", "Erro", JOptionPane.ERROR_MESSAGE));
        }

        return false;
    }

    public static ResultSet executeQueryR(String query) {
        try {
            conn = getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Error: " + ex);
            ViewAlert.show(new Alert("Erro interno", "Erro", JOptionPane.ERROR_MESSAGE));
        }
        return rs;
    }
}
