package com.firstcoding.todo.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    private Connection conn;
    private ConnectionProvider instance = new ConnectionProvider();
    private ConnectionProvider(){}

    public ConnectionProvider getInstance(){
        return instance;
    }

        public Connection getConnections() throws Exception{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "scott", "tiger");

            return conn;

        }

    }
