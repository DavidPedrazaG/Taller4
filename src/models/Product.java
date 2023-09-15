/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author david
 */
public class Product {
    
    private int id;
    private int idCategoria;
    private String nombre;
    private float precio;
    private String descripcion;

    public Product() {
    }

    public Product(int idCategoria, String nombre, float precio, String descripcion) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Product(int id, int idCategoria, String nombre, float precio, String descripcion) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
