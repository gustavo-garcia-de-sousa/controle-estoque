package br.com.estoque.model.dao;

import br.com.estoque.connection.ConnectionFactory;
import br.com.estoque.model.bean.Categoria;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaDAO {
    
    public void create(Categoria c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Categorias (idCategoria, Descricao) VALUES (?,?)");
            stmt.setInt(1, c.getIdCategoria());
            stmt.setString(2, c.getDescricao());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar! - "+ex);
        }finally{
            ConnectionFactory.CloseConnection(con, stmt);
        }
    } 
    
    public List<Categoria> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Categoria> Categorias = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Categorias");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt("idCategoria"));
                c.setDescricao(rs.getString("Descricao"));

                Categorias.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar!" +ex);
        }finally{
            ConnectionFactory.CloseConnection(con, stmt, rs);
        } 
        return Categorias;
    }
    
    public void update(Categoria c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Categorias SET Descricao = ? WHERE idCategoria = ?");
            stmt.setInt(2, c.getIdCategoria());
            stmt.setString(1, c.getDescricao());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar!" +ex);
        }finally{
            ConnectionFactory.CloseConnection(con, stmt);
        }
    } 
    
    public void delete(Categoria c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM Categorias WHERE idCategoria = ?");
            stmt.setInt(1, c.getIdCategoria());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir!" +ex);
        }finally{
            ConnectionFactory.CloseConnection(con, stmt);
        }
    } 
}
