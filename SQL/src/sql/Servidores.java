/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JARED
 */
public class Servidores extends javax.swing.JFrame {

    ConexionBD con= new ConexionBD();
    Connection cn=con.conexion();
    public Servidores() {
        initComponents();
        tabla();
    }

   void tabla ()
    {
        DefaultTableModel modelo = new DefaultTableModel() ;
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Modelo");
        modelo.addColumn("Procesador");
        modelo.addColumn("Memoria_ram");
        modelo.addColumn("Disco_duro");
        modelo.addColumn("OS");
        modelo.addColumn("Targeta_de_video");
        modelo.addColumn("Precio");
        modelo.addColumn("Garantia");
        modelo.addColumn("Marca");
        modelo.addColumn("Envio");
        tabla.setModel(modelo);
        
        String sql ="SELECT * FROM servidores";
        String datos [] = new String [12];
          try {
              Statement St =cn.createStatement();
              ResultSet rs= St.executeQuery(sql);
              
              while (rs.next())
              {
                  datos[0]=rs.getString(1);
                  datos[1]=rs.getString(2);
                  datos[2]=rs.getString(3);
                  datos[3]=rs.getString(4);
                  datos[4]=rs.getString(5);
                  datos[5]=rs.getString(6);
                  datos[6]=rs.getString(7);
                  datos[7]=rs.getString(8);
                  datos[8]=rs.getString(9);
                  datos[9]=rs.getString(10);
                  datos[10]=rs.getString(11);
                  datos[11]=rs.getString(12);
                 
                  modelo.addRow(datos); 
              
              }
              tabla.setModel(modelo);
              
              
          } catch (SQLException ex) {
              Logger.getLogger(Servidores.class.getName()).log(Level.SEVERE, null, ex);
          }
      
    }
    
     void limpiar ()
    {
        ID.setText("");
        NOM.setText("");
        MOD.setText("");
        PROS.setText("");
        RAM.setText("");
        DD.setText("");
        OS.setText("");
        TG.setText("");
        PREC.setText("");
        GARAN.setText("");
        MARC.setText("");
        EN.setText("");
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ID = new javax.swing.JTextField();
        EN = new javax.swing.JTextField();
        RAM = new javax.swing.JTextField();
        PROS = new javax.swing.JTextField();
        PREC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        GARAN = new javax.swing.JTextField();
        NOM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        OS = new javax.swing.JTextField();
        MARC = new javax.swing.JTextField();
        DD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TG = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        MOD = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servidores");

        jLabel12.setText("Marca");

        jLabel1.setText("ID");

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setText("Envio");

        jButton3.setText("Eliminar ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Targeta de video");

        jLabel9.setText("Precio");

        jLabel4.setText("Procesador");

        OS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OSActionPerformed(evt);
            }
        });

        jLabel6.setText("Disco duro");

        jLabel5.setText("Memoria ram");

        jLabel3.setText("Modelo");

        jLabel10.setText("Garantia");

        jLabel7.setText("OS");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel2.setText("Nombre");

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Vaciar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Actualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(47, 47, 47)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(59, 59, 59)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(62, 62, 62)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(EN, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addComponent(MARC)
                        .addComponent(GARAN)
                        .addComponent(MOD, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PROS, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(RAM, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DD, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(OS, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TG, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PREC)
                        .addComponent(NOM, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ID, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MOD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PROS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(RAM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PREC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(GARAN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MARC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(EN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
              PreparedStatement pps = cn.prepareStatement("INSERT INTO servidores (ID_Servidores,Nombre,Modelo,Procesador,Memoria_ram,"
                      + "Disco_duro,OS,Targeta_de_video,Precio,Garantia,Marca,Envio)"
                      + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
              pps.setString(1,ID.getText());
              pps.setString(2,NOM.getText());
              pps.setString(3,MOD.getText());
              pps.setString(4,PROS.getText());
              pps.setString(5,RAM.getText());
              pps.setString(6,DD.getText());
              pps.setString(7,OS.getText());
              pps.setString(8,TG.getText());
              pps.setString(9,PREC.getText());
              pps.setString(10,GARAN.getText());
              pps.setString(11,MARC.getText());
              pps.setString(12,EN.getText());
              pps.executeUpdate();
              tabla();
          } catch (SQLException ex) {
              Logger.getLogger(Servidores.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void OSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OSActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     Principal Menu = new Principal ();
        Menu.setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         try {
            PreparedStatement pps=cn.prepareStatement("UPDATE servidores SET Nombre='"
                +NOM.getText()+"',Modelo='"+MOD.getText()+"',Procesador='"+PROS.getText()+"',Memoria_ram='"+RAM.getText()+"',Disco_duro='"+DD.getText()+
               "',OS='"+OS.getText()+"',Targeta_de_video='"+TG.getText()+ "',Precio='"+PREC.getText()+"',Garantia='"+GARAN.getText()+"',Marca='"
                + MARC.getText()+"',Envio='"+EN.getText()+"'Where ID_Servidores ="+ID.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
            tabla();

        } catch (SQLException ex) {
            Logger.getLogger(Servidores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila >=0)
        {
            ID.setText(tabla.getValueAt(fila, 0).toString());
            NOM.setText(tabla.getValueAt(fila, 1).toString());
            MOD.setText(tabla.getValueAt(fila, 2).toString());
            PROS.setText(tabla.getValueAt(fila, 3).toString());
            RAM.setText(tabla.getValueAt(fila, 4).toString());
            DD.setText(tabla.getValueAt(fila, 5).toString());
            OS.setText(tabla.getValueAt(fila, 6).toString());
            TG.setText(tabla.getValueAt(fila, 7).toString());
            PREC.setText(tabla.getValueAt(fila, 8).toString());
            GARAN.setText(tabla.getValueAt(fila, 9).toString());
            MARC.setText(tabla.getValueAt(fila, 10).toString());
            EN.setText(tabla.getValueAt(fila, 11).toString());
           
        }
        else
        {
            JOptionPane.showMessageDialog(null, "fila no seleccionada");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila = tabla.getSelectedRow();
       String valor = tabla.getValueAt(fila, 0).toString();
        if (fila >=0)
        {
            try {
                PreparedStatement pps= cn.prepareStatement("DELETE FROM servidores where ID_Servidores='"+valor+"'");
                pps.executeUpdate();
                tabla();
      
            } catch (SQLException ex) {
               Logger.getLogger(Servidores.class.getName()).log(Level.SEVERE, null, ex);
           }
            
    }    
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Servidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servidores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servidores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DD;
    private javax.swing.JTextField EN;
    private javax.swing.JTextField GARAN;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField MARC;
    private javax.swing.JTextField MOD;
    private javax.swing.JTextField NOM;
    private javax.swing.JTextField OS;
    private javax.swing.JTextField PREC;
    private javax.swing.JTextField PROS;
    private javax.swing.JTextField RAM;
    private javax.swing.JTextField TG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
