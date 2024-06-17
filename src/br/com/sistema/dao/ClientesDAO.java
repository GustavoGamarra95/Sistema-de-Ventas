//package br.com.sistema.dao;
//
//
//import br.com.sistema.jdbc.conexionbanco;
//import br.com.sistema.view.Clientes;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//
//
///**
// * DAO class for managing `clientes` entities.
// */
//public class ClientesDAO {
//    private Connection conn;
//    
//    public ClientesDAO(){
//        this.conn = new conexionbanco().conectardb();
//    }
//    
//    public void guardar(Clientes obj) throws SQLException {
//      
//        try{
//            String sql = "INSERT INTO tb_cliente (nombre, rg, cpf, email, telefono, celular, cep, direccion, numero, barrio, ciudad, estado) "
//                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setString(1, obj.getNombre());
//            stmt.setString(2, obj.getRg());
//            stmt.setString(3, obj.getCpf());
//            stmt.setString(4, obj.getEmail());
//            stmt.setString(5, obj.getTelefono());
//            stmt.setString(6, obj.getTelefono());
//            stmt.setString(7, obj.getCep());
//            stmt.setString(8, obj.getDireccion());
//            stmt.setString(9, obj.getNumero());
//            stmt.setString(10, obj.getBarrio());
//            stmt.setString(11, obj.getCiudad());
//            stmt.setString(12, obj.getEstado());
//            
//            stmt.executeUpdate();
//            stmt.close();
//            JOptionPane.showMessageDialog(null, "Cliente guardado");
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al guardar el cliente");
//        }
//    }
//}
package br.com.sistema.dao;


import br.com.sistema.jdbc.conexionbanco;
import br.com.sistema.model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * DAO class for managing `clientes` entities.
 */
public class ClientesDAO {
    private Connection conn;
    
    public ClientesDAO() {
        this.conn = new conexionbanco().conectardb();
        
        // Verificar que la conexión no sea null
        if (this.conn == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Error al conectar con la base de datos");
        }
    }
    
    public void guardar(Clientes obj) throws SQLException {
        String sql = "INSERT INTO cliente (nombre, rg, cpf, email, telefono, cep, direccion, numero, barrio, ciudad, uf, complemento,sexo) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, obj.getNombre());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefono());
            stmt.setString(6, obj.getCep());
            stmt.setString(7, obj.getDireccion());
            stmt.setString(8, obj.getNumero());
            stmt.setString(9, obj.getBarrio());
            stmt.setString(10, obj.getCiudad());
            stmt.setString(11, obj.getUf());
            stmt.setString(12, obj.getComplemento());
            stmt.setString(13, obj.getSexo());
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente guardado con éxito.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
    }
}
