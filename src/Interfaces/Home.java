/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author bx
 */
public class Home extends javax.swing.JFrame {

    Point posicao = new Point();
  

   
    public Home() {
        initComponents();

        this.setTitle("Sistema de Vendas");
        this.setIconImage(null);

        Tela_Vendas t_vendas = new Tela_Vendas();
        t_vendas.setSize(1330, 690);

        Area_Trabalho.removeAll();
        Area_Trabalho.add(t_vendas, CENTER_ALIGNMENT);
        Area_Trabalho.revalidate();
        Area_Trabalho.repaint();
        
        // CAIXAR INICIAL
        String valor_inicial = JOptionPane.showInputDialog("Digite o Valor Inicial");
        
        System.out.println(valor_inicial);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Indicador = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_Trocar_usuario = new javax.swing.JLabel();
        btn_Vendas = new javax.swing.JLabel();
        btn_Cad_Cliente = new javax.swing.JLabel();
        btn_produto = new javax.swing.JLabel();
        btn_Caixa = new javax.swing.JLabel();
        btn_Fornecedor = new javax.swing.JLabel();
        btn_relatorio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        Area_Trabalho = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1328, 881));
        setMinimumSize(new java.awt.Dimension(1328, 881));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1302, 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Indicador.setBackground(new java.awt.Color(204, 0, 0));
        Indicador.setPreferredSize(new java.awt.Dimension(1302, 5));

        javax.swing.GroupLayout IndicadorLayout = new javax.swing.GroupLayout(Indicador);
        Indicador.setLayout(IndicadorLayout);
        IndicadorLayout.setHorizontalGroup(
            IndicadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        IndicadorLayout.setVerticalGroup(
            IndicadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(Indicador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 125, 1330, 5);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_Trocar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/troca_usuario.png"))); // NOI18N
        btn_Trocar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Trocar_usuarioMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Trocar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, -1, -1));

        btn_Vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/vendas.png"))); // NOI18N
        btn_Vendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VendasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_VendasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_VendasMouseEntered(evt);
            }
        });
        jPanel1.add(btn_Vendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        btn_Cad_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/clientes.png"))); // NOI18N
        btn_Cad_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Cad_ClienteMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Cad_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        btn_produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/cad_produto.png"))); // NOI18N
        btn_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_produtoMouseClicked(evt);
            }
        });
        jPanel1.add(btn_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        btn_Caixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/caixa_saida.png"))); // NOI18N
        btn_Caixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CaixaMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Caixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        btn_Fornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/fornecedor.png"))); // NOI18N
        btn_Fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FornecedorMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        btn_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/imagens/relatorio.png"))); // NOI18N
        btn_relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_relatorioMouseClicked(evt);
            }
        });
        jPanel1.add(btn_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Trocar Usuários");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Vendas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Gestor Produto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Caixa / Saida / Boletos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Vendedor / Gerente");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Fornecedores");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Relatórios");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 100, 90, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1329, 130);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1330, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 810, 1330, 56);

        Area_Trabalho.setBackground(new java.awt.Color(255, 255, 255));
        Area_Trabalho.setMaximumSize(new java.awt.Dimension(1330, 690));

        javax.swing.GroupLayout Area_TrabalhoLayout = new javax.swing.GroupLayout(Area_Trabalho);
        Area_Trabalho.setLayout(Area_TrabalhoLayout);
        Area_TrabalhoLayout.setHorizontalGroup(
            Area_TrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1330, Short.MAX_VALUE)
        );
        Area_TrabalhoLayout.setVerticalGroup(
            Area_TrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(Area_Trabalho);
        Area_Trabalho.setBounds(0, 130, 1330, 680);

        setSize(new java.awt.Dimension(1338, 895));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    private void btn_VendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendasMouseEntered


    }//GEN-LAST:event_btn_VendasMouseEntered

    private void btn_VendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendasMouseExited


    }//GEN-LAST:event_btn_VendasMouseExited

    // Botão Vendas
    private void btn_VendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendasMouseClicked

        Tela_Vendas t_vendas = new Tela_Vendas();
        t_vendas.setSize(1330, 690);

        Area_Trabalho.removeAll();
        Area_Trabalho.add(t_vendas, CENTER_ALIGNMENT);
        Area_Trabalho.revalidate();
        Area_Trabalho.repaint();

        posicao = Indicador.getLocation();
        Point p = new Point(btn_Vendas.getLocation());
        Animacion.Animacion.mover_izquierda(posicao.x, p.x - 40, 1, 3, Indicador);


    }//GEN-LAST:event_btn_VendasMouseClicked

    // Botão de cadastro de produto
    private void btn_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produtoMouseClicked

        Tela_CadProduto cad = new Tela_CadProduto();
        cad.setSize(1330, 690);

        Area_Trabalho.removeAll();
        Area_Trabalho.add(cad, CENTER_ALIGNMENT);
        Area_Trabalho.revalidate();
        Area_Trabalho.repaint();

        posicao = Indicador.getLocation();
        Point p = new Point(btn_produto.getLocation());

        if (posicao.x < p.x) {
            Animacion.Animacion.mover_derecha(posicao.x, p.x - 25, 1, 3, Indicador);
        } else {
            Animacion.Animacion.mover_izquierda(posicao.x, p.x - 25, 1, 3, Indicador);
        }


    }//GEN-LAST:event_btn_produtoMouseClicked

    // botão de cadastro de funcionario
    private void btn_Cad_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cad_ClienteMouseClicked
        posicao = Indicador.getLocation();
        Point p = new Point(btn_Cad_Cliente.getLocation());

        if (posicao.x < p.x) {
            Animacion.Animacion.mover_derecha(posicao.x, p.x - 25, 1, 3, Indicador);
        } else {
            Animacion.Animacion.mover_izquierda(posicao.x, p.x - 25, 1, 3, Indicador);
            
        }

        Tela_CadFuncionario cad = new Tela_CadFuncionario();
        cad.setSize(1330, 690);

        Area_Trabalho.removeAll();
        Area_Trabalho.add(cad, CENTER_ALIGNMENT);
        Area_Trabalho.revalidate();
        Area_Trabalho.repaint();


    }//GEN-LAST:event_btn_Cad_ClienteMouseClicked

    // BOTÃO CAIXA
    private void btn_CaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CaixaMouseClicked
        posicao = Indicador.getLocation();
        Point p = new Point(btn_Caixa.getLocation());

        if (posicao.x < p.x) {
            Animacion.Animacion.mover_derecha(posicao.x, p.x - 25, 1, 3, Indicador);
        } else {
            Animacion.Animacion.mover_izquierda(posicao.x, p.x - 25, 1, 3, Indicador);
        }

        Tela_CaixaSaida cad = new Tela_CaixaSaida();
        cad.setSize(1330, 690);

        Area_Trabalho.removeAll();
        Area_Trabalho.add(cad, CENTER_ALIGNMENT);
        Area_Trabalho.revalidate();
        Area_Trabalho.repaint();


    }//GEN-LAST:event_btn_CaixaMouseClicked

    // BOTÃO FORNECEDOR
    private void btn_FornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FornecedorMouseClicked
        posicao = Indicador.getLocation();
        Point p = new Point(btn_Fornecedor.getLocation());

        if (posicao.x < p.x) {
            Animacion.Animacion.mover_derecha(posicao.x, p.x - 25, 1, 3, Indicador);
        } else {
            Animacion.Animacion.mover_izquierda(posicao.x, p.x - 25, 1, 3, Indicador);
        }

        Tela_CadFornecedor cad = new Tela_CadFornecedor();
        cad.setSize(1330, 690);

        Area_Trabalho.removeAll();
        Area_Trabalho.add(cad, CENTER_ALIGNMENT);
        Area_Trabalho.revalidate();
        Area_Trabalho.repaint();


    }//GEN-LAST:event_btn_FornecedorMouseClicked

    // BOTÃO RELATORIO
    private void btn_relatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_relatorioMouseClicked
        posicao = Indicador.getLocation();
        Point p = new Point(btn_relatorio.getLocation());

        if (posicao.x < p.x) {
            Animacion.Animacion.mover_derecha(posicao.x, p.x - 25, 1, 3, Indicador);
        } else {
            Animacion.Animacion.mover_izquierda(posicao.x, p.x - 25, 1, 3, Indicador);
        }

        Tela_Relatorio cad = new Tela_Relatorio();
        cad.setSize(1330, 690);

        Area_Trabalho.removeAll();
        Area_Trabalho.add(cad, CENTER_ALIGNMENT);
        Area_Trabalho.revalidate();
        Area_Trabalho.repaint();


    }//GEN-LAST:event_btn_relatorioMouseClicked

    // BOTÃO TROCA DE USUARIO
    private void btn_Trocar_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Trocar_usuarioMouseClicked
        Tela_Login l = new Tela_Login();

        posicao = Indicador.getLocation();
        Point p = new Point(btn_Trocar_usuario.getLocation());

        if (posicao.x < p.x) {
            Animacion.Animacion.mover_derecha(posicao.x, p.x - 25, 1, 3, Indicador);
        } else {
            Animacion.Animacion.mover_izquierda(posicao.x, p.x - 25, 1, 3, Indicador);
        }

        int op = JOptionPane.showConfirmDialog(null, "Deseja trocar de usuário?");

        System.out.println(op);

        if (op == 0) {
            dispose();
            l.setVisible(true);

        }


    }//GEN-LAST:event_btn_Trocar_usuarioMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Area_Trabalho;
    public javax.swing.JPanel Indicador;
    private javax.swing.JLabel btn_Cad_Cliente;
    private javax.swing.JLabel btn_Caixa;
    private javax.swing.JLabel btn_Fornecedor;
    private javax.swing.JLabel btn_Trocar_usuario;
    private javax.swing.JLabel btn_Vendas;
    private javax.swing.JLabel btn_produto;
    private javax.swing.JLabel btn_relatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
