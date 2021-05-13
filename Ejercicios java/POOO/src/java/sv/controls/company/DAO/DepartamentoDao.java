/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.controls.company.DAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException; 
import sv.controls.company.model.DepartamentoBeans; 

/**
 *
 * @author jared
 */
public class DepartamentoDao {
     //Strings para conexion
    private String url = "jdbc:mysql://localhost:6666/pov2?useSSL=false";
    private String user = "root";
    private String password = "12345";

    //Querys SQL para Usuarios
    private static String INSERT_USUARIOS_SQL = "insert into departamento (NombreDepartamento) values "
            + "(?)";
     private static String MODIFICAR_USUARIOS_SQL = " update departamento set NombreDepartamento=? where IdDepartamento=?";
     
       private static String ELIMINAR_USUARIOS_SQL = " delete from departamento where IdDepartamento=?";

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

    public void ingresar (DepartamentoBeans DEPA) throws SQLException {
        
         
        try (Connection conn = getConnection();
             java.sql.PreparedStatement statement = conn.prepareStatement(INSERT_USUARIOS_SQL)) {
             statement.setString(1, DEPA.getNombreDepartamento()); 
               statement.executeUpdate();
           
        } catch (SQLException e) {
            printSQLException(e);
        }
       
    }
    
     public void modificar (DepartamentoBeans DEPA) throws SQLException {
        
         
        try (Connection conn = getConnection();
             java.sql.PreparedStatement statement = conn.prepareStatement(MODIFICAR_USUARIOS_SQL)) {
             statement.setString(1, DEPA.getNombreDepartamento()); 
             statement.setInt(2, DEPA.getIdDepartamento());
               statement.executeUpdate();
           
        } catch (SQLException e) {
            printSQLException(e);
        }
       
    }
     
       public void ELIMINAR (DepartamentoBeans DEPA) throws SQLException {
        
         
        try (Connection conn = getConnection();
             java.sql.PreparedStatement statement = conn.prepareStatement(ELIMINAR_USUARIOS_SQL)) { 
             statement.setInt(1, DEPA.getIdDepartamento());
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
