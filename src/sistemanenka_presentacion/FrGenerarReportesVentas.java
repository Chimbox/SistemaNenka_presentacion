/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanenka_presentacion;

/**
 *
 * @author dianacastro
 */
public class FrGenerarReportesVentas extends javax.swing.JFrame {

    /**
     * Creates new form FrGenerarReportesVentas
     */
    public FrGenerarReportesVentas() {
        initComponents();
        
        grupoBotones.add(rbtnSemana);
        grupoBotones.add(rbtnMes);
        grupoBotones.add(rbtnRangoFechas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAdministrador = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblFiltrar = new javax.swing.JLabel();
        cbFiltrar = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnGenerarReporte = new javax.swing.JButton();
        lblFechaFin = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        rbtnSemana = new javax.swing.JRadioButton();
        rbtnMes = new javax.swing.JRadioButton();
        rbtnRangoFechas = new javax.swing.JRadioButton();
        dcFechaInicio = new com.toedter.calendar.JDateChooser();
        dcFechaFin = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(47, 111, 159));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("SISTEMA NENKA");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 60));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 110));

        jPanel3.setBackground(new java.awt.Color(47, 118, 176));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdministrador.setBackground(new java.awt.Color(47, 118, 176));
        btnAdministrador.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administracion.png"))); // NOI18N
        btnAdministrador.setText("Administrador");
        btnAdministrador.setBorder(null);
        btnAdministrador.setBorderPainted(false);
        btnAdministrador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdministrador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 140, 90));

        btnVenta.setBackground(new java.awt.Color(47, 118, 176));
        btnVenta.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cesta-de-la-compra.png"))); // NOI18N
        btnVenta.setText("Venta");
        btnVenta.setToolTipText("");
        btnVenta.setBorder(null);
        btnVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenta.setMaximumSize(new java.awt.Dimension(134, 101));
        btnVenta.setMinimumSize(new java.awt.Dimension(134, 101));
        btnVenta.setPreferredSize(new java.awt.Dimension(134, 101));
        btnVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 90));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reporte Ventas");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 750, 110));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFiltrar.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblFiltrar.setText("Filtrar:");
        jPanel1.add(lblFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 100, 30));

        cbFiltrar.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        cbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbFiltrar.setBorder(null);
        jPanel1.add(cbFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 210, 30));

        btnCancelar.setBackground(new java.awt.Color(243, 69, 51));
        btnCancelar.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 130, 40));

        btnGenerarReporte.setBackground(new java.awt.Color(118, 194, 124));
        btnGenerarReporte.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnGenerarReporte.setText("GENERAR REPORTE");
        btnGenerarReporte.setBorder(null);
        btnGenerarReporte.setBorderPainted(false);
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 170, 40));

        lblFechaFin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblFechaFin.setText("Fecha fin:");
        jPanel1.add(lblFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 90, 30));

        lblFechaInicio.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblFechaInicio.setText("Fecha inicio:");
        jPanel1.add(lblFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, 30));

        rbtnSemana.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        rbtnSemana.setText("Semana pasada");
        jPanel1.add(rbtnSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        rbtnMes.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        rbtnMes.setText("Mes pasado");
        jPanel1.add(rbtnMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        rbtnRangoFechas.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        rbtnRangoFechas.setText("Rango de fechas");
        jPanel1.add(rbtnRangoFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));
        jPanel1.add(dcFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 140, -1));
        jPanel1.add(dcFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 141, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed

    }//GEN-LAST:event_btnGenerarReporteActionPerformed

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
            java.util.logging.Logger.getLogger(FrGenerarReportesVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrGenerarReportesVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrGenerarReportesVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrGenerarReportesVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrGenerarReportesVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnVenta;
    private javax.swing.JComboBox<String> cbFiltrar;
    private com.toedter.calendar.JDateChooser dcFechaFin;
    private com.toedter.calendar.JDateChooser dcFechaInicio;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JRadioButton rbtnMes;
    private javax.swing.JRadioButton rbtnRangoFechas;
    private javax.swing.JRadioButton rbtnSemana;
    // End of variables declaration//GEN-END:variables
}
