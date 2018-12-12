package Objetos;

import BDconexao.*;
import java.sql.PreparedStatement;
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
        conex.getConnection();

        try {
            PreparedStatement cad = conex.con.prepareCall("insert into produto (idproduto,nome,quantidade, quant_minimo, validade, valor_venda, valor_custo, Fornecedor) values (?,?,?,?,?,?,?,?)");

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
    public void Alterar(Produto produto) {

    }

    // Listar
    public void Listar() {

    }

    // Pesquisar
    public void Pesquisar(int codigo) {

    }

    // Excluir
    public void Excluir(int codigo) {

    }

}
