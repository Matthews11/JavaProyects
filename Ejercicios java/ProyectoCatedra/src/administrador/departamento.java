/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscar
 */
public class departamento extends javax.swing.JInternalFrame {

        DefaultTableModel model;
     
        public void actualizarTabla() throws SQLException {
       
            btnEliminar.setEnabled(true);
            btnLimpiar.setEnabled(true);
            btnAgregar.setEnabled(true);
            btnActualizar.setEnabled(true);
        

        model = new DefaultTableModel();

        model.addColumn("Id_Departamento");
        model.addColumn("Nombre_Departamento");
        model.addColumn("Tipo_Departamento");
        model.addColumn("Id_Empleados");
        model.addColumn("Id_JefeD");
        
        String codigo = "", nombre = "", tipo= "", empleados = "", jefe= "" ;
         conexionA con = new conexionA();
        String sql = "SELECT * FROM Departamentos";
        ResultSet rs;
        con.setRs(sql);
        rs = con.getRs();
        
       
        while (rs.next()) {
            codigo = rs.getString("Id_Departamento");
            nombre = rs.getString("Nombre_Departamento");
            tipo = rs.getString("Tipo_Departamento");
            empleados = rs.getString("Id_Empleados");
            jefe = rs.getString("Id_JefeD");
            
            
            model.addRow(new Object[]{codigo, nombre, tipo, empleados, jefe});
        }
        tableDepartamento.setModel(model);
        con.cerrarConexion();
        
    }
    public departamento() throws SQLException {
        initComponents();
         actualizarTabla();
       
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDepartamento = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNoDe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtJefe = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Departamento");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tableDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Departamento", "N. de Departamentos", "Tipo Departamento", "ID Empleados", "ID Jefes"
            }
        ));
        tableDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDepartamentoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableDepartamento);

        jLabel1.setText("Nombre de Departamento:");

        jLabel2.setText("ID Departamento:");

        jLabel3.setText("Tipo Departamento:");

        jLabel4.setText("ID Empleados:");

        jLabel5.setText("ID Jefes:");

        btnAgregar.setText("Agregar ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Relacion");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.setPreferredSize(new java.awt.Dimension(85, 23));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(btnAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNoDe, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnEliminar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:6666/pooo", "root", "12345");
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        int Id_Departamento = Integer.parseInt(txtDepartamento.getText() ) ;
        String Nombre_Departamento = txtNoDe.getText();
        int Tipo_Departamento = Integer.parseInt(txtTipo.getText() ) ;
        int Id_Empleados = Integer.parseInt(txtEmpleado.getText() ) ;
        int Id_JefeD = Integer.parseInt(txtJefe.getText() ) ;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Departamentos (Id_Departamento,Nombre_Departamento, Tipo_Departamento, Id_Empleados, Id_JefeD) VALUES(?,?,?,?,?)");
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.setInt(
                1, Id_Departamento);
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.setString(
                2, Nombre_Departamento);
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.setInt(
                3, Tipo_Departamento);
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.setInt(
                4, Id_Empleados);
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            stmt.setInt(
                5, Id_JefeD);
        } catch (SQLException ex) {

            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            int i = stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Departamento fue registrado con exito.");
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            actualizarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tableDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDepartamentoMouseClicked
        btnEliminar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnLimpiar.setEnabled(true);
        btnAgregar.setEnabled(true);
        int fila = tableDepartamento.getSelectedRow();
        if ((fila > -1)) {
            txtDepartamento.setText(model.getValueAt(fila, 0).toString());
            txtNoDe.setText(model.getValueAt(fila, 1).toString());
            txtTipo.setText(model.getValueAt(fila, 2).toString());
            txtEmpleado.setText(model.getValueAt(fila, 3).toString());
            txtJefe.setText(model.getValueAt(fila, 4).toString());
           

        }
    }//GEN-LAST:event_tableDepartamentoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        conexionA con = null;
        try {
            con = new conexionA();
        } catch (SQLException ex) {
            Logger.getLogger(gFuncional.class.getName()).log(Level.SEVERE, null, ex);
        }
        int fila = tableDepartamento.getSelectedRow();
        String codigo = model.getValueAt(fila, 0).toString();
        String sql = "DELETE FROM Departamentos WHERE Id_Departamento=" + codigo;
        try {
            con.setQuery(sql);
            JOptionPane.showMessageDialog(null, "El Departamento fue borrado con exito.");
        } catch (SQLException ex) {
            Logger.getLogger(gFuncional.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(gFuncional.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            actualizarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(gFuncional.class.getName()).log(Level.SEVERE, null, ex);
        }

        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    }//GEN-LAST:event_btnEliminarActionPerformed

        
         private void limpiarText() {
        txtDepartamento.setText("");
        txtNoDe.setText("");
        txtTipo.setText("");
        txtJefe.setText("");
        txtEmpleado.setText("");
    }
         
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:

       try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(gDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:6666/pooo", "root", "12345");
        } catch (SQLException ex) {
            Logger.getLogger(gDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
        }
        int fila = tableDepartamento.getSelectedRow();
        String Id_Departamento = model.getValueAt(fila, 0).toString();
        String Nombre_Departamento = txtNoDe.getText();
        int Tipo_Departamento = Integer.parseInt(txtTipo.getText()) ;
        int Id_Empleados = Integer.parseInt(txtEmpleado.getText()) ;
        int Id_JefeD  = Integer.parseInt(txtJefe.getText())  ; 
     
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE Departamentos SET Nombre_Departamento=?, Tipo_Departamento=?, Id_Empleados=?, Id_JefeD=? "
                    + "  WHERE Id_Departamento="+Id_Departamento);
        } catch (SQLException ex) {
            Logger.getLogger(gDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            stmt.setString(
                    1, Nombre_Departamento);
        } catch (SQLException ex) {
            Logger.getLogger(gDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.setInt(
                    2, Tipo_Departamento);
        } catch (SQLException ex) {
            Logger.getLogger(gDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.setInt(
                    3, Id_Empleados);
        } catch (SQLException ex) {
            Logger.getLogger(gDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.setInt(
                    4, Id_JefeD);
        } catch (SQLException ex) {
            Logger.getLogger(gDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            int i = stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Jefe de Desarrollo fue actualizado con exito.");
        } catch (SQLException ex) {
            Logger.getLogger(gDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(gDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
        }

          try {
            actualizarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(gDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
         limpiarText();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDepartamento;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtJefe;
    private javax.swing.JTextField txtNoDe;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
