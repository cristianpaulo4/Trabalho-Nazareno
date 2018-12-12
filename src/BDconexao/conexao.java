
package BDconexao;

import java.sql.*;


public class conexao {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://trabalho-ifpi.mysql.uhserver.com/trabalho_ifpi";
    private static final String USER = "trabalho-ifpi";
    private static final String PASS = "ifpi@010203";    
    public Connection con;
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);          
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro na conexao", ex);
           
        }   
    }
}
