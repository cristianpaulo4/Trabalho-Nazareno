
package Objetos;

import BDconexao.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Gerente extends Endereco{
     conexao conex = new conexao();
    
    private int ID_gerente;
    private String nome;
    private String cpf;
    private String telefone;
    private double salario;

    public int getID_gerente() {
        return ID_gerente;
    }

    public void setID_gerente(int ID_gerente) {
        this.ID_gerente = ID_gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    // metodo cadastrar Gerente
    
    public void Cadastrar(Gerente gerente){
          try {
            PreparedStatement cad = conex.getConnection().prepareStatement("insert into gerente values (?,?,?,?,?,?,?,?,?,?);");
                             
            cad.setInt(1, gerente.getID_gerente());
            cad.setString(2, gerente.getNome());
            cad.setString(3, gerente.getCpf());
            cad.setString(4, gerente.getTelefone());
            cad.setDouble(5, gerente.getSalario());
            cad.setString(6, gerente.getCidade());
            cad.setString(7, gerente.getBairro());
            cad.setString(8, gerente.getRua());
            cad.setInt(9, gerente.getNumero());
            cad.setString(10, gerente.getComplemento());
   
            cad.execute();
            JOptionPane.showMessageDialog(null, "salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar produto:\n" + ex);

        }
        
        
        
        
        
    }
        
        
        
    // alterar
    
    public void Alterar(Gerente gerente, int codigo){
        
        try {
            PreparedStatement alterar = conex.getConnection().prepareStatement("UPDATE "
                    + "gerente SET nome=?, cpf = ?, telefone = ?, salario = ?, cidade = ?, bairro = ?, rua = ?, numero = ?, complemento = ?"
                    + " WHERE idgerente=" + codigo);
            
            alterar.setString(1, gerente.getNome());
            alterar.setString(2, gerente.getCpf());
            alterar.setString(3, gerente.getTelefone());
            alterar.setDouble(4, gerente.getSalario());
            alterar.setString(5, gerente.getCidade());
            alterar.setString(6, gerente.getBairro());
            alterar.setString(7, gerente.getRua());
            alterar.setInt(8, gerente.getNumero());
            alterar.setString(9, gerente.getComplemento());
            
   
          
      
            alterar.execute();
            
            JOptionPane.showMessageDialog(null, "Gerente Alterado com sucesso");
            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar"+ ex);
        }
           
        
        
        
        
    }
        
    
    // Metodo não utilizado, só para teste
     
  
}
