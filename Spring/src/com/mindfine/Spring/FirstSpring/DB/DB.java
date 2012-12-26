package com.mindfine.Spring.FirstSpring.DB;

import java.sql.Connection;

/**
 * Created with IntelliJ IDEA.
 * user: rankun203
 * Date: 12-12-26
 * Time: 上午10:43
 */
public class DB {
    private String url;
    private String user;
    private String pass;
    private Connection connection;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Connection getConnection() {
        System.out.println("Connect to Database Server.database: " + url);
        System.out.println("user: " + user);
        System.out.println("password: " + pass);
        return this.connection;
    }

    public boolean close() {
        return false;
    }
}
