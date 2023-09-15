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

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Supabase app = new Supabase();
        app.connect();
    }
}