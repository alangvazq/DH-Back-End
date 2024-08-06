import org.h2.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    private static final String SQL_TABLE_CREATE = "DROP TABLE IF EXISTS USUARIO; CREATE TABLA USUARIO;"
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOMBRE varchar(100) NOT NULL,"
            + " EMAIL varchar(100) NOT NULL,"
            + " SUELDO numeric(15, 2) NOT NULL"
            + ")";

    private static final String SQL_INSERT = "INSERT INTO USUARIO (ID, NOMBRE, EMAIL, SUELDO) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE USUARIO SET SUELDO=? WHERE EMAIL=?";

    public static void main(String[] args) {

    }

    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:" + "./Database/transaction", "root", "sa");
    }
}
