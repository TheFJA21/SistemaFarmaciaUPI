package Cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E7240
 */
import java.util.ArrayList;
import Clases.Bodega;
import Clases.Operaciones;
import javax.swing.*;

public class frmBodega extends javax.swing.JFrame {

    /**
     * Creates new form frmBodega
     */
    int index= -1;
    Operaciones op = new Operaciones();
    public frmBodega() {
        initComponents();
        txtCodFar.setEnabled(false);
        txtCant.setEnabled(false);
        txtEstado.setEnabled(false);
        txtSucursal.setEnabled(false);
        
        btnOK.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodFar = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        txtSucursal = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bodega"));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Codigo Farmaco:");
        jLabel2.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Cantidad:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Sucursal:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Estado:");

        txtCodFar.setName("txtCodFar"); // NOI18N
        txtCodFar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodFarKeyTyped(evt);
            }
        });

        txtCant.setName("txtCant"); // NOI18N
        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantKeyTyped(evt);
            }
        });

        txtSucursal.setName("txtSucursal"); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOK)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCodFar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addComponent(txtCant)
                        .addComponent(txtSucursal)
                        .addComponent(txtEstado)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodFar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 290, 330));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/drive_user.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setName("btnNuevo"); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pencil.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setName("btnModificar"); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/magnifier.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setName("btnConsultar"); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel6.setText("* Para consultar, modificar o eliminar, digite el codigo del farmaco.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disk.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setName("btnGuardar"); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/door_in.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setName("btnSalir"); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-almacén-30.png"))); // NOI18N
        jLabel7.setText("Bodega");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCodFarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodFarKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLetter(c)){
            JOptionPane.showMessageDialog(null, "No se puede digitar letras");
        }
    }//GEN-LAST:event_txtCodFarKeyTyped

    private void txtCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            JOptionPane.showMessageDialog(null, "No se pueden digitar letras");
        }
    }//GEN-LAST:event_txtCantKeyTyped

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        txtCodFar.setEnabled(true);
        txtCant.setEnabled(false);
        txtEstado.setEnabled(false);
        txtSucursal.setEnabled(false);
        
        btnConsultar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSalir.setEnabled(true);
        btnOK.setEnabled(true);
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtCodFar.setEnabled(true);
        txtCant.setEnabled(true);
        txtEstado.setEnabled(true);
        txtSucursal.setEnabled(true);
        
        btnOK.setEnabled(false);
        btnConsultar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSalir.setEnabled(true);
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean v= false;
        if(txtCodFar.getText().isEmpty()||txtCant.getText().isEmpty()||txtEstado.getText().isEmpty()||txtSucursal.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No se puede dejar espacios en blanco");
        }else{
        int codigo= Integer.parseInt(txtCodFar.getText());
        
        for(int i=0; i<op.array_Bodega.size();i++){
            Bodega bod = (Bodega)op.array_Bodega.get(i);
            if(op.array_Bodega.get(i).getCodFarmaco()==codigo){
                v= true;
            }
        }
            
        
        if(v==true){
            JOptionPane.showMessageDialog(null, "Este farmaco ya existe");
        }else{
            int codFarmaco= Integer.parseInt(txtCodFar.getText());
            int cantidad= Integer.parseInt(txtCant.getText());
            String codEstado= txtEstado.getText();
            String sucursal= txtSucursal.getText();
            
            op.agregar(codFarmaco, codEstado, cantidad, sucursal);
        }
      }
        txtCodFar.setText("");
        txtEstado.setText("");
        txtCant.setText("");
        txtSucursal.setText("");
        
        txtCodFar.setEnabled(false);
        txtCant.setEnabled(false);
        txtEstado.setEnabled(false);
        txtSucursal.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSalir.setEnabled(true);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        boolean v= false;
        if(txtCodFar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No se ha digitado un codigo de farmaco");
        }
        else{
            int codigo= Integer.parseInt(txtCodFar.getText());
            
            for(int i=0; i<op.array_Bodega.size();i++){
                Bodega bod = (Bodega)op.array_Bodega.get(i);
                
                if(op.array_Bodega.get(i).getCodFarmaco()== codigo){
                    v= true;
                }
            }
            if(v==true){
                
                for(int i=0;i<op.array_Bodega.size();i++){
                    Bodega bod = (Bodega)op.array_Bodega.get(i);
                    if(op.array_Bodega.get(i).getCodFarmaco() == codigo){
                        txtCant.setText(String.valueOf(bod.getCantidad()));
                        txtEstado.setText(String.valueOf(bod.getCodEstado()));
                        txtSucursal.setText(String.valueOf(bod.getSucursal()));
                        
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro ningun farmaco");
            txtCodFar.setText("");
        
            }
        }
        txtCodFar.setEnabled(true);
        txtCant.setEnabled(true);
        txtEstado.setEnabled(true);
        txtSucursal.setEnabled(true);
        
        btnConsultar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnSalir.setEnabled(true);
        btnOK.setEnabled(false);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        boolean v= false;
        int valor= Integer.parseInt(txtCodFar.getText());
        index= op.encuentraBodega(valor);
        if(index!=-1){
        if(txtCodFar.getText().isEmpty()||txtCant.getText().isEmpty()||txtEstado.getText().isEmpty()||txtSucursal.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No se puede dejar espacios en blanco");
        }else{
        
        
        for(int i=0; i<op.array_Bodega.size();i++){
            Bodega bod = (Bodega)op.array_Bodega.get(i);
            if(op.array_Bodega.get(i).getCodFarmaco()==valor){
                v= true;
            }
        }
            
        
        if(v==true){
        for(int i=0; i<op.array_Bodega.size();i++){
            Bodega bod = (Bodega)op.array_Bodega.get(i);
            if(op.array_Bodega.get(i).getCodFarmaco()==valor){
            int codFarmaco= Integer.parseInt(txtCodFar.getText());
            int cantidad= Integer.parseInt(txtCant.getText());
            String codEstado= txtEstado.getText();
            String sucursal= txtSucursal.getText();
            op.modificar(index, codFarmaco, codEstado, cantidad, sucursal);
            }
        }
            
        }
        }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
                boolean v = false;
        int cod= Integer.parseInt(txtCodFar.getText());
        if(txtCodFar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite un numero de cedula");
        }
        else{
            for(int i=0; i<op.array_Bodega.size(); i++){
                
                if(op.array_Bodega.get(i).getCodFarmaco()== cod){
                    v= true;
                }
                
            }
        
        
        if(v==true){
            for(int i=0;i<op.array_Bodega.size();i++){
                if(op.array_Bodega.get(i).getCodFarmaco()==cod){
                    op.array_Bodega.remove(i);
                    v=true;
                    JOptionPane.showMessageDialog(null, "Se eliminaron correctamente los datos");
                }
                
        
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "No se encontro el farmaco");
        }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(frmBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBodega().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodFar;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtSucursal;
    // End of variables declaration//GEN-END:variables
}
