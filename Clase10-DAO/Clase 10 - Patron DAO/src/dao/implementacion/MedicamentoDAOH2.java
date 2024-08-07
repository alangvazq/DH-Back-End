package dao.implementacion;

import dao.BD;
import dao.IDao;
import modelo.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MedicamentoDAOH2 implements IDao<Medicamento> {

    private static final Logger LOGGER = Logger.getLogger(MedicamentoDAOH2.class);

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        LOGGER.info("Comenzamos a persistir un medicamento");

        Connection connection = null;

        try {
            connection = BD.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO MEDICAMENTOS (" +
                    "NOMBRE, LABORATORIO, CANTIDAD, PRECIO, CODIGO) VALUES (?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, medicamento.getNombre());
            preparedStatement.setString(2, medicamento.getLaboratorio());
            preparedStatement.setInt(3, medicamento.getCantidad());
            preparedStatement.setDouble(4, medicamento.getPrecio());
            preparedStatement.setInt(5, medicamento.getCodigo());

            preparedStatement.execute();

            ResultSet rs = preparedStatement.getGeneratedKeys();

            while (rs.next()) {
                medicamento.setId(rs.getInt(1));

                LOGGER.info("Este es el medicamento que se guardó " +
                        medicamento.getNombre());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return medicamento;
    }

    @Override
    public Medicamento buscarPorId(Integer id) {
        //TODO lógica de como buscar por Id
        LOGGER.info("Comenzamos a buscar por Id");

        Connection connection = null;
        Medicamento medicamento = null;
        try {
            connection = BD.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM MEDICAMENTOS WHERE ID = ?");
            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet rs = preparedStatement.executeQuery();



            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String laboratorio = rs.getString("laboratorio");
                Integer cantidad = rs.getInt("cantidad");
                Double precio = rs.getDouble("precio");
                Integer codigo = rs.getInt("codigo");

                medicamento = new Medicamento(nombre, laboratorio, cantidad, precio, codigo);

                LOGGER.info("Este es el medicamento que se guardó " +
                        nombre);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return medicamento;
    }
}
