import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Empleado {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");

        Connection connection = DriverManager.getConnection("jdbc:h2:"+
                "./Database/empleado", "root", "myPassword");
        Statement statement = connection.createStatement();

        String createSql = "DROP TABLE IF EXISTS EMPLEADO;" +
                "CREATE TABLE EMPLEADO(ID INT PRIMARY KEY, NOMBRE VARCHAR(255), EDAD INT, EMPRESA VARCHAR(255), FECHA DATE);" +
                "INSERT INTO EMPLEADO VALUES(1, 'Hugo', 20, 'Digital', '2023-12-01');" +
                "INSERT INTO EMPLEADO VALUES(2, 'Paco', 20, 'Google', '2023-12-01');" +
                "INSERT INTO EMPLEADO VALUES(3, 'Luis', 20, 'Facebook', '2023-12-01');";
        statement.execute(createSql);

        String sql = "SELECT * FROM EMPLEADO";
        ResultSet rd = statement.executeQuery(sql);

        while (rd.next()){
            System.out.println("id: " + rd.getInt(1) + " Nombre: " + rd.getString(2) + " Edad: " + rd.getInt(3) + " Empresa: " + rd.getString(4) + " Fecha: " + rd.getDate(5));
        }
        rd.close();

        statement.close();
        connection.close();
    }
}
