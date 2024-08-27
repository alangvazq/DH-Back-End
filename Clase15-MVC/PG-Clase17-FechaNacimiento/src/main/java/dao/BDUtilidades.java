package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BDUtilidades {

    private static final String CONTROLADOR = "org.h2.Driver";
    private static final String URL = "jdbc:h2:./ejercicioClase17;INIT=RUNSCRIPT FROM 'schema.sql'";
    private static final String USUARIO = "sa";
    private static final String CONTRASENIA = "";

    private static String REINICIAR_BB = """
            TRUNCATE TABLE nacimientos RESTART IDENTITY;
        """;

    public static Connection getConexion() throws ClassNotFoundException, SQLException {
        Class.forName(CONTROLADOR);
        return DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
    }

    public static void limpiarBaseDatos() throws ClassNotFoundException, SQLException {
        try (Connection conn = BDUtilidades.getConexion();
             Statement stmt = conn.createStatement()
        ) {
            stmt.executeUpdate(REINICIAR_BB);
        }
    }
}
