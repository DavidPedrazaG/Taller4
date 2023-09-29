/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class Supabase{

    private final String url = "jdbc:postgresql://db.oywkvwarywjjjzbtjnmc.supabase.co:5432/postgres?user=postgres&password=D@vidP!pe3110";
    private static Supabase INSTANCE;
    private Connection connection;

    private Supabase() {
        try {
            connection = DriverManager.getConnection(url);
            System.out.println("Holli");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static Supabase getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new Supabase();
        }
        return INSTANCE;
    }       

    public Connection getConnection() {
        return connection;
    }
    
}