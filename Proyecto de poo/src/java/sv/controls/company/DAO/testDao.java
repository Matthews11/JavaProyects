/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.controls.company.DAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import sv.controls.company.model.Bitacora_TestingBeans;
import sv.controls.company.model.CasosBeans;

/**
 *
 * @author Jared
 */
public class testDao {

    //Strings para conexion
    private String url = "jdbc:mysql://localhost:6666/pov2?useSSL=false";
    private String user = "root";
    private String password = "12345";

    //Querys SQL para Usuarios
    private static String estado = "update Casos set IdEstatoCaso=? where IdCaso=?";

    private static String aceptar = "update Bitacora_Testing set FechaPuesta=?,IdCaso=?,IdEmpleado=? where IdTesting=?";

    private static String R = "update Bitacora_Testing  set Observacion=?, FechaT=?,IdCaso=?,IdEmpleado=? where IdTesting=?";

    private static String avance = "update Casos set PorcentajeAvance=?  where IdCaso=? ";

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

    public void aceptar(Bitacora_TestingBeans bt) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(aceptar)) {
            statement.setString(1, bt.getFechaPuesta());
            statement.setInt(2, bt.getIdCaso());
            statement.setInt(3, bt.getIdEmpleado());
            statement.setInt(4, bt.getIdTesting());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void barra(CasosBeans CB) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(avance)) {

            statement.setInt(1, CB.getPorcentajeAvance());
            statement.setInt(2, CB.getIdCaso());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void Estado(CasosBeans CB) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(estado)) {

            statement.setInt(1, CB.getIdEstadoCaso());
            statement.setInt(2, CB.getIdCaso());

            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void rechazar(Bitacora_TestingBeans bt) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(R)) {
            statement.setString(1, bt.getObservacion());
            statement.setString(2, bt.getFechaT());
            statement.setInt(3, bt.getIdCaso());
            statement.setInt(4, bt.getIdEmpleado());
            statement.setInt(5, bt.getIdTesting());
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
