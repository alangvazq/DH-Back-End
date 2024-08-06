import org.h2.Driver;

import java.sql.*;

public class Test {
    private static final String SQL_TABLE_CREATE = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO"
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOMBRE varchar(100) NOT NULL,"
            + " EMAIL varchar(100) NOT NULL,"
            + " SUELDO numeric(15, 2) NOT NULL"
            + ");";

    private static final String SQL_INSERT = "INSERT INTO USUARIO (ID, NOMBRE, EMAIL, SUELDO) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE USUARIO SET SUELDO=? WHERE EMAIL=?";

    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario("Pedro", "p@gmail.com", 10d);
        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_TABLE_CREATE);

            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);

            // Se comienza el Insert

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, usuario.getNombre());
            preparedStatement.setString(3, usuario.getEmail());
            preparedStatement.setDouble(4, usuario.getSueldo());

            preparedStatement.execute();

            // Empezar transaction
            // Al hacer algo directamente a la DB se aplica el commit directamente, es true predeterminado
            connection.setAutoCommit(false);

            PreparedStatement preparedUpdate = connection.prepareStatement(SQL_UPDATE);
            preparedUpdate.setDouble(1, usuario.subirSueldo(10d));
            preparedUpdate.setString(2, usuario.getEmail());
            preparedUpdate.execute();

            // Si puede hacer commit poner de nuevo en true
            connection.commit();

            connection.setAutoCommit(true);

            String sql = "SELECT * FROM USUARIO";
            Statement stmt = connection.createStatement();
            ResultSet rd = stmt.executeQuery(sql);

            while (rd.next()){
                System.out.println(rd.getInt(1) + rd.getString(2)+ rd.getString(3)+ rd.getDouble(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }

    }

    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:" + "./Database/transaction", "root", "sa");
    }
}
