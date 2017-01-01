package com.bestsnail.databases;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by stone on 16-12-10.
 */
public class DatabaseConnection {
    final static String driver = "com.mysql.jdbc.Driver";
    final static String url = "jdbc:mysql://127.0.0.1:3306/user?useUnicode=true&characterEncoding=utf8&useSSL=false";
    final static String name = "root";
    final static String pwd = "admin";


    public static Connection getConnection() {
        try {

            Class.forName(driver);
            return DriverManager.getConnection(url, name, pwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
