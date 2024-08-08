package dao.impl;

import dao.BD;
import dao.IDao;
import model.Avion;

import java.sql.*;
import java.util.List;

public class AvionDAOH2 implements IDao<Avion> {
    @Override
    public Avion registrar(Avion avion) {
        Connection connection = null;

        try {
            connection = BD.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO MEDICAMENTOS (" +
                    "MARCA, MODELO, MATRICULA, FECHA) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, avion.getMarca());
            preparedStatement.setString(2, avion.getModelo());
            preparedStatement.setString(3, avion.getMatricula());
            preparedStatement.setString(4, avion.getFecha());

            preparedStatement.execute();

            ResultSet rs = preparedStatement.getGeneratedKeys();

            while (rs.next()){
                avion.setId(rs.getLong(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return avion;
    }

    @Override
    public Avion buscar(Long id) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public List<Avion> buscarTodos() {
        return List.of();
    }
}
