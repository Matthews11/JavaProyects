
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionBD {
    
    Connection conectar=null;
public Connection conexion(){   
  try{
    Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
    conectar=DriverManager.getConnection("jdbc:mysql://localhost/empresa_dell","root","HL34888");
    //conectar=DriverManager.getConnection("jdbc:mysql://192.168.1.5:3306/personas","luis","");
    
  }catch(SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
                                   }catch(ClassNotFoundException ex) {                                                                }
  return conectar;
}
}
  

    

