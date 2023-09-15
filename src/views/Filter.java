/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.FilterController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.border.AbstractBorder;
import javax.swing.table.DefaultTableModel;
import views.resources.classes.MyScrollBarUI;
import views.resources.classes.TextBubbleBorder;

/**
 *
 * @author Clara Elizabeth
 */
public class Filter extends javax.swing.JFrame {

    private FilterController controller;
    private AbstractBorder bdrScroll = new TextBubbleBorder(new Color(111,29,27),2,2,0);    
    private ArrayList<Object[]> categories;
    private ArrayList<Object[]> products;
    private DefaultTableModel model;
    private ArrayList<String> categoriesActivated;
    
    /**
     * Creates new form Filter
     */
    public Filter() {
        initComponents();
        controller = new FilterController();
        jScrollPane1.getVerticalScrollBar().setUI(new MyScrollBarUI());
        jScrollPane1.setBorder(bdrScroll);
        model = (DefaultTableModel) JTableFiltro.getModel();
        categories = controller.searchCategory(-1);
        products = controller.searchProduct(-1);
        categoriesActivated = new ArrayList<>();
        addCategories();
        updateTable(true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableFiltro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 230, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Tabla de categorias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, 400));

        JTableFiltro.setBackground(new java.awt.Color(111, 29, 27));
        JTableFiltro.setForeground(new java.awt.Color(255, 255, 255));
        JTableFiltro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre del producto", "Descripcion", "Precio", "Categoria"
            }
        ));
        jScrollPane2.setViewportView(JTableFiltro);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 500, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        JCheckBox category = (JCheckBox) evt.getSource();
        if(category.isSelected()){
            categoriesActivated.add(category.getText());            
        }else{
            categoriesActivated.remove(category.getText());
            if(categoriesActivated.isEmpty()){
                updateTable(true);
                return;
            }
        }
        updateTable(false);
    }
    
    private void addCategories(){                        
        for (int i = 0; i < categories.size(); i++) {
            JCheckBox category = new JCheckBox(categories.get(i)[1].toString());
            category.setBounds(6, i*25 + 10, 190, 25);
            category.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    categoryActionPerformed(evt);
                }
            });
            jPanel2.add(category);
        }
    }
    
    private void updateTable(boolean searchType){
        try {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < model.getRowCount(); j++) {
                    model.removeRow(j);
                }
            }
        } catch (Exception e) {
        }
        if(searchType){
            for (int i = 0; i < products.size(); i++) {
                model.addRow(products.get(i));
            }   
        }else{
            for (int j = 0; j < products.size(); j++) {
                for (int i = 0; i < categoriesActivated.size(); i++) {
                    if(products.get(j)[3].toString().equals(categoriesActivated.get(i))){
                        model.addRow(products.get(j));
                    }
                
                }     
            }
                
        }
        
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
            java.util.logging.Logger.getLogger(Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
