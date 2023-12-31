/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.ProductController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Clara Elizabeth
 */
public class Product extends javax.swing.JFrame {

    private final ProductController controller;
    private ArrayList<Object[]> categories;
    private ArrayList<Object[]> products;
    private DefaultTableModel model;
    
    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        controller = new ProductController();
        model = (DefaultTableModel) JTblProducto.getModel();
        categories = controller.searchCategory(-1);
        products = controller.searchProduct(-1);
        updateCategories();
        updateTable();
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
        JTxtCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        JBtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTblProducto = new javax.swing.JTable();
        JBtnGuardar = new javax.swing.JButton();
        JBtnEditar = new javax.swing.JButton();
        JBtnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JTxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTxtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTxtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JCboCategoria = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        JBtnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 230, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setText("Registro de productos:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        JTxtCodigo.setBackground(new java.awt.Color(187, 148, 87));
        JTxtCodigo.setBorder(null);
        JTxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(JTxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 140, 10));

        JBtnBuscar.setBackground(new java.awt.Color(153, 88, 42));
        JBtnBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        JBtnBuscar.setText("Buscar");
        JBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        JTblProducto.setBackground(new java.awt.Color(111, 29, 27));
        JTblProducto.setForeground(new java.awt.Color(255, 255, 255));
        JTblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoria", "Precio", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTblProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTblProducto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 610, -1));

