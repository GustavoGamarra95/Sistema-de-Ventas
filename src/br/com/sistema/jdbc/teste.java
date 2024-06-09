/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.sistema.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            new test().conectardb();
            JOptionPane.showMessageDialog(null, "Conectado al banco de datos");
        } catch (HeadlessException erro) {
            JOptionPane.showMessageDialog(null,"Error al conectar al banco de dados" + erro.getMessage());
        }
    }
    
}

