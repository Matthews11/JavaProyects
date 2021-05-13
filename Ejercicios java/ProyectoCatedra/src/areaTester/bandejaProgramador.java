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

public class bandejaProgramador extends javax.swing.JInternalFrame {

    DefaultTableModel mtd;
    private final String SQL_SELECT = "SELECT Id_BitacoraP,Actualizacion, Id_caso FROM Bitacora_Programador ";

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public bandejaProgramador() throws SQLException {
        initComponents();
        Object[][] data = null;
        String[] columns
                = {
                    "N°Actualizacion", "Actualizacion", "N°Caso"
                };

        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();
        mtd = new DefaultTableModel(data, columns);
        this.t1.setModel(mtd);
        generarListado();

    }

    public void generarListado() throws SQLException {
        while (rs.next()) {
            Object[] newRow = {rs.getInt(1), rs.getString(2), rs.getString(3)};
            mtd.addRow(newRow);
        }
        rs.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Bandeja de Programador");
        setAutoscrolls(true);

        jLabel1.setText("Bandeja de Entrada del Programador");

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N° Actualizaciones", "Actualizaciones", "N° Caso"
            }
        ));
        jScrollPane1.setViewportView(t1);

        jButton1.setText("Aprobar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });

        jButton2.setText("Rechazar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BPLayout = new javax.swing.GroupLayout(BP);
        BP.setLayout(BPLayout);
        BPLayout.setHorizontalGroup(
            BPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPLayout.createSequentialGroup()
                .addGroup(BPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BPLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1))
                    .addGroup(BPLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jButton1)
                        .addGap(149, 149, 149)
                        .addComponent(jButton2))
                    .addGroup(BPLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        BPLayout.setVerticalGroup(
            BPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(BPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Aceptado

        ingresarAprobado I = new ingresarAprobado();
        BP.add(I);
        I.show();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        ingresarRechazo R = new ingresarRechazo();
        BP.add(R);
        R.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped
        // TODO add your handling code here:
       

       
    }//GEN-LAST:event_jButton1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}
