/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import conecction.Supabase;
import java.sql.Connection;
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
    private static ProductServices INSTANCE;
    private Statement stmt;
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection connection;

    private ProductServices() {        
        connection = Supabase.getINSTANCE().getConnection();
        stmt = getStatement();
        rs = null;
    }

    public static ProductServices getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new ProductServices();
        }
        return INSTANCE;
    }    
    
    private Statement getStatement(){
        try {
            return connection.createStatement();
        } catch (SQLException ex) {
            return null;
        }
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
            ps = connection.prepareStatement(sql);

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
            ps = connection.prepareStatement(sql);

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
            ps = connection.prepareStatement(sql);

            ps.setInt(1, code);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se eliminó el producto", "Extio", JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);            
        }
    }
}
