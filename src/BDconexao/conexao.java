package BDconexao;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexao {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://trabalho-ifpi.mysql.uhserver.com/trabalho_ifpi";
    private static final String USER = "farmacia_ifpi";
    private static final String PASS = "ifpi@010203";

    /* private final String URL = "jdbc:mysql://localhost:3305/trabalho_ifpi";
    private final String USER = "root";
    private final String PASS = "";
     */
    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            // JOptionPane.showMessageDialog(null, "conectado");
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexao", ex);

        }
    }
}
