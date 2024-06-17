
package br.com.sistema.dao;


import br.com.sistema.jdbc.conexionbanco;
import br.com.sistema.model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

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
//    public Clientes BuscarCliente(String nombre){
//        String sql = "select * from_clientes where nome =?";
//    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
//        stmt.setString(1, obj.getNombre());
//        ResultSet = stmt.executeQuery();
//        Clientes obj = new Clientes();
//        if(rs.next()){
//            obj.setId(rs.Int("id"));
//            obj.setNombre(rs.getString("nombre"));
//            obj.setRg(rs.getString("rg"));
//            obj.setCpf(rs.getString("cpf"));
//            obj.setEmail(rs.getString("email"));
//            obj.setTelefono(rs.getString("Telefono"));
//            obj.setCep(rs.getString("cep"));
//            obj.setDireccion(rs.getString("direccion"));
//            obj.setNumero(rs.getInt("numero"));
//            obj.setBarrio(rs.getString("barrio"));
//            obj.setCiudad(rs.getString("ciudad"));
//            obj.setUf(rs.getString("uf"));
//            obj.setComplemento(rs.getString("complemento"));
//            obj.setSexo(rs.getString("sexo"));
//           
//        }
//        
//    } catch (Exception e){
//        JOptionPane.showMessageDialog(null,"Error al buscar el cliente" e);
//    }
//    return null;
//        
//  }
    public Clientes buscarCliente(String nombre) {
        String sql = "SELECT * FROM cliente WHERE nombre = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                Clientes clienteEncontrado = new Clientes();
                clienteEncontrado.setId(rs.getInt("id"));
                clienteEncontrado.setNombre(rs.getString("nombre"));
                clienteEncontrado.setRg(rs.getString("rg"));
                clienteEncontrado.setCpf(rs.getString("cpf"));
                clienteEncontrado.setEmail(rs.getString("email"));
                clienteEncontrado.setTelefono(rs.getString("telefono"));
                clienteEncontrado.setCep(rs.getString("cep"));
                clienteEncontrado.setDireccion(rs.getString("direccion"));
                clienteEncontrado.setNumero(rs.getString("numero"));
                clienteEncontrado.setBarrio(rs.getString("barrio"));
                clienteEncontrado.setCiudad(rs.getString("ciudad"));
                clienteEncontrado.setUf(rs.getString("uf"));
                clienteEncontrado.setComplemento(rs.getString("complemento"));
                clienteEncontrado.setSexo(rs.getString("sexo"));
                
                JOptionPane.showMessageDialog(null, "Cliente encontrado!!");
                return clienteEncontrado;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                return null;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}

