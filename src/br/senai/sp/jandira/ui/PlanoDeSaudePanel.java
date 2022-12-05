
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PlanoDeSaudePanel extends javax.swing.JPanel {

    
    int linha;
 
    public PlanoDeSaudePanel() {
        initComponents();
        criarTabelaPlanosDeSaude();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        scrollTablePlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttonAlterarPlanoDeSaude = new javax.swing.JButton();
        buttonAdicionarPlanoDeSaude = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setPreferredSize(new java.awt.Dimension(945, 370));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Planos de saúde");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 20);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTablePlanosDeSaude.setViewportView(tablePlanosDeSaude);

        add(scrollTablePlanosDeSaude);
        scrollTablePlanosDeSaude.setBounds(20, 40, 905, 240);

        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(700, 294, 70, 60);

        buttonAlterarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png"))); // NOI18N
        buttonAlterarPlanoDeSaude.setToolTipText("Editar plano de saúde selecionado");
        buttonAlterarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonAlterarPlanoDeSaude);
        buttonAlterarPlanoDeSaude.setBounds(780, 294, 70, 60);

        buttonAdicionarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        buttonAdicionarPlanoDeSaude.setToolTipText("Adicionar plano de saúde");
        buttonAdicionarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonAdicionarPlanoDeSaude);
        buttonAdicionarPlanoDeSaude.setBounds(860, 294, 70, 60);

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeActionPerformed
        linha = tablePlanosDeSaude.getSelectedRow();
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione o plano que você deseja excluir",
                "Plano de saúde",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeActionPerformed

    private void buttonAlterarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarPlanoDeSaudeActionPerformed
        linha = tablePlanosDeSaude.getSelectedRow();
        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione o plano que você deseja alterar",
                "Plano de saúde",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarPlanoDeSaudeActionPerformed

    private void buttonAdicionarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanoDeSaudeActionPerformed
        PlanoDeSaudeDialog planosDeSaudeDialog = new PlanoDeSaudeDialog(
            null,
            true,
            TipoOperacao.ADCIONAR,
            null);
        planosDeSaudeDialog.setVisible(true);
        criarTabelaPlanosDeSaude();
    }//GEN-LAST:event_buttonAdicionarPlanoDeSaudeActionPerformed
    
    private void editar(){
        
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigoSelecionado());
        
          PlanoDeSaudeDialog planosDeSaudeDialog = new PlanoDeSaudeDialog(null,
               true,
               TipoOperacao.ALTERAR,
               planoDeSaude);
       planosDeSaudeDialog.setVisible(true);
        criarTabelaPlanosDeSaude();
    }
    
    private void excluir(){
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusaõ do plano de saúde selecionado?",
                "Plano de Saúde",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
             String codiStr = tablePlanosDeSaude.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codiStr);
        PlanoDeSaudeDAO.excluir(codigo);
        criarTabelaPlanosDeSaude();
        
        }
        
    }
     
    private Integer getCodigoSelecionado(){
        String codiStr = tablePlanosDeSaude.getValueAt(linha, 0).toString();
        return Integer.valueOf(codiStr);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanoDeSaude;
    private javax.swing.JButton buttonAlterarPlanoDeSaude;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scrollTablePlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaPlanosDeSaude() {

        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getTableModel());

        // desativar o redimensionamento da JTable
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //definir a largura de cada coluna
        tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(117);
        tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(400);
        tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(400);

        //impedir a movimentaçao das colunas 
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);

        //bloquear ediçao das células 
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);
    }
}
