package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {
    private static final String DROP_CREATE = "DROP TABLE IF EXISTS FLOTA; CREATE " +
            "TABLE FLOTA (" +
            "ID INT PRIMARY KEY AUTO_INCREMENT," +
            "MARCA VARCHAR(100) NOT NULL," +
            "MODELO VARCHAR(100) NOT NULL," +
            "MATRICULA INT NOT NULL," +
            "FECHA NUMERIC(10,2) NOT NULL)";

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:./DB/flota", "sa", "sa");
    }

    public static void createTable() {
        Connection connection = null;

        try {
            connection = getConnection();

            Statement statement = connection.createStatement();
            statement.execute(DROP_CREATE);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
