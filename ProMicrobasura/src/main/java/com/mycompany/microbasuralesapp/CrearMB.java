/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.microbasuralesapp;

import java.awt.Color;

/**
 *
 * @author Sebyshe
 */
public class CrearMB extends javax.swing.JFrame {

    /**
     * Creates new form CrearMB
     */
    public CrearMB() {
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        latitudTxt = new javax.swing.JTextField();
        longitudTxt = new javax.swing.JTextField();
        calleTxt = new javax.swing.JTextField();
        numCalleTxt = new javax.swing.JTextField();
        botonCrear = new javax.swing.JButton();
        Volver = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("Inserte datos de Microbasural");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        latitudTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        latitudTxt.setForeground(new java.awt.Color(204, 204, 204));
        latitudTxt.setText("00.00000000");
        latitudTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                latitudTxtMouseClicked(evt);
            }
        });
        latitudTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latitudTxtActionPerformed(evt);
            }
        });
        jPanel1.add(latitudTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 220, -1));

        longitudTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        longitudTxt.setForeground(new java.awt.Color(204, 204, 204));
        longitudTxt.setText("00.00000000");
        longitudTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                longitudTxtMouseClicked(evt);
            }
        });
        jPanel1.add(longitudTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, -1));

        calleTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        calleTxt.setForeground(new java.awt.Color(204, 204, 204));
        calleTxt.setText("Nombre de la calle");
        calleTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calleTxtMouseClicked(evt);
            }
        });
        jPanel1.add(calleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, -1));

        numCalleTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        numCalleTxt.setForeground(new java.awt.Color(204, 204, 204));
        numCalleTxt.setText("Numero de la Calle");
        numCalleTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numCalleTxtMouseClicked(evt);
            }
        });
        numCalleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numCalleTxtActionPerformed(evt);
            }
        });
        jPanel1.add(numCalleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 220, -1));

        botonCrear.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        botonCrear.setText("CREAR");
        botonCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        jPanel1.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numCalleTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCalleTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCalleTxtActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        
        MicroBasural nuevoMB = new MicroBasural();
        nuevoMB.setLatitud(Float.parseFloat(latitudTxt.getText()));
        nuevoMB.setLongitud(Float.parseFloat(longitudTxt.getText()));
        nuevoMB.setCalle(calleTxt.getText());
        nuevoMB.setNCalle(Integer.parseInt(numCalleTxt.getText()));
        
        nuevoMB.Crear(nuevoMB);
    }//GEN-LAST:event_botonCrearActionPerformed

    private void latitudTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latitudTxtMouseClicked
        if(latitudTxt.getText().equals("00.00000000")){
            latitudTxt.setText("");
            latitudTxt.setForeground(Color.black);
        }
        if(longitudTxt.getText().isEmpty()){
            longitudTxt.setText("00.00000000");
            longitudTxt.setForeground(Color.gray);
        }
        if(calleTxt.getText().isEmpty()){
            calleTxt.setText("Nombre de la calle");
            calleTxt.setForeground(Color.gray);
        }
        if(numCalleTxt.getText().isEmpty()){
            numCalleTxt.setText("Numero de la calle");
            numCalleTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_latitudTxtMouseClicked

    private void longitudTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_longitudTxtMouseClicked
        if(longitudTxt.getText().equals("00.00000000")){
            longitudTxt.setText("");
            longitudTxt.setForeground(Color.black);
        }
        if(latitudTxt.getText().isEmpty()){
            latitudTxt.setText("00.00000000");
            latitudTxt.setForeground(Color.gray);
        }
        if(calleTxt.getText().isEmpty()){
            calleTxt.setText("Nombre de la calle");
            calleTxt.setForeground(Color.gray);
        }
        if(numCalleTxt.getText().isEmpty()){
            numCalleTxt.setText("Numero de la calle");
            numCalleTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_longitudTxtMouseClicked

    private void calleTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calleTxtMouseClicked
        if(calleTxt.getText().equals("Nombre de la calle")){
            calleTxt.setText("");
            calleTxt.setForeground(Color.black);
        }
        if(latitudTxt.getText().isEmpty()){
            latitudTxt.setText("00.00000000");
            latitudTxt.setForeground(Color.gray);
        }
        if(longitudTxt.getText().isEmpty()){
            longitudTxt.setText("00.00000000");
            longitudTxt.setForeground(Color.gray);
        }
        if(numCalleTxt.getText().isEmpty()){
            numCalleTxt.setText("Numero de la calle");
            numCalleTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_calleTxtMouseClicked

    private void numCalleTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numCalleTxtMouseClicked
        if(numCalleTxt.getText().equals("Numero de la calle")){
            numCalleTxt.setText("");
            numCalleTxt.setForeground(Color.black);
        }
        if(latitudTxt.getText().isEmpty()){
            latitudTxt.setText("00.00000000");
            latitudTxt.setForeground(Color.gray);
        }
        if(longitudTxt.getText().isEmpty()){
            longitudTxt.setText("00.00000000");
            longitudTxt.setForeground(Color.gray);
        }
        if(calleTxt.getText().isEmpty()){
            calleTxt.setText("Nombre de la calle");
            calleTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_numCalleTxtMouseClicked

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuMB menumb = new MenuMB();
        menumb.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

    private void latitudTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latitudTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latitudTxtActionPerformed

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
            java.util.logging.Logger.getLogger(CrearMB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearMB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton botonCrear;
    private javax.swing.JTextField calleTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField latitudTxt;
    private javax.swing.JTextField longitudTxt;
    private javax.swing.JTextField numCalleTxt;
    // End of variables declaration//GEN-END:variables
}