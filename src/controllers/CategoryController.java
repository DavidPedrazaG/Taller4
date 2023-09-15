/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Category;
import services.CategoryServices;

/**
 *
 * @author david
 */
public class CategoryController {
    public ArrayList<Object[]> searchCategory(int code){
        ArrayList<Object[]> categories = new ArrayList<>();
        try {
            ResultSet rs = CategoryServices.getINSTANCE().searchCategory(code);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre_categoria");
                Object[] ob = {id,nombre};
                categories.add(ob);
            }
        } catch (SQLException ex) {
        }
        return categories;
    }
    
    public void insertCategory(Category category){
        CategoryServices.getINSTANCE().createProduct(category);
    }
    
    public void updateCategory(Category category){
        CategoryServices.getINSTANCE().updateCategory(category);
    }
    
    public void deleteCategory(int id){
        CategoryServices.getINSTANCE().deleteCategory(id);
    }
}
