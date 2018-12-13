package Objetos;

import BDconexao.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Produto {

    conexao conex = new conexao();

    private int idProduto;
    private String nome;
    private int quantidade;
    private int quant_minimo;
    private String validade;
    private double valor_venda;
    private double valor_custo;
    private String Fornecedor;

    // METODOS DE INSERÇÃO
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuant_minimo() {
        return quant_minimo;
    }

    public void setQuant_minimo(int quant_minimo) {
        this.quant_minimo = quant_minimo;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public double getValor_custo() {
        return valor_custo;
    }

    public void setValor_custo(double valor_custo) {
        this.valor_custo = valor_custo;
    }

    public String getIdFornecedor() {
        return Fornecedor;
    }

    public void setIdFornecedor(String idFornecedor) {
        this.Fornecedor = idFornecedor;
    }

    // METODOS CRUD
    // CADASTRAR
    public void Cadastrar(Produto produto) {

        try {
            PreparedStatement cad = conex.getConnection().prepareStatement("insert into produto (idproduto,nome,quantidade, quant_minimo,validade, valor_venda, valor_custo, Fornecedor_cnpj) values (?,?,?,?,?,?,?,?)");

            cad.setInt(1, produto.getIdProduto());
            cad.setString(2, produto.getNome());
            cad.setInt(3, produto.getQuantidade());
            cad.setInt(4, produto.getQuant_minimo());
            cad.setString(5, produto.getValidade());
            cad.setDouble(6, produto.getValor_venda());
            cad.setDouble(7, produto.getValor_venda());
            cad.setString(8, produto.getIdFornecedor());
            cad.execute();
            JOptionPane.showMessageDialog(null, "salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar produto:\n" + ex);

        }

    }

    // Alterar
    public void Alterar(Produto produto, int codigo) {
        
        try {
            PreparedStatement alterar = conex.getConnection().prepareStatement("UPDATE produto SET nome = ?, quantidade = ?, quant_minimo = ?, validade = ?, valor_venda = ?, valor_custo = ?, Fornecedor_cnpj = ? WHERE idproduto=" + codigo);
            
            alterar.setString(1, produto.getNome());
            alterar.setInt(2, produto.getQuantidade());
            alterar.setInt(3, produto.getQuant_minimo());
            alterar.setString(4, produto.getValidade());
            alterar.setDouble(5, produto.getValor_venda());
            alterar.setDouble(6, produto.getValor_custo());
            alterar.setString(7, produto.getIdFornecedor());
                       
            
            alterar.execute();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
            
            
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar"+ ex);
        }
           
        
        
        
        
    }

    // Pesquisar
    public Produto Pesquisar(int codigo) {
        Produto pro = new Produto();
        boolean existe = true;
        
        try {
            PreparedStatement pesquisa = conex.getConnection().prepareStatement("select * from produto where idproduto = " + codigo);
            ResultSet res = pesquisa.executeQuery();

            while (res.next()) {
                pro.idProduto = res.getInt(1);
                pro.nome = res.getString(2);
                pro.quantidade = res.getInt(3);
                pro.quant_minimo = res.getInt(4);
                pro.validade = res.getString(5);
                pro.valor_venda = res.getDouble(6);
                pro.valor_custo = res.getDouble(7);
                pro.Fornecedor = res.getString(8);
                
                existe = false;

            }

            if(existe){
                JOptionPane.showMessageDialog(null, "Produto não existe");
                
                
            }            
            
            return pro;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar:"+ex);
        }

        return null;

    }

    
    
    
    
    
    // Excluir
    public void Excluir(int codigo) {
        try {
            PreparedStatement excluir = conex.getConnection().prepareStatement("delete from produto where idproduto=" + codigo);
            excluir.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                  
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao deletar:" + ex);
        }
        
        
        
        
        
    }

}
