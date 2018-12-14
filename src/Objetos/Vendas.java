
package Objetos;

import BDconexao.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Vendas {
    
    private conexao con = new conexao();
    
    private int codFuncionario;
    private String data;
    private double valor_total;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    
    
    
    public  void valor_Total(Vendas pro){
        try {
            PreparedStatement valor = con.getConnection().prepareStatement("insert into vendas (data,valor_total, idVendedor) values (?,?, ?)");
            valor.setString(1, pro.getData());
            valor.setDouble(2, pro.getValor_total());
            valor.setInt(3, 123);
            valor.execute();
            
            JOptionPane.showMessageDialog(null, "Venda salva");
            
        } catch (SQLException ex) {
            Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        
        
    }

    public conexao getCon() {
        return con;
    }

    public void setCon(conexao con) {
        this.con = con;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    
    
    
    
    
    
    
    
    
    
    
}
