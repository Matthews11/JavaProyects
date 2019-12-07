/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JARED
 */
public class Factura extends javax.swing.JFrame {

     ConexionBD con= new ConexionBD();
    Connection cn=con.conexion();
    public Factura() {
        initComponents();
    }

      void limpiar ()
    {
        IDFAC.setText("");
        FECHA.setText("");
        CC.setText("");
        NC.setText("");
        PAIS.setText("");
        DIREC.setText("");
        DES1.setText("");
        DES2.setText("");
        DES3.setText("");
        DES4.setText("");
        DES5.setText("");
        CANT1.setText("");
        CANT2.setText("");
        CANT3.setText("");
        CANT4.setText("");
        CANT5.setText("");
        PU1.setText("");
        PU2.setText("");
        PU3.setText("");
        PU4.setText("");
        PU5.setText("");
        MON1.setText("");
        MON2.setText("");
        MON3.setText("");
        MON4.setText("");
        MON5.setText("");
        total.setText("");
        ENTRENOM.setText("");
        ENCO.setText("");
        NOMRECI.setText("");
        CODRECI.setText("");
        FORPAGO.setText("");
        ENVIO.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PAIS = new javax.swing.JFormattedTextField();
        IDFAC = new javax.swing.JFormattedTextField();
        NC = new javax.swing.JFormattedTextField();
        DIREC = new javax.swing.JFormattedTextField();
        CC = new javax.swing.JFormattedTextField();
        FECHA = new javax.swing.JFormattedTextField();
        NOMRECI = new javax.swing.JFormattedTextField();
        ENTRENOM = new javax.swing.JFormattedTextField();
        CODRECI = new javax.swing.JFormattedTextField();
        ENCO = new javax.swing.JFormattedTextField();
        ENVIO = new javax.swing.JFormattedTextField();
        FORPAGO = new javax.swing.JFormattedTextField();
        VUEL = new javax.swing.JButton();
        DES2 = new javax.swing.JFormattedTextField();
        CANT3 = new javax.swing.JFormattedTextField();
        CANT5 = new javax.swing.JFormattedTextField();
        PU1 = new javax.swing.JFormattedTextField();
        DES1 = new javax.swing.JFormattedTextField();
        DES5 = new javax.swing.JFormattedTextField();
        CANT4 = new javax.swing.JFormattedTextField();
        CANT1 = new javax.swing.JFormattedTextField();
        DES3 = new javax.swing.JFormattedTextField();
        PU2 = new javax.swing.JFormattedTextField();
        PU3 = new javax.swing.JFormattedTextField();
        CANT2 = new javax.swing.JFormattedTextField();
        DES4 = new javax.swing.JFormattedTextField();
        PU4 = new javax.swing.JFormattedTextField();
        MON3 = new javax.swing.JFormattedTextField();
        MON4 = new javax.swing.JFormattedTextField();
        MON2 = new javax.swing.JFormattedTextField();
        MON5 = new javax.swing.JFormattedTextField();
        MON1 = new javax.swing.JFormattedTextField();
        total = new javax.swing.JFormattedTextField();
        PU5 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        VUEL1 = new javax.swing.JButton();
        VUEL2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Factura");
        getContentPane().setLayout(null);

        jLabel2.setText("Pais");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 390, 104, 28);

        jLabel3.setText("Codigo del cliente ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 290, 104, 38);

        jLabel4.setText("Nombre del cliente ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 340, 140, 38);

        jLabel5.setText("Direccion ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 430, 104, 25);
        getContentPane().add(PAIS);
        PAIS.setBounds(160, 390, 127, 31);

        IDFAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFACActionPerformed(evt);
            }
        });
        getContentPane().add(IDFAC);
        IDFAC.setBounds(520, 200, 127, 31);
        getContentPane().add(NC);
        NC.setBounds(160, 340, 127, 31);
        getContentPane().add(DIREC);
        DIREC.setBounds(160, 430, 127, 31);

        CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCActionPerformed(evt);
            }
        });
        getContentPane().add(CC);
        CC.setBounds(160, 300, 127, 31);
        getContentPane().add(FECHA);
        FECHA.setBounds(770, 200, 127, 31);
        getContentPane().add(NOMRECI);
        NOMRECI.setBounds(770, 300, 127, 31);
        getContentPane().add(ENTRENOM);
        ENTRENOM.setBounds(520, 300, 127, 31);
        getContentPane().add(CODRECI);
        CODRECI.setBounds(770, 340, 127, 31);
        getContentPane().add(ENCO);
        ENCO.setBounds(520, 340, 127, 31);
        getContentPane().add(ENVIO);
        ENVIO.setBounds(770, 420, 127, 31);
        getContentPane().add(FORPAGO);
        FORPAGO.setBounds(520, 420, 127, 31);

        VUEL.setText("Vaciar");
        VUEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VUELActionPerformed(evt);
            }
        });
        getContentPane().add(VUEL);
        VUEL.setBounds(250, 710, 90, 30);
        getContentPane().add(DES2);
        DES2.setBounds(0, 560, 460, 40);
        getContentPane().add(CANT3);
        CANT3.setBounds(460, 600, 80, 40);
        getContentPane().add(CANT5);
        CANT5.setBounds(460, 670, 80, 40);
        getContentPane().add(PU1);
        PU1.setBounds(540, 521, 180, 40);
        getContentPane().add(DES1);
        DES1.setBounds(0, 520, 460, 40);
        getContentPane().add(DES5);
        DES5.setBounds(0, 670, 460, 40);
        getContentPane().add(CANT4);
        CANT4.setBounds(460, 640, 80, 30);
        getContentPane().add(CANT1);
        CANT1.setBounds(460, 520, 80, 40);
        getContentPane().add(DES3);
        DES3.setBounds(0, 600, 460, 40);
        getContentPane().add(PU2);
        PU2.setBounds(540, 560, 180, 40);
        getContentPane().add(PU3);
        PU3.setBounds(540, 600, 180, 40);
        getContentPane().add(CANT2);
        CANT2.setBounds(460, 560, 80, 40);
        getContentPane().add(DES4);
        DES4.setBounds(0, 640, 460, 30);
        getContentPane().add(PU4);
        PU4.setBounds(540, 640, 180, 30);
        getContentPane().add(MON3);
        MON3.setBounds(720, 600, 190, 40);

        MON4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MON4ActionPerformed(evt);
            }
        });
        getContentPane().add(MON4);
        MON4.setBounds(720, 640, 190, 30);
        getContentPane().add(MON2);
        MON2.setBounds(720, 560, 190, 40);
        getContentPane().add(MON5);
        MON5.setBounds(720, 670, 190, 40);
        getContentPane().add(MON1);
        MON1.setBounds(720, 520, 190, 40);
        getContentPane().add(total);
        total.setBounds(720, 710, 190, 30);
        getContentPane().add(PU5);
        PU5.setBounds(540, 670, 180, 40);

        jLabel6.setText("Codigo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 330, 50, 38);

        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 300, 50, 38);

        VUEL1.setText("Volver ");
        VUEL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VUEL1ActionPerformed(evt);
            }
        });
        getContentPane().add(VUEL1);
        VUEL1.setBounds(0, 710, 70, 30);

        VUEL2.setText("Guardar");
        VUEL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VUEL2ActionPerformed(evt);
            }
        });
        getContentPane().add(VUEL2);
        VUEL2.setBounds(130, 710, 90, 30);

        jLabel8.setText("Total");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(660, 710, 70, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\JARED\\Pictures\\FAC2.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 910, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VUELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VUELActionPerformed
        limpiar();
    }//GEN-LAST:event_VUELActionPerformed

    private void CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CCActionPerformed

    private void MON4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MON4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MON4ActionPerformed

    private void IDFACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDFACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDFACActionPerformed

    private void VUEL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VUEL1ActionPerformed
       Principal Menu = new Principal ();
        Menu.setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_VUEL1ActionPerformed

    private void VUEL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VUEL2ActionPerformed
      
        
        try{
            PreparedStatement pps=(PreparedStatement) cn.prepareStatement("INSERT INTO Factura  "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pps.setString(1,IDFAC.getText());
            pps.setString(2,FECHA.getText());
            pps.setString(3,CC.getText());
            pps.setString(4,NC.getText());
            pps.setString(5,PAIS.getText());
            pps.setString(6,DIREC.getText());
            pps.setString(7,DES1.getText());
            pps.setString(8,CANT1.getText());
            pps.setString(9,PU1.getText());
            pps.setString(10,MON1.getText());
            pps.setString(11,ENTRENOM.getText());
            pps.setString(12,ENCO.getText());
            pps.setString(13,NOMRECI.getText());
            pps.setString(14,CODRECI.getText());
            pps.setString(15,FORPAGO.getText());
            pps.setString(16,ENVIO.getText());

  
           
            int n= pps.executeUpdate(); 
      
            if (n>0){
            JOptionPane.showMessageDialog(null,"Registro exitoso");
            }
            else 
            {
                 JOptionPane.showMessageDialog(null,"Error");
            }
            
            cn.close();
        }catch(SQLException ex){
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE,null,ex);
           // TODO
    }                                    
        
        
        
    }//GEN-LAST:event_VUEL2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CANT1;
    private javax.swing.JFormattedTextField CANT2;
    private javax.swing.JFormattedTextField CANT3;
    private javax.swing.JFormattedTextField CANT4;
    private javax.swing.JFormattedTextField CANT5;
    private javax.swing.JFormattedTextField CC;
    private javax.swing.JFormattedTextField CODRECI;
    private javax.swing.JFormattedTextField DES1;
    private javax.swing.JFormattedTextField DES2;
    private javax.swing.JFormattedTextField DES3;
    private javax.swing.JFormattedTextField DES4;
    private javax.swing.JFormattedTextField DES5;
    private javax.swing.JFormattedTextField DIREC;
    private javax.swing.JFormattedTextField ENCO;
    private javax.swing.JFormattedTextField ENTRENOM;
    private javax.swing.JFormattedTextField ENVIO;
    private javax.swing.JFormattedTextField FECHA;
    private javax.swing.JFormattedTextField FORPAGO;
    private javax.swing.JFormattedTextField IDFAC;
    private javax.swing.JFormattedTextField MON1;
    private javax.swing.JFormattedTextField MON2;
    private javax.swing.JFormattedTextField MON3;
    private javax.swing.JFormattedTextField MON4;
    private javax.swing.JFormattedTextField MON5;
    private javax.swing.JFormattedTextField NC;
    private javax.swing.JFormattedTextField NOMRECI;
    private javax.swing.JFormattedTextField PAIS;
    private javax.swing.JFormattedTextField PU1;
    private javax.swing.JFormattedTextField PU2;
    private javax.swing.JFormattedTextField PU3;
    private javax.swing.JFormattedTextField PU4;
    private javax.swing.JFormattedTextField PU5;
    private javax.swing.JButton VUEL;
    private javax.swing.JButton VUEL1;
    private javax.swing.JButton VUEL2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField total;
    // End of variables declaration//GEN-END:variables
}
