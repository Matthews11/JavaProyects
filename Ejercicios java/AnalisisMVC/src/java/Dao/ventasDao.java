/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import model.ventass;

/**
 *
 * @author jared
 */
public class ventasDao {

    private String url = "jdbc:mysql://localhost:6666/inventario?useSSL=false";
    private String user = "root";
    private String password = "12345";

    //Querys SQL para Usuarios
    private static String INSERT_USUARIOS_SQL = "insert into ventas (id_linea,fecha_venta,descripcion) values "
            + "(?,?,?)";
    private static String MODIFICAR_USUARIOS_SQL = " update ventas set id_linea=?, fecha_venta=?, descripcion=?"
            + "  where id_venta=?";

    private static String ELIMINAR_USUARIOS_SQL = " delete from ventas where id_venta=?";

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

    public void ingresar(ventass v) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(INSERT_USUARIOS_SQL)) {
            statement.setInt(1, v.getId_linea());
            statement.setString(2, v.getFecha_venta());
            statement.setString(3, v.getDescripcion());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void modificar(ventass v) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(MODIFICAR_USUARIOS_SQL)) {
            statement.setInt(1, v.getId_linea());
            statement.setString(2, v.getFecha_venta());
            statement.setString(3, v.getDescripcion());
            statement.setInt(4, v.getId_venta());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void ELIMINAR(ventass v) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(ELIMINAR_USUARIOS_SQL)) {
            statement.setInt(1, v.getId_venta());
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
