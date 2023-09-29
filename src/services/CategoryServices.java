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
import models.Category;

/**
 *
 * @author david
 */
public class CategoryServices {
    
    private static CategoryServices INSTANCE;
    private Statement stmt;
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection connection;
    
    private CategoryServices() {        
        connection = Supabase.getINSTANCE().getConnection();
        stmt = getStatement();
        rs = null;
    }

    public static CategoryServices getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new CategoryServices();
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
            ps = connection.prepareStatement(sql);

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
            ps = connection.prepareStatement(sql);
            
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
            ps = connection.prepareStatement(sql);

            ps.setInt(1, code);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se eliminó la categoria", "Extio", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
