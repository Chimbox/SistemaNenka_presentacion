package sistemanenka_presentacion;

import com.sun.glass.events.KeyEvent;
import control.INegocios;
import dominio.Categoria;
import dominio.Cliente;
import dominio.DetalleVenta;
import dominio.Empleado;
import dominio.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import models.JTableButtonRenderer;
import models.PreviaProductoRenderer;

/**
 *
 * @author dianacastro
 */
public class FmAdministrarProductos extends FmBase {

    DefaultTableModel modeloTabla;
    INegocios negocios;
    Empleado empleado;

    /**
     * Creates new form FmRealizarVenta
     */
    public FmAdministrarProductos(Empleado empleado) {
        initComponents();
        inicializar(empleado);
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
        lblCategoria = new javax.swing.JLabel();
        cbCategorias = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetalleProductos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnAñadirProducto = new javax.swing.JButton();
        pnlPrevia = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPrevia = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        btnAdministrador = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1115, 650));
        setMinimumSize(new java.awt.Dimension(1115, 650));
        setSize(new java.awt.Dimension(1115, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCategoria.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        lblCategoria.setText("Categoria:");
        jPanel1.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 20));

        cbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCategorias.setBorder(null);
        jPanel1.add(cbCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 210, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 30, 30));

        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 118, 176)));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 250, 30));

        tbDetalleProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 118, 176)));
        tbDetalleProductos.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tbDetalleProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "PRECIO", "STOCK", "EDITAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDetalleProductos.setDoubleBuffered(true);
        tbDetalleProductos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tbDetalleProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDetalleProductosMouseClicked(evt);
            }
        });
        tbDetalleProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbDetalleProductosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbDetalleProductosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbDetalleProductosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tbDetalleProductos);
        if (tbDetalleProductos.getColumnModel().getColumnCount() > 0) {
            tbDetalleProductos.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 750, 290));

        btnCancelar.setBackground(new java.awt.Color(243, 69, 51));
        btnCancelar.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 130, 40));

        btnAñadirProducto.setBackground(new java.awt.Color(118, 194, 124));
        btnAñadirProducto.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAñadirProducto.setText("AÑADIR PRODUCTO");
        btnAñadirProducto.setBorder(null);
        btnAñadirProducto.setBorderPainted(false);
        btnAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 170, 40));

        lstPrevia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPrevia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPreviaMouseClicked(evt);
            }
        });
        lstPrevia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstPreviaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(lstPrevia);

        javax.swing.GroupLayout pnlPreviaLayout = new javax.swing.GroupLayout(pnlPrevia);
        pnlPrevia.setLayout(pnlPreviaLayout);
        pnlPreviaLayout.setHorizontalGroup(
            pnlPreviaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreviaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        pnlPreviaLayout.setVerticalGroup(
            pnlPreviaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPreviaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlPrevia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 250, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 520));

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
        jLabel2.setText("Productos");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 250, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 750, 110));

        jPanel4.setBackground(new java.awt.Color(47, 111, 159));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("SISTEMA NENKA");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 60));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirProductoActionPerformed
      
    }//GEN-LAST:event_btnAñadirProductoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tbDetalleProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDetalleProductosKeyReleased

       

    }//GEN-LAST:event_tbDetalleProductosKeyReleased

    private void tbDetalleProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDetalleProductosMouseClicked

    }//GEN-LAST:event_tbDetalleProductosMouseClicked

    private void tbDetalleProductosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDetalleProductosKeyTyped
        
    }//GEN-LAST:event_tbDetalleProductosKeyTyped

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        buscarProductos();
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void buscarProductos() {
        List<Producto> productos = negocios.buscarProducto(txtBuscar.getText());
        List <Producto> productos1 = negocios.buscarProductoCategoria(txtBuscar.getText());
        if (productos.isEmpty() && productos1.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No se encontró ningún producto en esta búsqueda.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!productos1.isEmpty()){
            crearListaPreviaProductos(productos1);
        }else{
            crearListaPreviaProductos(productos);
        }
    }

    private void lstPreviaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPreviaMouseClicked
        
    }//GEN-LAST:event_lstPreviaMouseClicked

    private void lstPreviaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstPreviaKeyReleased
        
    }//GEN-LAST:event_lstPreviaKeyReleased

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tbDetalleProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDetalleProductosKeyPressed
        
    }//GEN-LAST:event_tbDetalleProductosKeyPressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void agregaProductoBuscado(Producto producto) {
        SpinnerNumberModel sModel = new SpinnerNumberModel(1.0, 0.0, 99.0, 1.0);
        JSpinner spinner = new JSpinner(sModel);
        int opcion = JOptionPane.showOptionDialog(null, spinner, "Indique la cantidad:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (opcion == JOptionPane.OK_OPTION) {
            double cantidad = (double) spinner.getValue();
            if (cantidad > 0) {
                if (negocios.agregarProductoCarrito(producto, cantidad)) {
                    txtBuscar.setText("");
                    pnlPrevia.setVisible(false);
                    agregaProductos();
                    txtBuscar.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No hay la cantidad suficiente.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void crearListaPreviaProductos(List<Producto> productos) {
        if (!productos.isEmpty()) {
            DefaultListModel<Producto> modelo = new DefaultListModel<>();

            for (Producto producto : productos) {
                modelo.addElement(producto);
            }

            lstPrevia.setModel(modelo);

            lstPrevia.setCellRenderer(new PreviaProductoRenderer());
            //  JList<Producto> lstPreviaProductos=new JList<>(modelo);
            // lstPreviaProductos.setSize(200,200);
            // spnlPrevia.add(lstPreviaProductos);
            pnlPrevia.setVisible(true);
        } else {
            pnlPrevia.setVisible(false);
        }
    }

    

    private void llenarCBoxClientes() {
        /*
        List<Categoria> categorias = negocios.obtenerCategorias();
        Categoria[] arrayCategorias = categorias.toArray(new Categoria[0]);

        cbCategorias.setModel(new DefaultComboBoxModel(arrayCategorias));
        */
    }

    private void cargarTabla() {
        agregaProductos();
    }

    
    private void agregaProductos() {

        List<Producto> productos = negocios.obtenerProductos();

        negocios.nuevaVenta();

        for (Producto producto : productos) {
            JButton btnEditar = new JButton();
            btnEditar.setText("EDITAR");
            Object[] fila = new Object[5];
            fila[0] = producto.getId();
            fila[1] = producto.getNombre();
            fila[2] = producto.getPrecio();
            fila[3] = producto.getStock();
            fila[4] = btnEditar;
            modeloTabla.addRow(fila);
        }
    }

    private void eliminarProducto(int idProducto, double cantidad) {
        int opcion = JOptionPane.showConfirmDialog(rootPane,
                "¿Está seguro que desea eliminar este producto de la base de datos?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);

        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnAñadirProducto;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVenta;
    private javax.swing.JComboBox<String> cbCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JList<Producto> lstPrevia;
    private javax.swing.JPanel pnlPrevia;
    private javax.swing.JTable tbDetalleProductos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void inicializar(Empleado empleado) {
        this.setTitle("Dulcería La Abue | Realizar Venta");
        this.setLocationRelativeTo(null);
        this.empleado = empleado;
        tbDetalleProductos.getColumn("ELIMINAR").setCellRenderer(new JTableButtonRenderer());
        modeloTabla = (DefaultTableModel) tbDetalleProductos.getModel();
        negocios = getFachadaNegocios();
        cargarTabla();
        llenarCBoxClientes();
        pnlPrevia.setVisible(false);
    }
}
