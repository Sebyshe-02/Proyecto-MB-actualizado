/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.microbasuralesapp;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Sebyshe
 */
public class MenuUsuario extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    
    /**
     * Creates new form UsuarioGrafico
     */
    public MenuUsuario() {
        initComponents();
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
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cuadroNickname = new javax.swing.JTextField();
        cuadroNombre = new javax.swing.JTextField();
        cuadroCorreo = new javax.swing.JTextField();
        cuadroContraseña = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 3, 24)); // NOI18N
        jLabel1.setText("Ingresar datos:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 170, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        jLabel3.setText("Nombre de usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        jLabel5.setText("Correo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 90, -1));

        cuadroNickname.setText("Ingresar nombre de usuario");
        cuadroNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroNicknameActionPerformed(evt);
            }
        });
        jPanel1.add(cuadroNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 240, -1));

        cuadroNombre.setText("Ingrese nombre");
        cuadroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroNombreActionPerformed(evt);
            }
        });
        jPanel1.add(cuadroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 240, -1));

        cuadroCorreo.setText("Ingrese correo electronico");
        cuadroCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(cuadroCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 240, -1));

        cuadroContraseña.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        cuadroContraseña.setText("jPasswordField1");
        jPanel1.add(cuadroContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 240, 20));

        jButton1.setText("Ingresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed

        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

    private void cuadroNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroNicknameActionPerformed
        
    }//GEN-LAST:event_cuadroNicknameActionPerformed

    private void cuadroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroNombreActionPerformed

    private void cuadroCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroCorreoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Usuario objetoUsuario = new Usuario();
        
        objetoUsuario.setNickname(cuadroNickname.getText());
        objetoUsuario.setNombre(cuadroNombre.getText());
        objetoUsuario.setCorreo(cuadroCorreo.getText());
        objetoUsuario.setPassword(cuadroContraseña.getText());
        
        usuario.CrearUsuario(objetoUsuario);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JPasswordField cuadroContraseña;
    private javax.swing.JTextField cuadroCorreo;
    private javax.swing.JTextField cuadroNickname;
    private javax.swing.JTextField cuadroNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
