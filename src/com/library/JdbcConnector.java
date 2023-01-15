package com.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


class JdbcConnector {
    public static void connect() {
        Connection conn = null;
        try {

            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/library?" +
                            "user=root&password=admin");
            System.out.println("connected");
            // Do something with the Connection

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public static void main(String[] args) {
        JdbcConnector jdbc = new JdbcConnector();
        jdbc.connect();
    }

}