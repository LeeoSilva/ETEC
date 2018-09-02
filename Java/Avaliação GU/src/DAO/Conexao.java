/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Arow
 */
public class Conexao {

    public static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        String host = "localhost";
        String database = "vendas";
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://"+host+":3306/"+database;
        Connection conexao;

    //Construct
    public Conexao(){
                try {
                conexao= DriverManager.getConnection(url, username, password);
                System.out.println("DATABASE CONNECTED");
            } catch (Exception e) {
                System.err.println("ERROR :"+e.getMessage());
            }
    }

    public Connection getConexao(){
        return conexao;
    }

    public static void main(String[] args) {

        new Conexao();

    }
}
