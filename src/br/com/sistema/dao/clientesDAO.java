package br.com.sistema.dao;

import br.com.sistema.jdbc.test;
import br.com.sistema.model.clientes;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 * DAO class for managing `clientes` entities.
 */
public class clientesDAO {
    
    private Connection conn;
    
    public clientesDAO(){
        this.conn = new test().conectar();
    }
    
    public void guardar(clientes obj){
        PreparedStatement stmt = null;
        
        try {
            String sql = "insert into tb_cliente (nombre, rg, cpf, telefono, celular, cep, direccion, numero, complemento, barrio, ciudad, estado, Sexo)"
                       + " values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getNombre());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefono());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getDireccion());
            stmt.setString(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBarrio());
            stmt.setString(12, obj.getCiudad());
            stmt.setString(13, obj.getEstado());
            stmt.setString(14, obj.getSexo());
           
            stmt.executeUpdate(); // Use executeUpdate for insert, update, and delete operations.
            JOptionPane.showMessageDialog(null, "Cliente guardado correctamente");
            conn.close();
            
        } catch (HeadlessException | SQLException erro) {
            JOptionPane.showMessageDialog(null, "Error al guardar el cliente: " + erro.getMessage());
        } 
    }
}
