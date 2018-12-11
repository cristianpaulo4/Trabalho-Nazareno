/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bx
 */
public class Tela_CadProduto extends javax.swing.JPanel {
    
    double valor_total;
    
  
    public Tela_CadProduto() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Area_Vendas = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        btn_Pesquisar = new javax.swing.JButton();
        btn_Listar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1330, 690));
        setMinimumSize(new java.awt.Dimension(1330, 690));
        setPreferredSize(new java.awt.Dimension(1330, 690));

        Area_Vendas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Cadastro de Produto");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(808, 598));
        jPanel2.setMinimumSize(new java.awt.Dimension(808, 598));
        jPanel2.setPreferredSize(new java.awt.Dimension(808, 598));

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Valor de Venda");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Código");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Quantidade");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Valor de Custo");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Quant. Minimo");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Numero da nota:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Fornecedor:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("*******");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("0000000");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/EXCLUIR.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/salvar.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/cancelar.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/editar.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Validade");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        btn_Pesquisar.setText("Pesquisar");
        btn_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisarActionPerformed(evt);
            }
        });

        btn_Listar.setText("Listar");
        btn_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(304, 304, 304)
                        .addComponent(btn_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel21)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel20))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jLabel6)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(btn_Pesquisar)
                    .addComponent(btn_Listar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addContainerGap())
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/vendedor.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Valor da Nota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N
        jPanel3.setMaximumSize(new java.awt.Dimension(375, 179));
        jPanel3.setMinimumSize(new java.awt.Dimension(375, 179));
        jPanel3.setPreferredSize(new java.awt.Dimension(375, 179));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 72)); // NOI18N
        jLabel14.setText("00.00");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 72)); // NOI18N
        jLabel15.setText("R$:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Valor total dos produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N
        jPanel4.setMaximumSize(new java.awt.Dimension(375, 179));
        jPanel4.setMinimumSize(new java.awt.Dimension(375, 179));
        jPanel4.setPreferredSize(new java.awt.Dimension(375, 179));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 72)); // NOI18N
        jLabel16.setText("00.00");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 72)); // NOI18N
        jLabel17.setText("R$:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Funcionário");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setText("Nome");

        javax.swing.GroupLayout Area_VendasLayout = new javax.swing.GroupLayout(Area_Vendas);
        Area_Vendas.setLayout(Area_VendasLayout);
        Area_VendasLayout.setHorizontalGroup(
            Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(Area_VendasLayout.createSequentialGroup()
                .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Area_VendasLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Area_VendasLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel9)))
                            .addGroup(Area_VendasLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Area_VendasLayout.createSequentialGroup()
                        .addGap(896, 896, 896)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Area_VendasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        Area_VendasLayout.setVerticalGroup(
            Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Area_VendasLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Area_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Area_VendasLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Area_VendasLayout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
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

    
    // BOTÃO PESQUISAR PRODUTO
    private void btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Cógido do Produto:"));
        
      



    }//GEN-LAST:event_btn_PesquisarActionPerformed

    // BOTÃO DE LISTAR PRODUTOS
    private void btn_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListarActionPerformed
        Tela_ListarProduto lista = new Tela_ListarProduto();
        
        lista.setVisible(true);
       
                
    }//GEN-LAST:event_btn_ListarActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Area_Vendas;
    private javax.swing.JButton btn_Listar;
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
