/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import javax.swing.JOptionPane;
import javax.swing.*;
import Clases.Estado;
import Clases.Operaciones;
/**
 *
 * @author E7240
 */
public class frmEstado extends javax.swing.JFrame {

    /**
     * Creates new form frmEstado
     */
    Operaciones op = new Operaciones();
    int index= -1;
    public frmEstado() {
        initComponents();
        
        txtCodigo.setEnabled(false);
        txtEstado.setEnabled(false);
        
        
        btnOK.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnSalir.setEnabled(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        jLabel1.setText("Codigo:");

        txtCodigo.setName("txtCodigo"); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jLabel2.setText("Estado:");

        txtEstado.setName("txtEstado"); // NOI18N

        btnOK.setText("OK");
        btnOK.setName("btnOK"); // NOI18N
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo)
                            .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                    .addComponent(btnOK))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnOK)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 220, 290));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifier.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setName("btnConsultar"); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disk.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setName("btnGuardar"); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/drive_user.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setName("btnNuevo"); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pencil.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setName("btnModificar"); // NOI18N
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setName("btnEliminar"); // NOI18N
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/door_in.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setName("btnSalir"); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-estado-desconocido-64_1.png"))); // NOI18N
        jLabel3.setText("Estado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       frmPrincipal prin = new frmPrincipal();
        prin.setVisible(true);
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se puede digitar numeros");
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        txtCodigo.setText("");
        txtEstado.setText("");
        
        txtCodigo.setEnabled(true);
        txtEstado.setEnabled(true);
        
        btnConsultar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnOK.setEnabled(false);
        btnSalir.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        txtCodigo.setText("");
        txtEstado.setText("");
        
        
        
        txtCodigo.setEnabled(true);
        txtEstado.setEnabled(false);
        
        btnConsultar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnOK.setEnabled(false);
        btnSalir.setEnabled(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        boolean v= false;
        
        if(txtCodigo.getText().isEmpty()||txtEstado.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No pueden quedar espacios en blanco");
        }
        else{
        int cod= Integer.parseInt(txtCodigo.getText());
        
        for(int i=0;i<op.array_Estado.size();i++){
            
            Estado est = (Estado)op.array_Estado.get(i);
            if(op.array_Estado.get(i).getCodFarmaco()==cod){
                v=true;
            }
        }
        if(v==true){
            JOptionPane.showMessageDialog(null, "El codigo ya tiene referencia, ingrese otro");
        }
        else{
            int codFarmaco= Integer.parseInt(txtCodigo.getText());
            String CodEstado= txtEstado.getText();
            
            op.agregar(codFarmaco, CodEstado);
        
        }
        }
        
        
        txtCodigo.setText("");
        txtEstado.setText("");
        
        
        
        txtCodigo.setEnabled(false);
        txtEstado.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnOK.setEnabled(false);
        btnSalir.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        
        boolean v= false;
        
        if(txtCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No pueden quedar espacios en blanco");
        }
        else{
        int cod= Integer.parseInt(txtCodigo.getText());
        
        for(int i=0;i<op.array_Estado.size();i++){
            
            Estado est = (Estado)op.array_Estado.get(i);
            if(op.array_Estado.get(i).getCodFarmaco()==cod){
                v=true;
            }
        }
        if(v==true){
            
            for(int i=0;i<op.array_Estado.size();i++){
                
                Estado est = (Estado)op.array_Estado.get(i);
                if(op.array_Estado.get(i).getCodFarmaco()==cod){
                txtEstado.setText(est.getCodEstado());
                }
            }
            }
        else{
            JOptionPane.showMessageDialog(null, "No se encontro ninguna credencial");
                    txtCodigo.setText("");
        }
        }
        txtCodigo.setEnabled(false);
        txtEstado.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnOK.setEnabled(false);
        btnSalir.setEnabled(true);
    }//GEN-LAST:event_btnOKActionPerformed

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
            java.util.logging.Logger.getLogger(frmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEstado;
    // End of variables declaration//GEN-END:variables
}