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
import models.Category;

/**
 *
 * @author david
 */
public class CategoryServices {
    
    private static final CategoryServices INSTANCE = new CategoryServices();
    public static final String WHERECODE = "WHERE id = ";
    private Statement stmt = getStatement();
    private ResultSet rs = null;
    private PreparedStatement ps;
    
    private CategoryServices() {
    }

    public static CategoryServices getINSTANCE() {
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
    
    public ResultSet searchCategory(int code){
        String where = "";
        if(code >= 0){
            where = "WHERE id = " + code +"";
        }
        try {
            rs = stmt.executeQuery("SELECT * FROM categorias "+where);
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
        return null;
    }
    
    public void createProduct(Category category){
        try {
            String sql = "INSERT INTO categorias (nombre_categoria) VALUES(?)";
            ps = getPreparedStatement(sql);

            ps.setString(1, category.getNombre());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se añadió la categoria", "Extio", JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateCategory(Category category){
        try {
            String sql = "update categorias set nombre_categoria = ? where id = ?";
            ps = getPreparedStatement(sql);
            
            ps.setString(1, category.getNombre());
            ps.setInt(2, category.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se modificó la categoria", "Extio", JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteCategory(int code){
        try {
            String sql = "delete from categorias where id=?";
            ps = getPreparedStatement(sql);

            ps.setInt(1, code);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se eliminó la categoria", "Extio", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
