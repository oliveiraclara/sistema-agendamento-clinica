
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import javax.swing.JOptionPane;

public class EspecialidadesDialog extends javax.swing.JDialog {
    
    private TipoOperacao tipoOperacao;
    private Especialidade especialidade;
    
    public EspecialidadesDialog(java.awt.Frame parent, boolean modal,
            TipoOperacao tipoOperacao,
            Especialidade especialidade) {
        
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.especialidade = especialidade;
        
      // Preencher os campos, caso o tipo de peracao for ALTERAR
      if (tipoOperacao == tipoOperacao.ALTERAR){
         preencherFormulario();
      }     
    }

    private void preencherFormulario(){
        labelTitulo.setText("Especialidade -" + tipoOperacao);
        iconTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png")));
        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textNomeDaEspecialidade.setText(especialidade.getNome());
        textDescricao.setText(especialidade.getDescricao());
    }
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        iconTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelDescricao = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelDetalhesDaEspecialidade = new javax.swing.JLabel();
        textNomeDaEspecialidade = new javax.swing.JTextField();
        textDescricao = new javax.swing.JTextField();
        textFieldCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Especialidades - Adicionar");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(90, 20, 500, 40);

        iconTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/addPlano64.png"))); // NOI18N
        jPanel1.add(iconTitulo);
        iconTitulo.setBounds(10, 10, 70, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(630, 300));
        jPanel2.setLayout(null);

        labelDescricao.setText("Descrição:");
        jPanel2.add(labelDescricao);
        labelDescricao.setBounds(20, 160, 80, 16);

        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(20, 50, 50, 16);

        labelNomeDaEspecialidade.setText("Nome:");
        jPanel2.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(20, 100, 50, 16);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(450, 230, 70, 60);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar novo plano");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(540, 230, 70, 60);

        labelDetalhesDaEspecialidade.setText("Detalhes da Especialidade:");
        jPanel2.add(labelDetalhesDaEspecialidade);
        labelDetalhesDaEspecialidade.setBounds(20, 10, 150, 16);
        jPanel2.add(textNomeDaEspecialidade);
        textNomeDaEspecialidade.setBounds(20, 120, 260, 22);

        textDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDescricaoActionPerformed(evt);
            }
        });
        jPanel2.add(textDescricao);
        textDescricao.setBounds(20, 190, 260, 22);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 70, 64, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 110, 630, 300);

        setBounds(0, 0, 687, 453);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if(tipoOperacao == TipoOperacao.ADCIONAR){
            gravar();
        }else{
            atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDescricaoActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void atualizar(){
        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescricao.getText());
        
        if(validarCadastro()){
            EspecialidadeDAO.atualizar(especialidade);
            JOptionPane.showMessageDialog(this, "Especialidade Gravada com Sucesso!!", "Especialidade", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
    
    private void gravar(){
        //criar um objeto especialidade
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescricao.getText());
        
         if (validarCadastro()){
            EspecialidadeDAO.gravar(especialidade);
            dispose();
        }
    }
    private boolean validarCadastro(){
        if(textNomeDaEspecialidade.getText().isEmpty()){    
            JOptionPane.showMessageDialog(this, "Por favor preencha o nome da Especialidade!", "Especilidade", JOptionPane.ERROR_MESSAGE);
        
            textNomeDaEspecialidade.requestFocus();
            return false;
        }
          
       if (textDescricao.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor preencha a Descrição! ", "Especialidade", JOptionPane.ERROR_MESSAGE);
          
            textDescricao.requestFocus();
            return false;
           
       }
        return true;
     
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel iconTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelDetalhesDaEspecialidade;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textDescricao;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables

}
