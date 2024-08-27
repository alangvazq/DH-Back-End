package dao.impl;

import dao.BDUtilidades;
import dao.IDao;
import modelo.Nacimiento;

import java.sql.*;

public class NacimientoDaoH2 implements IDao<Nacimiento> {
    @Override
    public Nacimiento agregar(Nacimiento nacimiento) {
        String INSERT_NACIMIENTO = "INSERT INTO nacimiento (dia, mes, anio) VALUES (?, ?, ?); ";
        try(
                Connection con = BDUtilidades.getConexion();
                PreparedStatement pstmt = con.prepareStatement(INSERT_NACIMIENTO, Statement.RETURN_GENERATED_KEYS)
                ){
            pstmt.setInt(1, nacimiento.getDia());
            pstmt.setInt(2, nacimiento.getMes());
            pstmt.setInt(3, nacimiento.getAnio());
            pstmt.executeUpdate();

            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                if (rs.next()){
                    nacimiento.setId(rs.getLong(1));
                }
            }
            return nacimiento;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
