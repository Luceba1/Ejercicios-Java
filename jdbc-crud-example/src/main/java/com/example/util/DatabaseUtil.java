package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil {

    private static final String DB_URL = "jdbc:h2:./data/productosdb";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static void closeResources(Connection conn, Statement stmt) {
        try {
            if (stmt != null) stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void initDatabase() {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = getConnection();
            stmt = conn.createStatement();

            // Eliminar tabla si existe
            stmt.execute("DROP TABLE IF EXISTS productos");

            // Crear tabla con restricción de nombre único
            String sql = "CREATE TABLE productos (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nombre VARCHAR(100) NOT NULL UNIQUE, " +
                    "descripcion VARCHAR(255), " +
                    "precio DECIMAL(10,2) NOT NULL, " +
                    "stock INT DEFAULT 0)";
            stmt.execute(sql);

            System.out.println("Base de datos inicializada correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, stmt);
        }
    }
}