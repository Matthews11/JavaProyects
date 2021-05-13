/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaTester;

import Herramientas.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import javax.swing.table.DefaultTableModel;


public class bitacoraRechazado extends javax.swing.JInternalFrame {

     DefaultTableModel mtd;
  private final String SQL_SELECT = "SELECT Id_Caso,Observacion,Estado_Caso,Fecha_Limite FROM Bitacora_Tester_Rechazado ";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        
    public bitacoraRechazado() throws SQLException {
        initComponents();
              Object [][] data = null;
        String [] columns = 
        {
            "N°Caso","Observacion","Estado Caso","Fecha Limite"
        };
        
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();
           mtd = new DefaultTableModel(data,columns);
        this.TBR.setModel(mtd);
         generarListado(); 
        
    
    }
    
  
      
    public void generarListado() throws SQLException {
        while (rs.next()) {
            Object[] newRow = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)};
            mtd.addRow(newRow);
        }
        rs.close();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBR = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Bitacora Rechazado");
        setAutoscrolls(true);

        jLabel1.setText("Bitacora Rechazados");

        TBR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° Observaciones", "Observaciones", "Estado Caso", "Fecha Limite"
            }
        ));
        jScrollPane1.setViewportView(TBR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
