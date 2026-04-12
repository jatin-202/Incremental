package com.edutech.progressive.config;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnectionManager {
    public static Properties properties= new Properties();
    static {
        try {
            InputStream is = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties");
            properties.load(is);
        } catch (Exception e) {
          throw new RuntimeException("Error loading properties", e);
        }
    }
        public static Connection getConnection()
        {
            try {
                String url = properties.getProperty("spring.datasource.url");
                String user = properties.getProperty("spring.datasource.username");
                 String password = properties.getProperty("spring.datasource.password");
                 return DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
               throw new RuntimeException("Database connection failed", e);
            }
        }
    }