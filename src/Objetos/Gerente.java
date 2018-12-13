
package Objetos;

import BDconexao.conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            PreparedStatement cad = conex.getConnection().prepareStatement("insert into Gerente (id_gerente,nome,cpf, telefone,salario) values (?,?,?,?,?)");
                             
            cad.setInt(1, gerente.getID_gerente());
            cad.setString(2, gerente.getNome());
            cad.setString(3, gerente.getCpf());
            cad.setString(4, gerente.getTelefone());
            cad.setDouble(5, gerente.getSalario());
   
            cad.execute();
            JOptionPane.showMessageDialog(null, "salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar produto:\n" + ex);

        }
        
        
        
        
        
    }
        
        
        
    
    
    public void Alterar(){
        
    }
    
    
    
    // Metodo não utilizado, só para teste
    
    public void Status(){
        System.out.println("Codigo identificador"+this.getID_gerente());
        System.out.println("Nome do gerente é"+this.getNome());
        System.out.println("CPF"+this.getCpf());
        System.out.println("fone para contato"+this.getTelefone());
        System.out.println("Salario"+this.getSalario());
    }
}