        JBtnGuardar.setBackground(new java.awt.Color(153, 88, 42));
        JBtnGuardar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        JBtnGuardar.setText("Guardar");
        JBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 510, -1, -1));

        JBtnEditar.setBackground(new java.awt.Color(153, 88, 42));
        JBtnEditar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        JBtnEditar.setText("Editar");
        JBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, 110, -1));

        JBtnEliminar.setBackground(new java.awt.Color(153, 88, 42));
        JBtnEliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        JBtnEliminar.setText("Eliminar");
        JBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, -1));

        jLabel2.setText("Nombre: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        JTxtNombre.setBackground(new java.awt.Color(187, 148, 87));
        JTxtNombre.setBorder(null);
        jPanel1.add(JTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 180, 30));

        jLabel3.setText("Descripcion: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        JTxtDescripcion.setBackground(new java.awt.Color(187, 148, 87));
        JTxtDescripcion.setBorder(null);
        jPanel1.add(JTxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 180, 40));

        jLabel4.setText("Precio: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        JTxtPrecio.setBackground(new java.awt.Color(187, 148, 87));
        JTxtPrecio.setBorder(null);
        JTxtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(JTxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 180, 30));

        jLabel5.setText("Categoria: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, -1));

        JCboCategoria.setBackground(new java.awt.Color(187, 148, 87));
        jPanel1.add(JCboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 180, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 180, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 180, 10));

        JBtnVolver.setBackground(new java.awt.Color(153, 88, 42));
        JBtnVolver.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        JBtnVolver.setText("Volver");
        JBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(JBtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnEliminarActionPerformed
        // TODO add your handling code here:
        if(JTxtCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el codigo del producto a eliminar en la barra de busqueda", "Error", JOptionPane.ERROR_MESSAGE);            
            return;
        }
        String code = JTxtCodigo.getText();
        controller.deleteProduct(Integer.parseInt(code));
        products = controller.searchProduct(-1);
        updateTable();
    }//GEN-LAST:event_JBtnEliminarActionPerformed

    private void JBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnGuardarActionPerformed
        // TODO add your handling code here:
        if(JTxtNombre.getText().isEmpty() || JTxtPrecio.getText().isEmpty() || JTxtDescripcion.getText().isEmpty() || JCboCategoria.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;            
        }
        
        String nombre = JTxtNombre.getText();
        String descripcion = JTxtDescripcion.getText();
        float precio = Float.parseFloat(JTxtPrecio.getText());
        int idCategoria = searchCategory(JCboCategoria.getSelectedItem().toString());
        models.Product product = new models.Product(idCategoria, nombre, precio, descripcion);
        controller.insertProduct(product);
        products = controller.searchProduct(-1);
        updateTable();
    }//GEN-LAST:event_JBtnGuardarActionPerformed

    private void JBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnEditarActionPerformed
        // TODO add your handling code here:
        if(JTxtNombre.getText().isEmpty() || JTxtPrecio.getText().isEmpty() || JTxtDescripcion.getText().isEmpty() || JCboCategoria.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;            
        }if(JTxtCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el codigo del producto a modificar en la barra de busqueda", "Error", JOptionPane.ERROR_MESSAGE);            
            return;
        }
        int id = Integer.parseInt(JTxtCodigo.getText());
        String nombre = JTxtNombre.getText();
        String descripcion = JTxtDescripcion.getText();
        float precio = Float.parseFloat(JTxtPrecio.getText());
        int idCategoria = searchCategory(JCboCategoria.getSelectedItem().toString());
        models.Product product = new models.Product(id,idCategoria, nombre, precio, descripcion);
        controller.updateProduct(product);
        products = controller.searchProduct(-1);
        updateTable();
    }//GEN-LAST:event_JBtnEditarActionPerformed

    private void JTblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTblProductoMouseClicked
        // TODO add your handling code here:
        int row = JTblProducto.getSelectedRow();
        String id = model.getValueAt(row, 0).toString();
        String nombre = model.getValueAt(row, 1).toString();
        JCboCategoria.setSelectedItem(model.getValueAt(row, 2).toString());
        String precio = model.getValueAt(row, 3).toString();
        String descripcion = model.getValueAt(row, 4).toString();
        
        JTxtCodigo.setText(id);
        JTxtNombre.setText(nombre);
        JTxtPrecio.setText(precio);
        JTxtDescripcion.setText(descripcion);
    }//GEN-LAST:event_JTblProductoMouseClicked

    private void JBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnBuscarActionPerformed
        // TODO add your handling code here:
        int code;
        if(JTxtCodigo.getText().isEmpty()){
            code = -1;
        }else{
            code = Integer.parseInt(JTxtCodigo.getText());
        }      
        products = controller.searchProduct(code);
        updateTable();
    }//GEN-LAST:event_JBtnBuscarActionPerformed

    private void JBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnVolverActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBtnVolverActionPerformed

    private void JTxtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtPrecioKeyTyped
        // TODO add your handling code here:
        if(evt.getSource().equals(JTxtPrecio)){
            Character c = evt.getKeyChar();
            if(!Character.isDigit(c) && !c.toString().equals("")){
                evt.consume();
            }
        }
    }//GEN-LAST:event_JTxtPrecioKeyTyped

    private void JTxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtCodigoKeyTyped
        // TODO add your handling code here:
        if(evt.getSource().equals(JTxtCodigo)){
            Character c = evt.getKeyChar();
            if(!Character.isDigit(c) && !c.toString().equals("")){
                evt.consume();
            }
        }
    }//GEN-LAST:event_JTxtCodigoKeyTyped

    private int searchCategory(String name){
        for (int i = 0; i < categories.size(); i++) {
            if(categories.get(i)[1].toString().equals(name)){
                return Integer.parseInt(categories.get(i)[0].toString());
            }
        }
        return 0;
    }
    
    private void updateTable(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < model.getRowCount(); j++) {
                model.removeRow(j);
            }
        }
        for (int i = 0; i < products.size(); i++) {
            model.addRow(products.get(i));
        }
    }
    
    private void updateCategories(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < JCboCategoria.getItemCount(); j++) {
                JCboCategoria.removeItemAt(j);
            }
        }
        for (int i = 0; i < categories.size(); i++) {
            JCboCategoria.addItem(categories.get(i)[1].toString());
        }
        JCboCategoria.setSelectedIndex(-1);
    }
    
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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnBuscar;
    private javax.swing.JButton JBtnEditar;
    private javax.swing.JButton JBtnEliminar;
    private javax.swing.JButton JBtnGuardar;
    private javax.swing.JButton JBtnVolver;
    private javax.swing.JComboBox<String> JCboCategoria;
    private javax.swing.JTable JTblProducto;
    private javax.swing.JTextField JTxtCodigo;
    private javax.swing.JTextField JTxtDescripcion;
    private javax.swing.JTextField JTxtNombre;
    private javax.swing.JTextField JTxtPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
