
package Objetos;

import BDconexao.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Vendas {
    
    conexao con = new conexao();
    
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
            PreparedStatement valor = con.getConnection().prepareStatement("insert into vendas (data,valor_total) values (?,?)");
            valor.setString(1, pro.getData());
            valor.setDouble(2, pro.getValor_total());
            
            valor.execute();
            
            JOptionPane.showMessageDialog(null, "Venda salva");
            
        } catch (SQLException ex) {
            Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
