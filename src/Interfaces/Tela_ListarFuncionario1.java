/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import BDconexao.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Objetos.*;

/**
 *
 * @author bx
 */
public class Tela_ListarFuncionario1 extends javax.swing.JFrame {

    Point posicao = new Point();

    public Tela_ListarFuncionario1() {
        initComponents();
        listar();
        this.setTitle("Produtos");
        this.setIconImage(null);

    }

    public void listar() {
        conexao lista = new conexao();
        
        
        DefaultTableModel modelo = (DefaultTableModel) tblTodosProdutos.getModel();

        
        try {
            PreparedStatement list = lista.getConnection().prepareStatement("select * from vendedor");
            ResultSet res = list.executeQuery();
                       
                        
            while (res.next()) {                
                modelo.addRow(new Object[]{
                res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getDouble(5), res.getString(6), res.getString(7), res.getString(8), res.getInt(9), res.getString(10)
                    
                
                
                
                });
                
                
                
                
            }
            
            
            
            
            
             
                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

        } catch (SQLException ex) {
            Logger.getLogger(Tela_ListarFuncionario1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        Area_Trabalho = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodosProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1158, 865));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1302, 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 125, 1330, 5);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 72)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Todos os Funcionários");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1160, 130);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 786, 1160, 80);

        Area_Trabalho.setBackground(new java.awt.Color(255, 255, 255));
        Area_Trabalho.setMaximumSize(new java.awt.Dimension(1160, 680));

        tblTodosProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "CPF", "Telefone", "Salário", "Cidade", "Bairro", "Rua", "Complemento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTodosProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblTodosProdutos);
        if (tblTodosProdutos.getColumnModel().getColumnCount() > 0) {
            tblTodosProdutos.getColumnModel().getColumn(0).setResizable(false);
            tblTodosProdutos.getColumnModel().getColumn(1).setResizable(false);
            tblTodosProdutos.getColumnModel().getColumn(2).setResizable(false);
            tblTodosProdutos.getColumnModel().getColumn(3).setResizable(false);
            tblTodosProdutos.getColumnModel().getColumn(4).setResizable(false);
            tblTodosProdutos.getColumnModel().getColumn(5).setResizable(false);
            tblTodosProdutos.getColumnModel().getColumn(6).setResizable(false);
            tblTodosProdutos.getColumnModel().getColumn(7).setResizable(false);
            tblTodosProdutos.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout Area_TrabalhoLayout = new javax.swing.GroupLayout(Area_Trabalho);
        Area_Trabalho.setLayout(Area_TrabalhoLayout);
        Area_TrabalhoLayout.setHorizontalGroup(
            Area_TrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Area_TrabalhoLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        Area_TrabalhoLayout.setVerticalGroup(
            Area_TrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Area_TrabalhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(Area_Trabalho);
        Area_Trabalho.setBounds(0, 130, 1160, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tela_ListarFuncionario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_ListarFuncionario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_ListarFuncionario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_ListarFuncionario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_ListarFuncionario1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Area_Trabalho;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblTodosProdutos;
    // End of variables declaration//GEN-END:variables
}
