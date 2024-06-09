/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sistema.jdbc;

/**
 *
 * @author gustavo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class test {
    final private String url = "jdbc:mysql://200.195.171.122/grupo11_Gustavo";
    final private String usuario = "grupo11";
    final private String senha = "9agmsegriCatwXLH";

    public Connection conectardb(){
     try{
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectarse al banco de datos"+e);
        }
        return null;
       
    }
}
      
        

