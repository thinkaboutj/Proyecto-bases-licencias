/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 *
 * @author jesus
 */
public class PlacasNuevas extends javax.swing.JFrame {

    /**
     * Creates new form PlacasNuevas
     */
    public PlacasNuevas() {
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

        Agrupador = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        txtLicencia = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblNumSerie = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblLinea = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblLicencia = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtLinea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agrupador.setBackground(new java.awt.Color(244, 244, 244));
        Agrupador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modulo de Placas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel2)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
        );

        Agrupador.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 70));

        btnVerificar.setBackground(new java.awt.Color(0, 51, 102));
        btnVerificar.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        Agrupador.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 190, 40));

        btnRegresar.setBackground(new java.awt.Color(0, 51, 102));
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        Agrupador.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 230, 50));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ingrese los datos del automovil");
        Agrupador.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        Agrupador.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 10, 530));

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Numero de serie:");
        Agrupador.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, -1));

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Marca:");
        Agrupador.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 120, -1));

        jLabel9.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Linea:");
        Agrupador.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, -1));

        jLabel10.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Color:");
        Agrupador.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 150, -1));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Modelo:");
        Agrupador.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 150, -1));

        jLabel12.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Licencia:");
        Agrupador.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 150, -1));

        txtNumSerie.setBackground(new java.awt.Color(255, 255, 255));
        txtNumSerie.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 290, -1));

        txtLicencia.setBackground(new java.awt.Color(255, 255, 255));
        txtLicencia.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 290, -1));

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 290, -1));

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 290, -1));

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 290, -1));

        jLabel17.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Marca:");
        Agrupador.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 120, -1));

        jLabel18.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Linea:");
        Agrupador.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 130, -1));

        jLabel19.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Color:");
        Agrupador.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 150, -1));

        jLabel20.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Licencia:");
        Agrupador.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 150, -1));

        jLabel25.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Comprobante Solicitud");
        Agrupador.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 170, -1));

        lblNumSerie.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblNumSerie.setForeground(new java.awt.Color(0, 0, 0));
        lblNumSerie.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 120, -1));

        lblMarca.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(0, 0, 0));
        lblMarca.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 120, -1));

        lblLinea.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblLinea.setForeground(new java.awt.Color(0, 0, 0));
        lblLinea.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 120, -1));

        lblColor.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblColor.setForeground(new java.awt.Color(0, 0, 0));
        lblColor.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 120, -1));

        lblLicencia.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblLicencia.setForeground(new java.awt.Color(0, 0, 0));
        lblLicencia.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 120, -1));

        btnConfirmar.setBackground(new java.awt.Color(0, 51, 102));
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        Agrupador.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 190, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/notas (2).png"))); // NOI18N
        Agrupador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 20, 20));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Una vez haya revisado todo de confirmar\n");
        Agrupador.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 240, 30));

        jLabel31.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Num. de serie");
        Agrupador.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 120, -1));

        txtLinea.setBackground(new java.awt.Color(255, 255, 255));
        txtLinea.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Agrupador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:

        Inicio inicio = new Inicio();

        inicio.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(PlacasNuevas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlacasNuevas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlacasNuevas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlacasNuevas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlacasNuevas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupador;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblLicencia;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNumSerie;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLicencia;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNumSerie;
    // End of variables declaration//GEN-END:variables
}
