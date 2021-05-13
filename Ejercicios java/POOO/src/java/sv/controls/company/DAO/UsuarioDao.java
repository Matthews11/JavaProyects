/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.controls.company.DAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import sv.controls.company.model.Tipo_UsuarioBeans;
import sv.controls.company.model.UsuariosBeans;

/**
 *
 * @author jared
 */
public class UsuarioDao {

    private String url = "jdbc:mysql://localhost:6666/pov2?useSSL=false";
    private String user = "root";
    private String password = "12345";

    //Querys SQL para Usuarios
    private static String INSERT_USUARIOS_SQL = "insert into usuarios (Nombre_Usuario,IdTipoUsuario,IdDepartamento,IdEstadoUsuario,Contrasena) values "
            + "(?,?,?,?,?)";
    private static String MODIFICAR_USUARIOS_SQL = " update Usuarios set Nombre_Usuario=?, IdTipoUsuario=?, IdDepartamento=?,"
            + "IdEstadoUsuario=?, Contrasena=? where Id_Usuario=?";

    private static String ELIMINAR_USUARIOS_SQL = " delete from Usuarios where Id_Usuario=?";

    // tipo de usuario
    private static String INSERT_USUARIOS_SQL2 = "insert into Tipo_Usuario (Tipo_Usuario) values "
            + "(?)";
    private static String MODIFICAR_USUARIOS_SQL2 = " update Tipo_Usuario set Tipo_Usuario=? where Id_Tipo_Usuario=?";

    private static String ELIMINAR_USUARIOS_SQL2 = " delete from Tipo_Usuario where Id_Tipo_Usuario=?";

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

    public void ingresar(UsuariosBeans UB) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(INSERT_USUARIOS_SQL)) {
            statement.setString(1, UB.getNombre_Usuario());
            statement.setInt(2, UB.getIdTipoUsuario());
            statement.setInt(3, UB.getIdDepartamento());
            statement.setInt(4, UB.getIdEstadoUsuario());
            statement.setString(5, UB.getContraseña());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void modificar(UsuariosBeans UB) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(MODIFICAR_USUARIOS_SQL)) {
            statement.setString(1, UB.getNombre_Usuario());
            statement.setInt(2, UB.getIdTipoUsuario());
            statement.setInt(3, UB.getIdDepartamento());
            statement.setInt(4, UB.getIdEstadoUsuario());
            statement.setString(5, UB.getContraseña());
            statement.setInt(6, UB.getId_Usuarios());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void ELIMINAR(UsuariosBeans UB) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(ELIMINAR_USUARIOS_SQL)) {
            statement.setInt(1, UB.getId_Usuarios());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void ingresartp(Tipo_UsuarioBeans TPB) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(INSERT_USUARIOS_SQL2)) {
            statement.setString(1, TPB.getTipo_Usuario());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void modificartp(Tipo_UsuarioBeans TPB) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(MODIFICAR_USUARIOS_SQL2)) {
            statement.setString(1, TPB.getTipo_Usuario());
            statement.setInt(2, TPB.getId_Tipo_Usuario());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void ELIMINARtp(Tipo_UsuarioBeans TPB) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(ELIMINAR_USUARIOS_SQL2)) {
            statement.setInt(1, TPB.getId_Tipo_Usuario());
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
