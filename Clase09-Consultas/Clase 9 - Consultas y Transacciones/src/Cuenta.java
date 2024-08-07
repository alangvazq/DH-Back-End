import java.sql.*;

public class Cuenta {

    private static final String DROP_CREATE = "DROP TABLE IF EXISTS ODONTOLOGOS; CREATE " +
            "TABLE ODONTOLOGOS (" +
            "ID INT PRIMARY KEY," +
            "APELLIDO VARCHAR(100) NOT NULL," +
            "NOMBRE VARCHAR(100) NOT NULL," +
            "MATRICULA VARCHAR(100) NOT NULL)";

    private static final String SLQ_INSERT = "INSERT INTO ODONTOLOGOS VALUES (?,?,?,?)";

    private static final String SELECT_ALL = "SELECT * FROM ODONTOLOGOS";

    private static final String SQL_UPDATE = "UPDATE ODONTOLOGOS SET MATRICULA=? WHERE ID=?";



    public static void main(String[] args) {
        //Conectarnos a la BD
        Connection connection = null;

        try {

            //NOS CONECTAMOS A LA BD
            connection = getConnection();

            //CREAR LA TABLA
            Statement statement = connection.createStatement();
            statement.execute(DROP_CREATE);

            //INSERTAR VALORES -> DE FORMA DINÁMICA -> PREPARED STATEMENT
            PreparedStatement preparedStatement = connection.prepareStatement(SLQ_INSERT);
            preparedStatement.setInt(1,1);
            preparedStatement.setString(2, "García");
            preparedStatement.setString(3, "Alan");
            preparedStatement.setString(4, "123a");

            preparedStatement.execute();

            //GUARDAMOS LOS DATOS DE LA BD EN JAVA
            ResultSet rs = statement.executeQuery(SELECT_ALL);

            //LO CONSULTAMOS
            while (rs.next()) {
                System.out.println("El odontólogo con id: " +
                        rs.getInt(1) + " y apellido " +
                        rs.getString(2) + " y nombre " +
                        rs.getString(3) + " matricula " +
                        rs.getString(4));
            }

            //----------------------------------------------------------------------------------------------------
            //VAMOS A HACER UNA TRANSACCIÓN
            connection.setAutoCommit(false);

            //VOLVEMOS A HACER UNA OPERACIÓN DINAMICA CON PS
            PreparedStatement preparedStatement1 = connection.prepareStatement(SQL_UPDATE);
            preparedStatement1.setString(1,"456");
            preparedStatement1.setInt(2,1);

            preparedStatement1.execute();

            //----------------------------------------------------------------------------------------------------
            //FORZAR A QUE OCURRA UNA EXCEPCIÓN
            // int excepcionForzada = 4/0;
            //----------------------------------------------------------------------------------------------------

            //UNA BUENA PRÁCTICA
            connection.setAutoCommit(true);

            //GUARDARMOS EN JAVA LOS DATOS DE LA BD
            ResultSet rs1 = statement.executeQuery(SELECT_ALL);

            System.out.println("Este es la matricula luego de la transacción");

            while (rs1.next()) {
                System.out.println("El odontólogo con id: " +
                        rs1.getInt(1) + " y apellido " +
                        rs1.getString(2) + " y nombre " +
                        rs1.getString(3) + " matricula " +
                        rs1.getString(4));
            }



        } catch (Exception e) {
            try {
                //SE ARROJA LA EXCEPCIÓN Y SE EJECUTA EL ROLLBACK
                connection.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();

        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.getMessage();
            }
        }

        //----------------------------------------------------------------------------------------------------
        //VOLVER A CONECTARNOS A LA BD PARA CONSULTAR SI EL SALDO EFECTIVAMETE NO CAMBIO
        /*
        try {
            connection = getConnection();

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SELECT_ALL);

            System.out.println("Este es el saldo luego de la transacción");

            while (resultSet.next()) {
                System.out.println("La cuenta con id: " +
                        resultSet.getInt(1) + " y número de cuenta " +
                        resultSet.getInt(2) + " y titular " +
                        resultSet.getString(3) + " tiene como saldo " +
                        resultSet.getDouble(4));
            }



        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.getMessage();
            }
        }

    */

    }


    //método para conectarnos a la BD
    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:./202407", "sa", "sa");
    }

}
