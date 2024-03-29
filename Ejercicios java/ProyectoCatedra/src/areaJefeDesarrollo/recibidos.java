/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaJefeDesarrollo;
import Herramientas.Conexion; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lalo
 */
public class recibidos extends javax.swing.JInternalFrame {

    /**
     * Creates new form recibidos
     */
    DefaultTableModel mtd;

    private final String SQL_SELECT = "select Id_Caso , Descripcion FROM Caso ";
    private final String SQL_SELECT2 = "select * from Caso ";
    /**
     * Creates new form Ver
     */
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public recibidos() {
        try {
            initComponents();

            Object[][] data = null;
            String[] columns
                    = {
                        "Id_Caso", "Descripcion"
                    };

            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            mtd = new DefaultTableModel(data, columns);
            this.caso.setModel(mtd);
            generarListado();

        } catch (SQLException ex) {
            Logger.getLogger(recibidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void generarListado() throws SQLException {
        while (rs.next()) {
            Object[] newRow = {rs.getInt(1), rs.getString(2)};
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

        Opcion = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        caso = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCC = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Recibidos");

        caso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Descripción"
            }
        ));
        jScrollPane1.setViewportView(caso);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Opciones para el caso");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Rechazar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setText("Buzón");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnCC.setText("Ver codigo del caso");
        btnCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCActionPerformed(evt);
            }
        });

        Opcion.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Opcion.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Opcion.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Opcion.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Opcion.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Opcion.setLayer(btnCC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout OpcionLayout = new javax.swing.GroupLayout(Opcion);
        Opcion.setLayout(OpcionLayout);
        OpcionLayout.setHorizontalGroup(
            OpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(OpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OpcionLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(OpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OpcionLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(OpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(OpcionLayout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton2))))
                            .addGroup(OpcionLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btnCC))))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OpcionLayout.setVerticalGroup(
            OpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(OpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OpcionLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpcionLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(OpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(39, 39, 39)
                        .addComponent(btnCC)))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Opcion)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Opcion)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //aceptado
        int Codigo;
        String Fecha, COD;
        Codigo = generarCodigo();
        Fecha = fecha();

        CodCaso(Fecha, Codigo);
        aceptado Ban = new aceptado();
        Opcion.add(Ban);
        Ban.show();


    }//GEN-LAST:event_jButton1ActionPerformed

  
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // rechazado:
        rechazado rec = new rechazado();
        Opcion.add(rec);
        rec.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCActionPerformed
        // TODO add your handling code here:
        int Codigo;
        String Fecha, COD;
        Codigo = generarCodigo();
        Fecha = fecha();

        CodCaso(Fecha, Codigo);

    }//GEN-LAST:event_btnCCActionPerformed

  public int generarCodigo() {
        int Codigo = 0;

        for (int i = 1; i <= 3; i++) {
            Codigo = ((int) (Math.random() * 900 + 100));

        }
        return Codigo;

    }

    public String fecha() {
        int año;
        String años2, años;
        Calendar fecha = new GregorianCalendar();
        año = fecha.get(Calendar.YEAR);
        años2 = String.valueOf(año);
        años = años2.substring(2, 4);

        return años;
    }
    
     public void CodCaso(String Fecha, int Codigo) {
        int a;
        String depa, Estado = "en espera de respuesta", es;
        Connection con = null;
        PreparedStatement ingresar = null;
        ResultSet rs = null;

        try {
            con = Conexion.getConnection();
            ingresar = con.prepareStatement(SQL_SELECT2);
            rs = ingresar.executeQuery();

            while (rs.next()) {
               
                    depa = rs.getString("Departamento"); 
                    String depa2 = depa.substring(0, 3);
                    JOptionPane.showMessageDialog(this, "El codigo del caso es:" + depa2 + "\n La fecha es :" + Fecha + "\n el codigo es " + Codigo);
                 
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ingresar);
            Conexion.close(con);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Opcion;
    private javax.swing.JButton btnCC;
    private javax.swing.JTable caso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
