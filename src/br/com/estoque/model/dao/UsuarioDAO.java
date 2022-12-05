package br.com.estoque.model.dao;
import br.com.estoque.connection.ConnectionFactory;
import br.com.estoque.model.bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    public void create(Usuario u){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Usuarios (idUsuario, Tipo, Nome, Login, Senha, Email) VALUES (?,?,?,?,?,?)");
            stmt.setInt(1, u.getIdUsuario());
            stmt.setString(2, u.getTipo());
            stmt.setString(3, u.getNome());
            stmt.setString(4, u.getLogin());
            stmt.setString(5, u.getSenha());
            stmt.setString(6, u.getEmail());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar!" +ex);
        }finally{
            ConnectionFactory.CloseConnection(con, stmt);
        }
    } 
    
    public List<Usuario> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> Usuarios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Usuarios");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("idUsuario"));
                u.setTipo(rs.getString("Tipo"));
                u.setNome(rs.getString("Nome"));
                u.setLogin(rs.getString("Login"));
                u.setSenha(rs.getString("Senha"));
                u.setEmail(rs.getString("Email"));
                Usuarios.add(u);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar!" +ex);
        }finally{
            ConnectionFactory.CloseConnection(con, stmt, rs);
        } 
        return Usuarios;
    }
    
    public void update(Usuario u){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE usuarios SET Tipo = ?, Nome = ?, Login = ?, Senha = ?, Email = ? WHERE idUsuario = ?");
            stmt.setInt(6, u.getIdUsuario());
            stmt.setString(1, u.getTipo());
            stmt.setString(2, u.getNome());
            stmt.setString(3, u.getLogin());
            stmt.setString(4, u.getSenha());
            stmt.setString(5, u.getEmail());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar!" +ex);
        }finally{
            ConnectionFactory.CloseConnection(con, stmt);
        }
    } 
     
    public void delete(Usuario u){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM usuarios WHERE idUsuario = ?");
            stmt.setInt(1, u.getIdUsuario());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir!" +ex);
        }finally{
            ConnectionFactory.CloseConnection(con, stmt);
        }
    } 
    
    public boolean checklogin(String login, String Senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Usuarios where Login = ? AND Senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, Senha);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                check = true;
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível validar o acesso - Contate o administrador do sistema -> "+ex);
        }finally{
            ConnectionFactory.CloseConnection(con, stmt, rs);
        }
        return check;
    }    
}