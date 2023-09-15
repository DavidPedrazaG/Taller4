/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import conecction.Supabase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Product;

/**
 *
 * @author david
 */
public class ProductServices {
    private static final ProductServices INSTANCE = new ProductServices();
    private Statement stmt = getStatement();
    private ResultSet rs = null;
    private PreparedStatement ps;

    private ProductServices() {
    }

    public static ProductServices getINSTANCE() {
        return INSTANCE;
    }    
    
    private Statement getStatement(){
        try {
            return new Supabase().connect().createStatement();
        } catch (SQLException ex) {
            return null;
        }
    }
    
    private PreparedStatement getPreparedStatement(String sql){
        try {
            return new Supabase().connect().prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ProductServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ResultSet searchProduct(int code){
        String where = "";
        if(code>=0){
            where = "WHERE id = " + code +"";
        }
        try {
            rs = stmt.executeQuery("SELECT * FROM productos "+where);
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
        return null;
    }
    
    public void createProduct(Product product){
        try {
            String sql = "INSERT INTO productos (id_categoria, nombre_producto, precio, descripcion) VALUES(?,?,?,?)";
            ps = getPreparedStatement(sql);

            ps.setInt(1, product.getIdCategoria());
            ps.setString(2, product.getNombre());
            ps.setFloat(3, product.getPrecio());
            ps.setString(4, product.getDescripcion());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se añadió el producto", "Extio", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateProduct(Product product){
        try {
            String sql = "update productos set id_categoria=?, nombre_producto=?, precio=?, descripcion=? where id=?";
            ps = getPreparedStatement(sql);

            ps.setInt(1, product.getIdCategoria());
            ps.setString(2, product.getNombre());
            ps.setFloat(3, product.getPrecio());
            ps.setString(4, product.getDescripcion());
            ps.setInt(5, product.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se modificó el producto", "Extio", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteProduct(int code){
        try {
            String sql = "delete from productos where id=?";
            ps = getPreparedStatement(sql);

            ps.setInt(1, code);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se eliminó el producto", "Extio", JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);            
        }
    }
}
