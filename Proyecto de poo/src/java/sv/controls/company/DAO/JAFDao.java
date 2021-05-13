/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.controls.company.DAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import sv.controls.company.model.*;

/**
 *
 * @author jared
 */
public class JAFDao {

    //Strings para conexion
    private String url = "jdbc:mysql://localhost:6666/pov2?useSSL=false";
    private String user = "root";
    private String password = "12345";

    //Querys SQL para Usuarios
    private static String INSERT_USUARIOS_SQL = "insert into Casos (DescripcionA,IdDepartamento,IdEstatoCaso , IdEmpleado,IdJefeFuncional,PorcentajeAvance) values "
           + "(?,?,?,?,?,?)";

    private static String aceptar = "update Casos set DescripcionJ=?,IdProgramador=?,FechaJD=?,IdEstatoCaso=?, IdTester=?, PorcentajeAvance=?"
            + " where IdCaso=?";

    private static String rechazar = "update Casos set RazonRechazo=?,IdEstatoCaso=?,PorcentajeAvance=? where IdCaso=?";

    //Genera la conexion
    protected Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public void ingresar(CasosBeans CB) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(INSERT_USUARIOS_SQL)) {
            statement.setString(1, CB.getDescripcionA());
            statement.setInt(2, CB.getIdDepartamento());
            statement.setInt(3, CB.getIdEstadoCaso());
            statement.setInt(4, CB.getdEmpleado());
            statement.setInt(5, CB.getiDjefe());
            statement.setInt(6, CB.getPorcentajeAvance());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void aceptar(CasosBeans CB) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(aceptar)) {
            statement.setString(1, CB.getDescripcionJ());
            statement.setInt(2, CB.getIdProgramador());
            statement.setString(3, CB.getFechaJD());
            statement.setInt(4, CB.getIdEstadoCaso());
            statement.setInt(5, CB.getIdTester());
            statement.setInt(6, CB.getPorcentajeAvance());
           statement.setInt(7, CB.getIdCaso());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void rechazar(CasosBeans CB) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(rechazar)) {
            statement.setString(1, CB.getRazonRechazo());
            statement.setInt(2, CB.getIdEstadoCaso());
            statement.setInt(3, CB.getPorcentajeAvance());
            statement.setInt(4, CB.getIdCaso());

            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

}
