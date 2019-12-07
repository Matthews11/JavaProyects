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
public class Destokp extends javax.swing.JFrame {

     ConexionBD con= new ConexionBD();
    Connection cn=con.conexion();
    /**
     * Creates new form Destokp
     */
    public Destokp() {
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
        
        String sql ="SELECT * FROM destokp";
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
              Logger.getLogger(EM.class.getName()).log(Level.SEVERE, null, ex);
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
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Destokp");
        getContentPane().setLayout(null);

        jLabel12.setText("Marca");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 410, 29, 14);

        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 11, 14);

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 30, 88, 32);

        jLabel13.setText("Envio");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 440, 26, 14);
        getContentPane().add(ID);
        ID.setBounds(110, 10, 154, 32);

        EN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENActionPerformed(evt);
            }
        });
        getContentPane().add(EN);
        EN.setBounds(110, 440, 154, 32);
        getContentPane().add(RAM);
        RAM.setBounds(110, 170, 154, 32);
        getContentPane().add(PROS);
        PROS.setBounds(110, 130, 154, 32);
        getContentPane().add(PREC);
        PREC.setBounds(110, 320, 154, 32);

        jLabel8.setText("Targeta de video");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 290, 82, 14);

        jLabel9.setText("Precio");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 330, 29, 14);
        getContentPane().add(GARAN);
        GARAN.setBounds(110, 360, 154, 32);
        getContentPane().add(NOM);
        NOM.setBounds(110, 50, 154, 32);

        jLabel4.setText("Procesador");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 130, 54, 14);

        OS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OSActionPerformed(evt);
            }
        });
        getContentPane().add(OS);
        OS.setBounds(110, 240, 154, 32);
        getContentPane().add(MARC);
        MARC.setBounds(110, 400, 154, 32);
        getContentPane().add(DD);
        DD.setBounds(110, 210, 154, 32);

        jLabel6.setText("Disco duro");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 220, 50, 14);

        jLabel5.setText("Memoria ram");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 180, 61, 14);

        jLabel3.setText("Modelo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 34, 14);

        jLabel10.setText("Garantia");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 370, 41, 14);

        jLabel7.setText("OS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 250, 14, 14);
        getContentPane().add(TG);
        TG.setBounds(110, 280, 154, 32);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 90, 794, 402);

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 37, 14);
        getContentPane().add(MOD);
        MOD.setBounds(110, 90, 154, 32);

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(110, 510, 82, 33);

        jButton5.setText("Vaciar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(450, 30, 88, 32);

        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(650, 30, 88, 32);

        jButton8.setText("Eliminar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(980, 30, 90, 30);

        jButton9.setText("Actualizar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(820, 30, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
              PreparedStatement pps = cn.prepareStatement("INSERT INTO destokp (ID_Destokp,Nombre,Modelo,Procesador,Memoria_ram,"
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
              Logger.getLogger(Destokp.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void ENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ENActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int fila = tabla.getSelectedRow();
        String valor = tabla.getValueAt(fila, 0).toString();
        if (fila >=0)
        {
            try {
                PreparedStatement pps= cn.prepareStatement("DELETE FROM Empleados where ID_destokp='"+valor+"'");
                pps.executeUpdate();
                tabla();

            } catch (SQLException ex) {
                Logger.getLogger(EM.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_jButton8ActionPerformed
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            PreparedStatement pps=cn.prepareStatement("UPDATE Destokp SET Nombre='"
                +NOM.getText()+"',Modelo='"+MOD.getText()+"',Procesador='"+PROS.getText()+"',Memoria_ram='"+RAM.getText()+"',Disco_duro='"+DD.getText()+
               "',OS='"+OS.getText()+"',Targeta_de_video='"+TG.getText()+ "',Precio='"+PREC.getText()+"',Garantia='"+GARAN.getText()+"',Marca='"
                + MARC.getText()+"',Envio='"+EN.getText()+"'Where ID_Laptops ="+ID.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
            tabla();

        } catch (SQLException ex) {
            Logger.getLogger(Destokp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Destokp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Destokp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Destokp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Destokp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Destokp().setVisible(true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
