/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaProgramador;

import Herramientas.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jared
 */
public class verBitacora extends javax.swing.JInternalFrame {
DefaultTableModel mtd;
  private final String SQL_SELECT = "SELECT * FROM Bitacora_Programador ";
    /**
     * Creates new form Ver
     */
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

    public verBitacora( ) throws SQLException   {
        initComponents();
        
         
        
        Object [][] data = null;
        String [] columns = 
        {
            "Id_Bitacorap","Actualizacion","Estado_Caso" 
        };
        
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();
       
           mtd = new DefaultTableModel(data,columns);
        this.Bitacora.setModel(mtd);
         generarListado(); 
        
    }

    
    public void generarListado() throws SQLException {
        while (rs.next()) {
            Object[] newRow = {rs.getInt(1), rs.getString(2), rs.getString(3)};
            mtd.addRow(newRow);
        }
        rs.close();
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Bitacora = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        Bitacora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero de Actualización", "Actualización", "Estado"
            }
        ));
        jScrollPane1.setViewportView(Bitacora);
        if (Bitacora.getColumnModel().getColumnCount() > 0) {
            Bitacora.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("BITACORA ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(445, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Bitacora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
