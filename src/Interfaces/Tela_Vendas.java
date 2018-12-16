
package Interfaces;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Objetos.*;

/**
 *
 * @author bx
 */
public class Tela_Vendas extends javax.swing.JPanel {
    double valor_total;
    int codigo;
    
   
    
    
    public Tela_Vendas() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Area_Vendas = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cxProduto = new javax.swing.JTextField();
        cxValor = new javax.swing.JTextField();
        cxQuantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_produtos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        lblTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_funcionario = new javax.swing.JLabel();
        btnAdiconar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1330, 690));
        setMinimumSize(new java.awt.Dimension(1330, 690));
        setPreferredSize(new java.awt.Dimension(1330, 690));

        Area_Vendas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Vendas");

        cxProduto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cxProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cxProdutoFocusLost(evt);
            }
        });

        cxValor.setEditable(false);
        cxValor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        cxQuantidade.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Produto");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Valor");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Quant.");

        Tabela_produtos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabela_produtos.setForeground(new java.awt.Color(51, 51, 51));
        Tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Valor Unitário", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_produtos.setAutoscrolls(false);
        Tabela_produtos.setFocusable(false);
        Tabela_produtos.setGridColor(new java.awt.Color(204, 255, 255));
        Tabela_produtos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabela_produtos);
        if (Tabela_produtos.getColumnModel().getColumnCount() > 0) {
            Tabela_produtos.getColumnModel().getColumn(0).setResizable(false);
            Tabela_produtos.getColumnModel().getColumn(1).setResizable(false);
            Tabela_produtos.getColumnModel().getColumn(2).setResizable(false);
            Tabela_produtos.getColumnModel().getColumn(3).setResizable(false);
            Tabela_produtos.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(51, 51, 51));
        lblTotal.setText("0.00");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("R$:");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setText("Cancelar");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setText("Finalizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/vendedor.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Vendedor");

        lbl_funcionario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_funcionario.setText("Nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(lbl_funcionario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(2, 2, 2)
                .addComponent(lbl_funcionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        btnAdiconar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/adicionar.png"))); // NOI18N
        btnAdiconar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdiconarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Total a Pagar");

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
                .addGap(81, 81, 81)
                .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Area_VendasLayout.createSequentialGroup()
                        .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(Area_VendasLayout.createSequentialGroup()
                                .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdiconar)))
                        .addGap(57, 57, 57)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(125, 125, 125))
                    .addGroup(Area_VendasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        Area_VendasLayout.setVerticalGroup(
            Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Area_VendasLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Area_VendasLayout.createSequentialGroup()
                        .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addGroup(Area_VendasLayout.createSequentialGroup()
                        .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Area_VendasLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(Area_VendasLayout.createSequentialGroup()
                                .addComponent(btnAdiconar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(111, 111, 111))))
        );

        cxQuantidade.getAccessibleContext().setAccessibleName("");

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
    // Adionar Produto
    private void btnAdiconarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdiconarMouseClicked
    String produto = cxProduto.getText();
    double valor = Double.parseDouble(cxValor.getText());
    int quantidade = Integer.parseInt(cxQuantidade.getText());
    double total = valor*quantidade;
    valor_total = valor_total+total;
    Produto pro = new Produto();
    
    pro = pro.Pesquisar(this.codigo);
           
    
    DefaultTableModel modelo = (DefaultTableModel) Tabela_produtos.getModel();        
    modelo.addRow(new Object[]{
       pro.getIdProduto(), pro.getNome(), pro.getValor_venda(),quantidade,total  


        
    });
    
    
    lblTotal.setText(Double.toString(valor_total));
    
    cxProduto.setText("");
    cxQuantidade.setText("");
    cxValor.setText("");
    
        
        
        
    }//GEN-LAST:event_btnAdiconarMouseClicked

    
    
    // pesquisar de produto
    private void cxProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cxProdutoFocusLost
        Produto produto = new Produto();
        int codigo = Integer.parseInt(cxProduto.getText());
        DefaultTableModel modelo = (DefaultTableModel) Tabela_produtos.getModel();
        
        produto = produto.Pesquisar(codigo);
        
        this.codigo = produto.getIdProduto();
        
        cxProduto.setText(produto.getNome());
        cxValor.setText(Double.toString(produto.getValor_venda()));
        
           
        


    }//GEN-LAST:event_cxProdutoFocusLost

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Area_Vendas;
    private javax.swing.JTable Tabela_produtos;
    private javax.swing.JLabel btnAdiconar;
    private javax.swing.JTextField cxProduto;
    private javax.swing.JTextField cxQuantidade;
    private javax.swing.JTextField cxValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lbl_funcionario;
    // End of variables declaration//GEN-END:variables
}
