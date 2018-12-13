/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
//import BDconexao.*;
import BDconexao.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Vendedor extends Endereco {
    
    conexao conex = new conexao();   

    private int idvendedor;
    private String nome;
    private String cpf; 
    private String telefone;
    private double salario;
   

    public int getIdVendedor() {
        return idvendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idvendedor = idVendedor;
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
    
       public void Adicionar(Vendedor vendedor) throws SQLException{
        //java.sql.Connection con = new Connection().getConnection();
       
        try {
            PreparedStatement stmt = conex.getConnection().prepareStatement( "insert into vendedor(nome, cpf, telefone, salario, cidade, bairro, rua, numero, complemento) values( ?,?,?,?,?,?,?,?,?)");
             
           // stmt.setInt(1, vendedor.getIdVendedor());
            stmt.setString(1, vendedor.getNome());
            stmt.setString(2, vendedor.getCpf());
            stmt.setString(3, vendedor.getTelefone());
            stmt.setDouble(4, vendedor.getSalario());
            stmt.setString(5, vendedor.getCidade());
            stmt.setString(6, vendedor.getBairro());
            stmt.setString(7, vendedor.getRua());
            stmt.setInt(8, vendedor.getNumero());
            stmt.setString(9, vendedor.getComplemento());
            stmt.execute();
           // stmt.close();
            System.out.println("Gravado");
          
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao salvar vendedor!" + e);
        } 
 }
    
    public List <Vendedor> getListar(){
        try {
            //java.sql.Connection con = new Connection().getConnection();
            List<Vendedor> vendedores = new ArrayList<Vendedor>();
            PreparedStatement stmt = conex.getConnection().prepareStatement("select * from vendedor");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Vendedor vendedor = new Vendedor();
                vendedor.setIdVendedor(rs.getInt("IdVendedor"));
                vendedor.setNome(rs.getString("nome"));
                vendedor.setCpf(rs.getString("cpf"));
                vendedor.setTelefone(rs.getString("telefone"));
                vendedor.setSalario(rs.getDouble("salario"));
                vendedor.setCidade(rs.getString("cidade"));
                vendedor.setBairro(rs.getString("bairro"));
                vendedor.setRua(rs.getString("rua"));
                vendedor.setNumero(rs.getInt("numero"));
                vendedor.setComplemento(rs.getString("complemento"));
              
                
                vendedores.add(vendedor);
            }
            rs.close();
            stmt.close();
                return vendedores;
        }  catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
  /*  public void Listar(){
        Vendedor pay = new Vendedor();
        
        List<Vendedor> vendedor = pay.getListar();
        
        pay.getListar();
        
        for(Vendedor vendedox : vendedor){
            System.out.println("ID: "+ vendedox.getIdVendedor());
            System.out.println("Nome"+ vendedox.getNome());
            System.out.println("CPF"+ vendedox.getCpf());
            System.out.println("Telefone"+ vendedox.getTelefone());
            System.out.println("Salario"+ vendedox.getSalario());
            System.out.println("Cidade"+ vendedox.getCidade());
            System.out.println("Bairro"+ vendedox.getBairro());
            System.out.println("Rua"+ vendedox.getRua());
            System.out.println("Numero"+ vendedox.getNumero());
            
        }
    }
  */  
    public void Alterar(Vendedor vendedor, int id){
        //java.sql.Connection con = new Connection().getConnection();
      
        try {
            PreparedStatement stmt = conex.getConnection().prepareStatement( "UPDATE vendedor set nome=?, cpf=?, telefone=?, salario=?, cidade=?, bairro=?, rua=?, numero=?, complemento=? WHERE idvendedor=" +id);
                
        
            stmt.setString(1, vendedor.getNome());
            stmt.setString(2, vendedor.getCpf());
            stmt.setString(3, vendedor.getTelefone());
            stmt.setDouble(4, vendedor.getSalario());
            stmt.setString(5, vendedor.getCidade());
            stmt.setString(6, vendedor.getBairro());
            stmt.setString(7, vendedor.getRua());
            stmt.setInt(8, vendedor.getNumero());
            stmt.setString(9, vendedor.getComplemento());
            stmt.setInt(10, vendedor.getIdVendedor());
            stmt.execute();
            
               JOptionPane.showMessageDialog(null, "Alterado com sucesso");
            //stmt.close();
            
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null,"Erro ao alterar"+ e);
      }
    }

    
    public void Deletar(int id){
        //java.sql.Connection con = new Connection().getConnection();
        try {
            PreparedStatement stmt = conex.getConnection().prepareStatement("delete from vendedor where idvendedor=" +id);
            stmt.execute();
            JOptionPane.showMessageDialog(null,"excluido com sucesso!");
           // stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar" + e);
        }
        } 
    
    public Vendedor Pesquisar(int id) {
        Vendedor vend = new Vendedor();
        boolean existe = true;
        
        try {
            PreparedStatement pesquisa = conex.getConnection().prepareStatement("select * from vendedor where idvendedor = " + id);
            ResultSet res = pesquisa.executeQuery();

            while (res.next()) {
                vend.idvendedor = res.getInt(1);
                vend.nome = res.getString(2);
                vend.cpf = res.getString(3);
                vend.telefone = res.getString(4);
                vend.salario = res.getDouble(5);
                vend.setCidade(res.getString(6));
                vend.setBairro(res.getString(7));
                vend.setRua(res.getString(8));
                vend.setNumero(res.getInt(9));
                vend.setComplemento(res.getString(10));
                
                existe = false;
            }

            if(existe){
                JOptionPane.showMessageDialog(null, "vendedor não existe");                     
            }                       
            return vend;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar:"+ex);
        }

        return null;

    }  
}
    
    




