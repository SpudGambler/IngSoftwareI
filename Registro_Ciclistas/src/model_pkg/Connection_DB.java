/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jaime
 */
public class Connection_DB {
    Connection connection;

    public Connection_DB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bikes_routes_db", "root", "");
            if(connection != null){
                System.out.println("Conexión Exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
}
