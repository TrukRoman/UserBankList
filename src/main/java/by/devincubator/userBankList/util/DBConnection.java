package by.devincubator.userBankList.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private final String driverClassName;
    private final String url;
    private final String username;
    private final String password;

    public DBConnection() {
        Properties properties = new Properties();
        InputStream is = this.getClass().getResourceAsStream("/app.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this. driverClassName = properties.getProperty("driverClassName");
        this.url = (properties.getProperty("url"));
        this.username = properties.getProperty("username");
        this.password = properties.getProperty("password");
    }

    public Connection getConnection() {
        System.out.println("Connecting...");
        Connection connection = null;
        try {
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection is successful!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection is failed!");
            e.printStackTrace();
        }
        return connection;
    }
}


