/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.controls.company.DAO;
import com.mysql.jdbc.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import sv.controls.company.model.UsuariosBeans;
/**
 *
 * @author jared
 */
public class LoginDao {

    //Strings para conexion
    private String url = "jdbc:mysql://localhost:6666/pov2?useSSL=false";
    private String user = "root";
    private String password = "12345";

    //Querys SQL para Usuarios
    private static String SELECT_USUARIOS_SQL = "SELECT * FROM usuarios WHERE Nombre_Usuario = ? and Contrasena = ?";

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

    public int comprobar(UsuariosBeans user) throws SQLException {
        
        int rol =0;
        
        try (Connection conn = getConnection();
             java.sql.PreparedStatement statement = conn.prepareStatement(SELECT_USUARIOS_SQL)) {
            statement.setString(1, user.getNombre_Usuario());
            statement.setString(2, user.getContraseña());

          
            
            ResultSet result = statement.executeQuery();
            while (result.next())
            {
                rol = result.getInt("IdTipoUsuario");
            }
             return rol;
        } catch (SQLException e) {
            printSQLException(e);
        }
        return rol;
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
