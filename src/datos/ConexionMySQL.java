package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    // 1. Configurar los datos de la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/tu_base_de_datos";
    private static final String USER = "root";
    private static final String PASSWORD = "tu_contraseña";

    public static void main(String[] args) {
        System.out.println("Intentando conectar a la base de datos...");

        // 2. Establecer la conexión
        try (Connection conectar = DriverManager.getConnection(URL, USER, PASSWORD)) {

            if (conectar != null) {
                System.out.println("¡Conexión exitosa a MySQL!");
            }

        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos:");
            e.printStackTrace();
        }
    }
}