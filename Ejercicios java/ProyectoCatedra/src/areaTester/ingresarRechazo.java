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

public class ingresarRechazo extends javax.swing.JInternalFrame {

    private final String SQL_INSERT = "INSERT INTO Bitacora_Tester_Rechazado (Id_Caso,Observacion, Estado_Caso,Fecha_Limite) "
            + "VALUES(?,?,?,?)";
    
    public ingresarRechazo() {
        initComponents();
    }
    
    // recibe como parametro los valores a insertar 
    public int insertar(int Id_Caso, String Observacion, String Estado_Caso, String Fecha_Limite  ) {

        Connection con = null;
        PreparedStatement ingresar = null;

        int rows = 0; //registros afectados
        try {
            con = Conexion.getConnection();
            ingresar = con.prepareStatement(SQL_INSERT);
            int index = 1;//contador de columnas
            ingresar.setInt(index++, Id_Caso);
            ingresar.setString(index++, Observacion);
            ingresar.setString(index++, Estado_Caso);
            ingresar.setString(index++, Fecha_Limite);
            int año = txt3.getCalendar().get(Calendar.YEAR);
            int dia = txt3.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes = txt3.getCalendar().get(Calendar.MARCH);
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

        IR = new javax.swing.JPanel();
        Enviar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextArea();
        txt1 = new javax.swing.JTextField();
        txt3 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ingresar Rechazo");
        setAutoscrolls(true);

        Enviar.setText("Enviar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingresar Rechazo");

        jLabel6.setText("N° Observaciones");

        jLabel7.setText("Ingresar Obervaciones");

        jLabel8.setText("Fecha Limite");

        txt2.setColumns(20);
        txt2.setRows(5);
        jScrollPane2.setViewportView(txt2);

        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout IRLayout = new javax.swing.GroupLayout(IR);
        IR.setLayout(IRLayout);
        IRLayout.setHorizontalGroup(
            IRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IRLayout.createSequentialGroup()
                .addGroup(IRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IRLayout.createSequentialGroup()
                        .addContainerGap(178, Short.MAX_VALUE)
                        .addGroup(IRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31))
                    .addGroup(IRLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(IRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IRLayout.createSequentialGroup()
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(IRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IRLayout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81))
                        .addGroup(IRLayout.createSequentialGroup()
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(184, 184, 184)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Enviar)
                .addGap(66, 66, 66)
                .addComponent(Limpiar)
                .addGap(174, 174, 174))
        );
        IRLayout.setVerticalGroup(
            IRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IRLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addGroup(IRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IRLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7))
                    .addGroup(IRLayout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(IRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(51, 51, 51)
                .addGroup(IRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpiar)
                    .addComponent(Enviar))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // Limpiar
        txt1.setText("");
        txt2.setText("");
        

     
    }//GEN-LAST:event_LimpiarActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        // Enviar
        
        
          //Validacion de Campo Vacio
           if (txt1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Ingrese el campo correctamente","error",JOptionPane.ERROR_MESSAGE);
        }
        else  if (txt2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Ingrese el campo correctamente","error",JOptionPane.ERROR_MESSAGE);
        }
        else  if (txt3.getDate()==null)
        {
            JOptionPane.showMessageDialog(null,"Ingrese el campo correctamente","error",JOptionPane.ERROR_MESSAGE);
        }
        else{   
        int Caso =0;
        String Observacion ="";
        String EstadoCaso = "Rechazado";
        String FechaLimite = "" ;

        Caso = Integer.parseInt(txt1.getText());
        Observacion = txt2.getText();
        
        FechaLimite = String.valueOf(txt3.getDate());

        insertar(Caso, Observacion, EstadoCaso,FechaLimite);
        }
        
      
    }//GEN-LAST:event_EnviarActionPerformed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped

    }//GEN-LAST:event_txt1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JPanel IR;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextArea txt2;
    private com.toedter.calendar.JDateChooser txt3;
    // End of variables declaration//GEN-END:variables
}
