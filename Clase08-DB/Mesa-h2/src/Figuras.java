import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Figuras {
    public static void main(String[] args) throws Exception {
        // Cargar el controlador JDBC de H2
        Class.forName("org.h2.Driver").newInstance();

        // Conectar a la base de datos H2
        // El user y el password se determinan para la base
        // url = ruta donde se guarda figuras.mv.db
        Connection connection = DriverManager.getConnection("jdbc:h2:"+
                "./Database/figuras", "root", "myPassword");
        Statement stmt = connection.createStatement();

        // Crear la tabla y agregar registros
        String createSql = "DROP TABLE IF EXISTS FIGURAS;" +
                "CREATE TABLE FIGURAS(ID INT PRIMARY KEY, NAME VARCHAR(255), COLOR VARCHAR(255));" +
                "INSERT INTO FIGURAS VALUES(1, 'Círculo', 'Rojo');" +
                "INSERT INTO FIGURAS VALUES(2, 'Círculo', 'Verde');" +
                "INSERT INTO FIGURAS VALUES(3, 'Cuadrado', 'Amarillo');" +
                "INSERT INTO FIGURAS VALUES(4, 'Cuadrado', 'Blanco');" +
                "INSERT INTO FIGURAS VALUES(5, 'Cuadrado', 'Azul');";
        stmt.execute(createSql);

        // Consulta
        String sql = "SELECT * FROM FIGURAS";
        ResultSet rd = stmt.executeQuery(sql);

        System.out.println("Lista de todas las figuras:");
        while (rd.next()){
            System.out.println("id: "+ rd.getInt(1)+ " Figura: " + rd.getString(2) + " Color: " + rd.getString(3));
        }
        rd.close(); // Cerrar el ResultSet después de procesarlo

        // Consulta
        String sqlRojo = "SELECT * FROM FIGURAS WHERE COLOR = 'Rojo'";
        ResultSet rd1 = stmt.executeQuery(sqlRojo);

        System.out.println("Ver los círculos color rojo...");
        while (rd1.next()){
            System.out.println("id: "+ rd1.getInt(1)+ " Figura: " + rd1.getString(2) + " Color: " + rd1.getString(3));
        }
        rd1.close(); // Cerrar el segundo ResultSet después de procesarlo

        stmt.close();
        connection.close();
    }
}
