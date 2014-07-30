/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class23;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author CASA
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();

        buttonGroup1.add(rbFemenino);
        buttonGroup1.add(rbMasculino);
        buttonGroup1.add(rbIndefinido);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEmails = new javax.swing.JTextArea();
        txtEmail = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        cmbPais = new javax.swing.JComboBox();
        chkEspañol = new javax.swing.JCheckBox();
        chkIngles = new javax.swing.JCheckBox();
        chkFrances = new javax.swing.JCheckBox();
        btnIdioma = new javax.swing.JButton();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        rbIndefinido = new javax.swing.JRadioButton();
        btnValidar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnOpciones = new javax.swing.JMenu();
        mnColorAmarillo = new javax.swing.JMenuItem();
        mnColorRojo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 51, 0));
        lblTitulo.setText("Hola Mundo");

        txtValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor2ActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.setToolTipText("");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtEmails.setColumns(20);
        txtEmails.setRows(5);
        jScrollPane1.setViewportView(txtEmails);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cmbPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Costa Rica", "Alemania", "Argentina", "Panama" }));
        cmbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisActionPerformed(evt);
            }
        });

        chkEspañol.setText("Español");

        chkIngles.setText("Ingles");

        chkFrances.setText("Frances");

        btnIdioma.setText("Idioma");
        btnIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomaActionPerformed(evt);
            }
        });

        rbMasculino.setText("Masclino");

        rbFemenino.setText("Femenino");

        rbIndefinido.setText("Indefinido");

        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        mnOpciones.setText("Opciones");
        mnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpcionesActionPerformed(evt);
            }
        });

        mnColorAmarillo.setText("Color Amarillo");
        mnColorAmarillo.setToolTipText("");
        mnColorAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnColorAmarilloActionPerformed(evt);
            }
        });
        mnOpciones.add(mnColorAmarillo);

        mnColorRojo.setText("Color Rojo");
        mnColorRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnColorRojoActionPerformed(evt);
            }
        });
        mnOpciones.add(mnColorRojo);

        jMenuBar1.add(mnOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnEnviar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkEspañol)
                            .addComponent(chkIngles)
                            .addComponent(chkFrances)
                            .addComponent(btnIdioma))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(txtEmail))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregar)
                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbMasculino, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFemenino, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbIndefinido, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(29, 29, 29)
                        .addComponent(btnValidar)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(chkEspañol))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkIngles)
                        .addGap(26, 26, 26)
                        .addComponent(chkFrances)
                        .addGap(18, 18, 18)
                        .addComponent(btnIdioma))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(rbMasculino)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFemenino)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnValidar)
                                .addGap(12, 12, 12)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbIndefinido)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor2ActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:

        int resultado = Integer.valueOf(txtValor1.getText()) + Integer.valueOf(txtValor2.getText());
        lblTitulo.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        txtEmails.append(txtEmail.getText() + "\n");
        txtEmail.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, cmbPais.getSelectedItem());
    }//GEN-LAST:event_cmbPaisActionPerformed

    private void btnIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdiomaActionPerformed
        // TODO add your handling code here:

        if (chkEspañol.isSelected()) {
            JOptionPane.showMessageDialog(null, "Ha seleccionado Español");

        }
        if (chkIngles.isSelected()) {
            JOptionPane.showMessageDialog(null, "Ha seleccionado Ingles");

        }
        if (chkFrances.isSelected()) {
            JOptionPane.showMessageDialog(null, "Ha seleccionado Frances");

        }
    }//GEN-LAST:event_btnIdiomaActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        // TODO add your handling code here:
        if (rbFemenino.isSelected()) {
            JOptionPane.showMessageDialog(null, "Ha seleccionado Femenino");

        }
        if (rbMasculino.isSelected()) {
            JOptionPane.showMessageDialog(null, "Ha seleccionado Masculino");

        }
        if (rbIndefinido.isSelected()) {
            JOptionPane.showMessageDialog(null, "Ha seleccionado Indefinido");

        }
    }//GEN-LAST:event_btnValidarActionPerformed

    private void mnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpcionesActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_mnOpcionesActionPerformed

    private void mnColorAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnColorAmarilloActionPerformed
        // TODO add your handling code here:
         if (evt.getSource() == mnColorAmarillo)
                {
            getContentPane().setBackground(Color.yellow);
        }
    }//GEN-LAST:event_mnColorAmarilloActionPerformed

    private void mnColorRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnColorRojoActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == mnColorRojo)
                {
            getContentPane().setBackground(Color.red);
        }
    }//GEN-LAST:event_mnColorRojoActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnIdioma;
    private javax.swing.JButton btnValidar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkEspañol;
    private javax.swing.JCheckBox chkFrances;
    private javax.swing.JCheckBox chkIngles;
    private javax.swing.JComboBox cmbPais;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mnColorAmarillo;
    private javax.swing.JMenuItem mnColorRojo;
    private javax.swing.JMenu mnOpciones;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbIndefinido;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtEmails;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}
