package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.util.List;
import javax.swing.ListModel;

public class MedicoDialog extends javax.swing.JDialog {

     private TipoOperacao tipoOperacao;
    private Medico medico;
    private EspecialidadeDAO especialidadeDao;

    private DefaultListModel<String> listaEspecialidades = new DefaultListModel<>();
    private ArrayList<String> especialidades = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesParaAdicionar = EspecialidadeDAO.listarTodos();

    private DefaultListModel<String> listaEspecialidadesMedico = new DefaultListModel<>();
    private ArrayList<String> nomesEspecialidadesMedico = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesAdicionadasAoMedico = new ArrayList<>();

    int linha;

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico
    ) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        atualizarListaEspecialidades();

        if (tipoOperacao == tipoOperacao.ALTERAR) {
            preencherFormulario();
        }

    }

    private void preencherFormulario() {
        textFieldCodigo.setText(medico.getCodigo().toString());
        textCrm.setText(medico.getCrm());
        textNomeDoMedico.setText(medico.getNome());
        textTelefone.setText(medico.getTelefone());
        textEmail.setText(medico.getEmail());
        textDataDeNascimento.setText(medico.getDataNascimento());
        atualizarListaEspecialidades();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollbar1 = new java.awt.Scrollbar();
        jPanel4 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        iconTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        detalhesMedico = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        crm = new javax.swing.JLabel();
        nomeDoMedico = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelDataDeNascimento = new javax.swing.JLabel();
        labelListaDeEspecialidades = new javax.swing.JLabel();
        labelEspecialidadesDosMedicos = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        textEmail = new javax.swing.JTextField();
        textTelefone = new javax.swing.JTextField();
        textFieldCodigo = new javax.swing.JTextField();
        textNomeDoMedico = new javax.swing.JTextField();
        textCrm = new javax.swing.JTextField();
        textDataDeNascimento = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEspecialidadesDosMedicos = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaEspecialidade = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(686, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Médico - Adicionar");
        jPanel4.add(labelTitulo);
        labelTitulo.setBounds(90, 20, 500, 40);

        iconTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/addPlano64.png"))); // NOI18N
        jPanel4.add(iconTitulo);
        iconTitulo.setBounds(10, 10, 70, 70);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 670, 80);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(630, 370));
        jPanel1.setLayout(null);

        detalhesMedico.setText("Detalhes do Médico:");
        jPanel1.add(detalhesMedico);
        detalhesMedico.setBounds(20, 10, 150, 16);

        labelCodigo.setText("Código:");
        jPanel1.add(labelCodigo);
        labelCodigo.setBounds(20, 50, 50, 16);

        crm.setText("CRM:");
        jPanel1.add(crm);
        crm.setBounds(110, 50, 80, 16);

        nomeDoMedico.setText("Nome do(a) Médico(a):");
        jPanel1.add(nomeDoMedico);
        nomeDoMedico.setBounds(240, 50, 140, 16);

        labelTelefone.setText("Telefone:");
        jPanel1.add(labelTelefone);
        labelTelefone.setBounds(20, 110, 120, 16);

        labelEmail.setText("E-mail:");
        jPanel1.add(labelEmail);
        labelEmail.setBounds(160, 110, 50, 16);

        labelDataDeNascimento.setText("Data de Nascimento:");
        jPanel1.add(labelDataDeNascimento);
        labelDataDeNascimento.setBounds(490, 110, 120, 16);

        labelListaDeEspecialidades.setText("Lista de especialidades:");
        jPanel1.add(labelListaDeEspecialidades);
        labelListaDeEspecialidades.setBounds(20, 170, 250, 16);

        labelEspecialidadesDosMedicos.setText("Especialidades dos médicos:");
        jPanel1.add(labelEspecialidadesDosMedicos);
        labelEspecialidadesDosMedicos.setBounds(280, 170, 340, 16);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCancelar);
        buttonCancelar.setBounds(450, 290, 70, 60);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar novo médico");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSalvar);
        buttonSalvar.setBounds(540, 290, 70, 60);

        buttonAdicionar.setToolTipText("Mover especilidade para o médico.");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdicionar);
        buttonAdicionar.setBounds(180, 190, 70, 60);

        buttonRemover.setToolTipText("Excluir especialidade do médico.");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRemover);
        buttonRemover.setBounds(180, 270, 70, 60);

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        jPanel1.add(textEmail);
        textEmail.setBounds(160, 130, 320, 22);

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(textTelefone);
        textTelefone.setBounds(20, 130, 130, 22);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 70, 64, 22);

        textNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(textNomeDoMedico);
        textNomeDoMedico.setBounds(240, 70, 370, 22);
        jPanel1.add(textCrm);
        textCrm.setBounds(110, 70, 110, 22);

        textDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataDeNascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(textDataDeNascimento);
        textDataDeNascimento.setBounds(490, 130, 120, 22);

        listaEspecialidadesDosMedicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaEspecialidadesDosMedicos);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(280, 190, 130, 146);

        listaEspecialidade.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listaEspecialidade);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(20, 190, 130, 146);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 100, 630, 370);

        setBounds(0, 0, 687, 512);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (tipoOperacao == TipoOperacao.ADCIONAR) {
            gravar();
        } else {
            atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        List<String> especialidadesMedico = listaEspecialidade.getSelectedValuesList();
         for (String especialidade : especialidadesMedico) {
        nomesEspecialidadesMedico.add(especialidade);
    }

    for (Especialidade especialidade : especialidadesParaAdicionar) {
        if (especialidadesMedico.contains(especialidade.getNome())) {
            especialidadesAdicionadasAoMedico.add(especialidade);
        }
    }

    listaEspecialidadesMedico.clear();
    listaEspecialidadesMedico.addAll(nomesEspecialidadesMedico);
    listaEspecialidadesDosMedicos.setModel(listaEspecialidadesMedico);

    int[] excluir = listaEspecialidade.getSelectedIndices();
    for (int index : excluir) {
        listaEspecialidades.remove(index);
        especialidades.remove(index);
    }
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
         List<String> especialidadesParaRemover = listaEspecialidadesDosMedicos.getSelectedValuesList();

        for (String especialidade : especialidadesParaRemover) {
            especialidades.add(especialidade);
        }
        for (Especialidade especialidade : especialidadesParaAdicionar) {
            if (especialidadesParaRemover.contains(especialidade.getNome())) {
                especialidadesAdicionadasAoMedico.remove(especialidade);
            }
        }

        listaEspecialidades.clear();
        listaEspecialidades.addAll(especialidades);
        listaEspecialidade.setModel(listaEspecialidades);

        int[] excluir = listaEspecialidadesDosMedicos.getSelectedIndices();
        for (int index : excluir) {
            listaEspecialidadesMedico.remove(index);
            nomesEspecialidadesMedico.remove(index);
        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeDoMedicoActionPerformed

    private void textDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataDeNascimentoActionPerformed

    private void atualizar() {
        medico.setNome(textNomeDoMedico.getText());
        medico.setCrm(textCrm.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setEmail(textEmail.getText());
        medico.setDataNascimento(textDataDeNascimento.getText());
        medico.setEspecialidades(especialidadesAdicionadasAoMedico);
        MedicoDAO.atualizar(medico);

        if (validarCadastro()) {
            MedicoDAO.atualizar(medico);

            JOptionPane.showMessageDialog(null, "Médico atualizado com sucesso", "Médico", JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private void gravar() {
        Medico medico = new Medico();
        medico.setCrm(textCrm.getText());
        medico.setNome(textNomeDoMedico.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setEmail(textEmail.getText());
        medico.setDataNascimento(textDataDeNascimento.getText());
        medico.setEspecialidades(especialidadesAdicionadasAoMedico);
        MedicoDAO.atualizar(medico);

        if (validarCadastro()) {
            MedicoDAO.gravar(medico);
            try {
            medico.setDataNascimento(textDataDeNascimento.getText());
            } catch(Exception exception) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha a data de nascimento do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            textDataDeNascimento.requestFocus();
            }
            JOptionPane.showMessageDialog(this, "Médico gravado com sucesso", "Médico", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

   private boolean validarCadastro() {
        
        System.out.println(textDataDeNascimento.getText().length());

        if (textCrm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o CRM do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            textCrm.requestFocus();
            return false;
        }
        if (textNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o nome do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            textNomeDoMedico.requestFocus();
            return false;
        }
        if (textTelefone.getText().equals("(  )     -    ") == true) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o telefone do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            textTelefone.requestFocus();
            return false;
        }
        if (textEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o E-mail do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            textEmail.requestFocus();
            return false;
        }
        if (textDataDeNascimento.getText().equals("##/##/####") == true) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha a data de nascimento do Médico!", "Médico", JOptionPane.ERROR_MESSAGE);
            textDataDeNascimento.requestFocus();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel crm;
    private javax.swing.JLabel detalhesMedico;
    private javax.swing.JLabel iconTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadesDosMedicos;
    private javax.swing.JLabel labelListaDeEspecialidades;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listaEspecialidade;
    private javax.swing.JList<String> listaEspecialidadesDosMedicos;
    private javax.swing.JLabel nomeDoMedico;
    private java.awt.Scrollbar scrollbar1;
    private javax.swing.JTextField textCrm;
    private javax.swing.JTextField textDataDeNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textNomeDoMedico;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables

    private void atualizarListaEspecialidades() {
        adicionarNomesListEspecialidades();

        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherLists();
        }

    }

    private void adicionarNomesListEspecialidades() {
        especialidades = EspecialidadeDAO.getNomesEspecialidades();
        listaEspecialidades.addAll(especialidades);
        listaEspecialidade.setModel(listaEspecialidades);
    }

    public void preencherLists() {
        especialidadesAdicionadasAoMedico = medico.getEspecialidades();
        nomesEspecialidadesMedico = medico.getEspecialidadesMedico();
        listaEspecialidadesMedico.clear();
        listaEspecialidadesMedico.addAll(nomesEspecialidadesMedico);
        listaEspecialidadesDosMedicos.setModel(listaEspecialidadesMedico);

        int i = 0;
        for (String especialidade : nomesEspecialidadesMedico) {
            if (especialidades.contains(especialidade)) {
                especialidades.remove(especialidade);
            }
        }
        listaEspecialidades.clear();
        listaEspecialidades.addAll(especialidades);
    }
}
