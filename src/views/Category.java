/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author Clara Elizabeth
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
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
        jLabel1 = new javax.swing.JLabel();
        JBtnBuscar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTblCategoria = new javax.swing.JTable();
        JBtnGuardar = new javax.swing.JButton();
        JBtnEditar = new javax.swing.JButton();
        JBtnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JTxtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 230, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setText("Registrar categorias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        JBtnBuscar.setBackground(new java.awt.Color(153, 88, 42));
        JBtnBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        JBtnBuscar.setText("Buscar");
        jPanel1.add(JBtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, -1, -1));

        jTextField1.setBackground(new java.awt.Color(187, 148, 87));
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 53, 155, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 95, 155, -1));

        JTblCategoria.setBackground(new java.awt.Color(111, 29, 27));
        JTblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTblCategoria);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 117, 630, -1));

        JBtnGuardar.setBackground(new java.awt.Color(153, 88, 42));
        JBtnGuardar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        JBtnGuardar.setText("Guardar");
        jPanel1.add(JBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 524, -1, -1));

        JBtnEditar.setBackground(new java.awt.Color(153, 88, 42));
        JBtnEditar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        JBtnEditar.setText("Editar");
        jPanel1.add(JBtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 524, 113, -1));

        JBtnEliminar.setBackground(new java.awt.Color(153, 88, 42));
        JBtnEliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        JBtnEliminar.setText("Eliminar");
        jPanel1.add(JBtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 524, -1, -1));

        jLabel2.setText("Nombre: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        JTxtNombre.setBackground(new java.awt.Color(187, 148, 87));
        JTxtNombre.setBorder(null);
        jPanel1.add(JTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 170, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 170, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnBuscar;
    private javax.swing.JButton JBtnEditar;
    private javax.swing.JButton JBtnEliminar;
    private javax.swing.JButton JBtnGuardar;
    private javax.swing.JTable JTblCategoria;
    private javax.swing.JTextField JTxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
