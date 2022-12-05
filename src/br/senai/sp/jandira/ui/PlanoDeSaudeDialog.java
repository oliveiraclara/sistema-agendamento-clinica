package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private PlanoDeSaude planoDeSaude;

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            PlanoDeSaude planoDeSaude) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.planoDeSaude = planoDeSaude;

        // Preencher os campos, caso o tipo de peracao for ALTERAR
        if (tipoOperacao == tipoOperacao.ALTERAR) {
            preencherFormulario();
        }
    }

    private void preencherFormulario() {
        labelTitulo.setText("Planos de saúde -" + tipoOperacao);
        iconTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit.png")));
        textFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        textNomeDaOperadora.setText(planoDeSaude.getOperadora());
        textTipoDoPlano.setText(planoDeSaude.getTipoDoPlano());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        iconTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tipoDoPlano = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        nomeDoPlano = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        detalhesPlanoDeSaude = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textTipoDoPlano = new javax.swing.JTextField();
        textNomeDaOperadora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Plano de Saúde - Adicionar");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(90, 20, 500, 40);

        iconTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/addPlano64.png"))); // NOI18N
        jPanel1.add(iconTitulo);
        iconTitulo.setBounds(10, 10, 70, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        tipoDoPlano.setText("Tipo do plano:");
        jPanel2.add(tipoDoPlano);
        tipoDoPlano.setBounds(20, 160, 80, 16);

        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(20, 50, 50, 16);

        nomeDoPlano.setText("Nome:");
        jPanel2.add(nomeDoPlano);
        nomeDoPlano.setBounds(20, 100, 50, 16);

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

        detalhesPlanoDeSaude.setText("Detalhes do Plano de Saúde ");
        jPanel2.add(detalhesPlanoDeSaude);
        detalhesPlanoDeSaude.setBounds(20, 10, 150, 16);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 70, 71, 22);

        textTipoDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTipoDoPlanoActionPerformed(evt);
            }
        });
        jPanel2.add(textTipoDoPlano);
        textTipoDoPlano.setBounds(20, 190, 260, 22);

        textNomeDaOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDaOperadoraActionPerformed(evt);
            }
        });
        jPanel2.add(textNomeDaOperadora);
        textNomeDaOperadora.setBounds(20, 120, 260, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 110, 630, 300);

        getAccessibleContext().setAccessibleParent(this);

        setBounds(0, 0, 687, 453);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        //Criar o objeto plano de saúde
        if (tipoOperacao == TipoOperacao.ADCIONAR) {
            gravar();
        } else {
            atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textTipoDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipoDoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTipoDoPlanoActionPerformed

    private void textNomeDaOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDaOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeDaOperadoraActionPerformed
    private void atualizar() {
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());

        if (validarCadastro()) {
            PlanoDeSaudeDAO.atualizar(planoDeSaude);
            JOptionPane.showConfirmDialog(null, "Plado de saúde atualizado com sucesso!",
                    "Plano de saúde",
                    JOptionPane.ERROR_MESSAGE);
            dispose();
        }
    }

    private void gravar() {
        // criar um objeto plano de saude
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());

        if (validarCadastro()) {
            PlanoDeSaudeDAO.gravar(planoDeSaude);

            dispose();
        }
    }

    private boolean validarCadastro() {
        if (textNomeDaOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor preencha o nome da operadora!", "Plano De Saúde", JOptionPane.ERROR_MESSAGE);

            textNomeDaOperadora.requestFocus();
            return false;
        }

        if (textTipoDoPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor preencha o Tipo do Plano! ", "Plano De Saúde", JOptionPane.ERROR_MESSAGE);

            textTipoDoPlano.requestFocus();
            return false;

        }
        return true;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel detalhesPlanoDeSaude;
    private javax.swing.JLabel iconTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel nomeDoPlano;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textNomeDaOperadora;
    private javax.swing.JTextField textTipoDoPlano;
    private javax.swing.JLabel tipoDoPlano;
    // End of variables declaration//GEN-END:variables
}
