/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.controls.company.DAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import sv.controls.company.model.EmpleadoAreaFuncionalBeans;
import sv.controls.company.model.ProgramadoresBeans;

/**
 *
 * @author jared
 */
public class PersonalDao {

    private String url = "jdbc:mysql://localhost:6666/pov2?useSSL=false";
    private String user = "root";
    private String password = "12345";

    //Querys SQL para Usuarios
    private static String INSERT = "insert into Programadores (NombreProgramador,IdUsuarios,Edad,Correo) values "
            + "(?,?,?,?) ";

    private static String INSERT1 = "insert into EmpleadoAreaFuncional (NombreEmpleado,IdUsuario,Edad,Correo) values "
            + "(?,?,?,?) ";

    private static String MODIFICAR = " update Programadores set NombreProgramador=?, Edad=?, Correo=? where IdProgramador=?";

     private static String MODIFICAR2 = " update EmpleadoAreaFuncional set NombreEmpleado=?, Edad=?, Correo=? where IdEmpleado=?";

    
    private static String ELIMINAR = " delete from Programadores where IdProgramador=?";

     private static String ELIMINAR2 = " delete from EmpleadoAreaFuncional where IdEmpleado=?";

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

    public void ingresar(ProgramadoresBeans Progra) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(INSERT)) {
            statement.setString(1, Progra.getNombreProgramador());
            statement.setInt(2, Progra.getIdUsuarios());
            statement.setInt(3, Progra.getEdad());
            statement.setString(4, Progra.getCorreo());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void modificar(ProgramadoresBeans Progra) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(MODIFICAR)) {
            statement.setString(1, Progra.getNombreProgramador());
            statement.setInt(2, Progra.getEdad());
            statement.setString(3, Progra.getCorreo());
            statement.setInt(4, Progra.getIdProgramador());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void eliminar(ProgramadoresBeans Progra) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(ELIMINAR)) {
            statement.setInt(1, Progra.getIdProgramador());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }

    public void ingresarT(EmpleadoAreaFuncionalBeans Empleado) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(INSERT1)) {
            statement.setString(1, Empleado.getNombreEmpleado());
            statement.setInt(2, Empleado.getIdUsuarios());
            statement.setInt(3, Empleado.getEdad());
            statement.setString(4, Empleado.getCorreo());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }
    
      public void modificarT(EmpleadoAreaFuncionalBeans Empleado) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(MODIFICAR2)) {
            statement.setString(1, Empleado.getNombreEmpleado());
            statement.setInt(2, Empleado.getEdad());
            statement.setString(3, Empleado.getCorreo());
            statement.setInt(4, Empleado.getIdEmpleado());
            statement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }

    }


       public void eliminarT(EmpleadoAreaFuncionalBeans Empleado) throws SQLException {

        try (Connection conn = getConnection();
                java.sql.PreparedStatement statement = conn.prepareStatement(ELIMINAR2)) {
            statement.setInt(1, Empleado.getIdEmpleado());
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
