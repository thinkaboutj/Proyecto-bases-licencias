/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 *
 * @author jesus
 */
public class Licencias extends javax.swing.JFrame {

    /**
     * Creates new form Licencias
     */
    public Licencias() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        checkbox3 = new java.awt.Checkbox();
        checkbox4 = new java.awt.Checkbox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        checkbox5 = new java.awt.Checkbox();
        checkbox6 = new java.awt.Checkbox();
        checkbox7 = new java.awt.Checkbox();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtAPaterno = new javax.swing.JTextField();
        txtAMaterno = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        lblVigencia = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDiscapacidad = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agrupador.setBackground(new java.awt.Color(244, 244, 244));
        Agrupador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modulo de Licencias");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel2)
                .addContainerGap(313, Short.MAX_VALUE))
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
        Agrupador.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 230, 50));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Seleccione un tipo de licencia:");
        Agrupador.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 240, -1));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Datos del solicitante");
        Agrupador.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

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

        checkbox1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        checkbox1.setLabel("Renovacion");
        Agrupador.add(checkbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        checkbox2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        checkbox2.setLabel("Primera Vez");
        Agrupador.add(checkbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo de tramite:");
        Agrupador.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, -1));

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre:");
        Agrupador.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Apellido Paterno:");
        Agrupador.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, -1));

        jLabel9.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Apellido Materno:");
        Agrupador.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, -1));

        jLabel10.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Fecha Nacimiento:");
        Agrupador.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, -1));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("RFC:");
        Agrupador.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 150, -1));

        jLabel12.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Telefono:");
        Agrupador.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 150, -1));

        checkbox3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        checkbox3.setLabel("Si");
        Agrupador.add(checkbox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        checkbox4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        checkbox4.setLabel("No");
        Agrupador.add(checkbox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Tipo:");
        Agrupador.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 70, -1));

        jLabel14.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Vigencia:");
        Agrupador.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 80, -1));

        ComboBoxTipo.setBackground(new java.awt.Color(255, 255, 255));
        ComboBoxTipo.setForeground(new java.awt.Color(0, 0, 0));
        ComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Agrupador.add(ComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 300, -1));

        jLabel15.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Discapacidad:");
        Agrupador.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, -1));

        checkbox5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        checkbox5.setLabel("1 año");
        Agrupador.add(checkbox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        checkbox6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        checkbox6.setLabel("3 años");
        Agrupador.add(checkbox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        checkbox7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        checkbox7.setLabel("2 años");
        Agrupador.add(checkbox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 290, -1));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 290, -1));

        txtAPaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtAPaterno.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtAPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 290, -1));

        txtAMaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtAMaterno.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtAMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 290, -1));

        txtRFC.setBackground(new java.awt.Color(255, 255, 255));
        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        Agrupador.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 290, -1));

        lblVigencia.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblVigencia.setForeground(new java.awt.Color(0, 0, 0));
        lblVigencia.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblVigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 120, -1));

        jLabel17.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Apellido Paterno:");
        Agrupador.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 120, -1));

        jLabel18.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Apellido Materno:");
        Agrupador.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 130, -1));

        jLabel19.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Fecha Nacimiento:");
        Agrupador.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 150, -1));

        jLabel20.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("RFC:");
        Agrupador.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 150, -1));

        jLabel21.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Telefono:");
        Agrupador.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 150, -1));

        jLabel22.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Discapacidad:");
        Agrupador.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 150, -1));

        jLabel23.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Vigencia:");
        Agrupador.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 80, -1));

        jLabel24.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Tipo:");
        Agrupador.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 70, -1));

        jLabel25.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Nombre:");
        Agrupador.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 120, -1));

        lblNombre.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 120, -1));

        lblApellidoPaterno.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidoPaterno.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 120, -1));

        lblApellidoMaterno.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblApellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidoMaterno.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 120, -1));

        lblFechaNacimiento.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaNacimiento.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 120, -1));

        lblRFC.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblRFC.setForeground(new java.awt.Color(0, 0, 0));
        lblRFC.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 120, -1));

        lblTelefono.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 120, -1));

        lblDiscapacidad.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblDiscapacidad.setForeground(new java.awt.Color(0, 0, 0));
        lblDiscapacidad.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblDiscapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 120, -1));

        lblTipo.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo.setText("xxxxxxxxxxxxxxx");
        Agrupador.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 120, -1));

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
            java.util.logging.Logger.getLogger(Licencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Licencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Licencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Licencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Licencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agrupador;
    private javax.swing.JComboBox<String> ComboBoxTipo;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerificar;
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private java.awt.Checkbox checkbox3;
    private java.awt.Checkbox checkbox4;
    private java.awt.Checkbox checkbox5;
    private java.awt.Checkbox checkbox6;
    private java.awt.Checkbox checkbox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblDiscapacidad;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVigencia;
    private javax.swing.JTextField txtAMaterno;
    private javax.swing.JTextField txtAPaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
