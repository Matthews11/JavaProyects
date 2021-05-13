/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaTester;
 
import Herramientas.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class ingresarAprobado extends javax.swing.JInternalFrame {

    private final String SQL_INSERT = "INSERT INTO Bitacora_Tester (Id_BitacoraT,Estado_Caso, Fecha_De_Puesta) "
            + "VALUES(?,?,?)";
    
    public ingresarAprobado() {
        initComponents();
    }

    // recibe como parametro los valores a insertar 
    public int insertar(int Id_BitacoraT, String Estado_Caso, String Fecha_De_Puesta  ) {

        Connection con = null;
        PreparedStatement ingresar = null;

        int rows = 0; //registros afectados
        try {
            con = Conexion.getConnection();
            ingresar = con.prepareStatement(SQL_INSERT);
            int index = 1;//contador de columnas
            ingresar.setInt(index++, Id_BitacoraT);
            ingresar.setString(index++, Estado_Caso);
            ingresar.setString(index++, Fecha_De_Puesta);
           
            int año = txt2.getCalendar().get(Calendar.YEAR);
            int dia = txt2.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes = txt2.getCalendar().get(Calendar.MARCH);
            String fecha = año+"-"+mes+"-"+dia;
         
            rows = ingresar.executeUpdate();//no. registros afectados
            JOptionPane.showMessageDialog(null, "Registros afectados" + rows);
            
 
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ingresar);
            
            
        }
        return rows;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IA = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt2 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ingresar Aprobado");
        setAutoscrolls(true);

        jLabel1.setText("Ingresar Aprobación");

        jLabel2.setText("N° Caso");

        jLabel3.setText("Fecha Finalización");

        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IALayout = new javax.swing.GroupLayout(IA);
        IA.setLayout(IALayout);
        IALayout.setHorizontalGroup(
            IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IALayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IALayout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addGroup(IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(70, 70, 70)
                .addGroup(IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(205, 205, 205))
        );
        IALayout.setVerticalGroup(
            IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(IALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(IA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Limpiar
        txt1.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Enviar
           if (txt1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Ingrese el campo correctamente","error",JOptionPane.ERROR_MESSAGE);
        }
        else  if (txt2.getDate()==null)
        {
            JOptionPane.showMessageDialog(null,"Ingrese el campo correctamente","error",JOptionPane.ERROR_MESSAGE);
        }
        else{ 
         int Caso =0;
        String EstadoCaso = "Aceptado";
        String FechaLimite = "" ;

        Caso = Integer.parseInt(txt1.getText());
       FechaLimite = String.valueOf(txt2.getDate());
       
        insertar(Caso, EstadoCaso,FechaLimite);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt1;
    private com.toedter.calendar.JDateChooser txt2;
    // End of variables declaration//GEN-END:variables
}
