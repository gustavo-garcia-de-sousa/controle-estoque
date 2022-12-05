
package br.com.estoque.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/dbestoque";
    private static final String USER = "root";
    private static final String PASS = "";

    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão"+ex);
        }
    }
    
    public static void CloseConnection(Connection con){
        try{
            if(con != null){
                con.close();
            }
        }catch(SQLException ex){
            throw new RuntimeException("Conexão aberta", ex);
        }
    }
    
    public static void CloseConnection(Connection con, PreparedStatement stmt){
        
        CloseConnection(con);
        
        try{
            if(stmt != null){
                stmt.close();
            }
        }catch(SQLException ex){
            throw new RuntimeException("Conexão aberta", ex);
        }
    }
    
    public static void CloseConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        CloseConnection(con,stmt);
        
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException ex){
            throw new RuntimeException("Conexão aberta", ex);
        }
    }
}
