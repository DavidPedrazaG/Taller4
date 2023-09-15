/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import services.CategoryServices;
import services.ProductServices;

/**
 *
 * @author david
 */
public class FilterController {
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
    
    public ArrayList<Object[]> searchProduct(int code){
        ArrayList<Object[]> products = new ArrayList<>();
        try {
            ResultSet rs = ProductServices.getINSTANCE().searchProduct(code);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre_producto");
                int idCategoria = rs.getInt("id_categoria");
                String nombreCategoria = searchCategory(idCategoria).get(0)[1].toString();
                String descripcion = rs.getString("descripcion");
                float precio = rs.getFloat("precio");
                Object[] ob = {nombre,descripcion,precio,nombreCategoria};
                products.add(ob);
            }
        } catch (SQLException ex) {
        }
        return products;
    }
}
