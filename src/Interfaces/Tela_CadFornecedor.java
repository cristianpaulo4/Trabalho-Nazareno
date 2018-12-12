/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.*;
import BDconexao.conexao;
import Objetos.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;






public class Tela_CadFornecedor extends javax.swing.JPanel {
    //cria conexao
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

   
    
    double valor_total;
    
    /**
     * Creates new form Vendas
     */
    public Tela_CadFornecedor() {
        initComponents();
        
      //  con = conexao.getConnection();
    }
    
     public List<Fornecedor> lista(){
        
         String sql = "SELECT * FROM Fornecedor";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedor> fornecedor = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql); 
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor forne = new Fornecedor();
                forne.setCnpj(rs.getInt("cnpj"));
                forne.setNome(rs.getString("nome"));
                forne.setTelefone(rs.getString("telefone"));
                forne.setCidade(rs.getString("cidade"));
                forne.setRua(rs.getString("rua"));
                forne.setComplemento(rs.getString("complemento"));
                forne.setBairro(rs.getString("bairro"));
                forne.setNumero(rs.getInt("nome"));  
                
                fornecedor.add(forne);
            }
            
        } catch (SQLException e) {
            System.err.println("Erro!"+e);
        }
      
        return fornecedor;
    }
     
      private void pesquisar(){
       String sql = "SELECT * FROM Fornecedor WHERE cnpj = ?";
       try {
           pst = con.prepareStatement(sql);
           pst.setString(1,TexCNPJ.getText());
           rs = pst.executeQuery();
           if (rs.next()) {
               TexNome.setText(rs.getString(2));
               TexTelefone.setText(rs.getString(3));
               TexCidade.setText(rs.getString(4));
               TexRua.setText(rs.getString(5));
               TexComplemento.setText(rs.getString(6));
               TexBairro.setText(rs.getString(7));
               TexNumero.setText(rs.getString(8));
           } else {
               JOptionPane.showMessageDialog(null,"nao cadastrado!");  
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
   }
    
       private void editar(Fornecedor fornecedor){
        String sql = "UPDATE Fornecedor SET cnpj = ?, nome = ?, telefone = ?, cidade = ?, rua = ?, complemento = ?, bairro = ?, numero = ? WHERE cnpj= ?";
       try {
           pst=con.prepareStatement(sql);
           pst.setString(1, TexCNPJ.getText());
           pst.setString(2, TexNome.getText());
           pst.setString(3, TexTelefone.getText());
           pst.setString(4, TexCidade.getText());
           pst.setString(5, TexRua.getText());
           pst.setString(6, TexComplemento.getText());
           pst.setString(7, TexBairro.getText());
           pst.setString(8, TexNumero.getText());
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
           } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
        
    }
    
      // metodo para deletar um fornercedor
    private void deletar(Fornecedor fornecedor){
        String sql = "DELETE FROM Fornecedor WHERE cnpj= ?";
       try {
           pst=con.prepareStatement(sql);
           pst.setString(1, TexCNPJ.getText());
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
           } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
    }
       
        // metodo para salvar um fornrcedor
   
private void salvar(){
        String sql = "INSERT INTO Fornecedor (cnpj, nome, telefone, cidade, rua, complemento, bairro, numero ) values (?, ?, ?, ?, ?, ?, ?, ?)";
       try {
           pst=con.prepareStatement(sql);
           pst.setString(1, TexCNPJ.getText());
           pst.setString(2, TexNome.getText());
           pst.setString(3, TexTelefone.getText());
           pst.setString(4, TexCidade.getText());
           pst.setString(5, TexRua.getText());
           pst.setString(6, TexComplemento.getText());
           pst.setString(7, TexBairro.getText());
           pst.setString(8, TexNumero.getText());
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
           } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
           
    
    }
       
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Area_Vendas = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TexNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TexTelefone = new javax.swing.JFormattedTextField();
        TexCNPJ = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        alterar = new javax.swing.JLabel();
        deletar = new javax.swing.JLabel();
        salvar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TexCidade = new javax.swing.JTextField();
        TexRua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TexBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TexNumero = new javax.swing.JTextField();
        TexComplemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1330, 690));
        setMinimumSize(new java.awt.Dimension(1330, 690));
        setPreferredSize(new java.awt.Dimension(1330, 690));

        Area_Vendas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Cadastro de Fornecedores");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Fornecedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(808, 598));
        jPanel2.setMinimumSize(new java.awt.Dimension(808, 598));
        jPanel2.setPreferredSize(new java.awt.Dimension(808, 598));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("CNPJ");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nome");

        TexNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Telefone");

        try {
            TexTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TexTelefone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        try {
            TexCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TexCNPJ.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TexCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 473, Short.MAX_VALUE))
                    .addComponent(TexNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TexTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TexNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TexTelefone)
                    .addComponent(TexCNPJ))
                .addGap(493, 493, 493))
        );

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/cancelar.png"))); // NOI18N

        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/editar.png"))); // NOI18N
        alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alterarMouseClicked(evt);
            }
        });

        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/EXCLUIR.png"))); // NOI18N
        deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletarMouseClicked(evt);
            }
        });

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/salvar.png"))); // NOI18N
        salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N
        jPanel3.setMaximumSize(new java.awt.Dimension(808, 598));
        jPanel3.setMinimumSize(new java.awt.Dimension(808, 598));

        TexCidade.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        TexRua.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Rua");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Cidade");

        TexBairro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Bairro");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Numero");

        TexNumero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        TexComplemento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Complemento");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TexRua, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                        .addComponent(TexCidade)
                        .addComponent(TexComplemento)
                        .addComponent(jLabel9))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(TexBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addComponent(TexNumero))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TexCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TexBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TexComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );

        jButton1.setText("Pesquisar");

        jButton2.setText("Listar");

        javax.swing.GroupLayout Area_VendasLayout = new javax.swing.GroupLayout(Area_Vendas);
        Area_Vendas.setLayout(Area_VendasLayout);
        Area_VendasLayout.setHorizontalGroup(
            Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(Area_VendasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Area_VendasLayout.createSequentialGroup()
                .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Area_VendasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(alterar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(deletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salvar)
                        .addGap(242, 242, 242)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Area_VendasLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        Area_VendasLayout.setVerticalGroup(
            Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Area_VendasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salvar)
                    .addComponent(deletar)
                    .addComponent(jLabel21)
                    .addComponent(alterar)
                    .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Area_Vendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Area_Vendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMouseClicked
         Fornecedor fornecedor= new Fornecedor();
        salvar();
    }//GEN-LAST:event_salvarMouseClicked

    private void deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletarMouseClicked
       
        Fornecedor fornecedor= new Fornecedor();
        deletar(fornecedor);
    }//GEN-LAST:event_deletarMouseClicked

    private void alterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarMouseClicked
        
          Fornecedor fornecedor= new Fornecedor();
          editar(fornecedor);
    }//GEN-LAST:event_alterarMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
     //       java.util.logging.Logger.getLogger(CadContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
       //     java.util.logging.Logger.getLogger(CadContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
         //   java.util.logging.Logger.getLogger(CadContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           // java.util.logging.Logger.getLogger(CadContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_CadFornecedor().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Area_Vendas;
    private javax.swing.JTextField TexBairro;
    private javax.swing.JFormattedTextField TexCNPJ;
    private javax.swing.JTextField TexCidade;
    private javax.swing.JTextField TexComplemento;
    private javax.swing.JTextField TexNome;
    private javax.swing.JTextField TexNumero;
    private javax.swing.JTextField TexRua;
    private javax.swing.JFormattedTextField TexTelefone;
    private javax.swing.JLabel alterar;
    private javax.swing.JLabel deletar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel salvar;
    // End of variables declaration//GEN-END:variables
}
