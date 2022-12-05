package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class EspecialidadesPanel extends javax.swing.JPanel {

     int linha;
    
    public EspecialidadesPanel() {
        initComponents();
        criarTabelaEspecialidades();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTableEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonAlterarEspecialidade = new javax.swing.JButton();
        buttonAdicionarEspecialidade = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setPreferredSize(new java.awt.Dimension(945, 370));
        setLayout(null);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTableEspecialidades.setViewportView(tableEspecialidades);

        add(scrollTableEspecialidades);
        scrollTableEspecialidades.setBounds(20, 40, 905, 240);

        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonExcluirEspecialidade.setToolTipText("Excluir especialidade selecionada");
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(700, 294, 70, 60);

        buttonAlterarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png"))); // NOI18N
        buttonAlterarEspecialidade.setToolTipText("Editar especialidade selecionada");
        buttonAlterarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAlterarEspecialidade);
        buttonAlterarEspecialidade.setBounds(780, 294, 70, 60);

        buttonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        buttonAdicionarEspecialidade.setToolTipText("Adicionar especialidade");
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(860, 294, 70, 60);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Especialidades");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 20);

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed
        linha = tableEspecialidades.getSelectedRow();
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione a especialidade que você deseja excluir.",
                "Especialidades",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed

    private void buttonAlterarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarEspecialidadeActionPerformed
        linha = tableEspecialidades.getSelectedRow();
        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione a especialidade que você deseja alterar",
                "Especialidades",
                JOptionPane.WARNING_MESSAGE);
            criarTabelaEspecialidades();
        }
    }//GEN-LAST:event_buttonAlterarEspecialidadeActionPerformed

    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed
        EspecialidadesDialog especialidadesDialog = new EspecialidadesDialog(
            null,
            true,
            TipoOperacao.ADCIONAR,
            null);
        especialidadesDialog.setVisible(true);
        criarTabelaEspecialidades();
    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed
   private void editar(){
        
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigoSelecionado());
        
        EspecialidadesDialog dialogEspecialidade = new EspecialidadesDialog(null, true,
                TipoOperacao.ALTERAR,
                especialidade);
        dialogEspecialidade.setVisible(true);
        criarTabelaEspecialidades();
    }
    
    private void excluir(){
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusaõ da Especialidade selecionada?",
                "Especialidades",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
             String codiStr = tableEspecialidades.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codiStr);
        EspecialidadeDAO.excluir(codigo);
        criarTabelaEspecialidades();
        
        }
        
    }
    private Integer getCodigoSelecionado(){
        String codiStr = tableEspecialidades.getValueAt(linha, 0).toString();
        return Integer.valueOf(codiStr);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonAlterarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scrollTableEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaEspecialidades() {
        tableEspecialidades.setModel(EspecialidadeDAO.getTableModel());

        // desativar o redimensionamento da JTable
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //definir a largura de cada coluna
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(117);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(400);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(400);

         //impedir a movimentaçao das colunas 
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        //bloquear ediçao das células 
        tableEspecialidades.setDefaultEditor(Object.class, null);
        
    }

    }
