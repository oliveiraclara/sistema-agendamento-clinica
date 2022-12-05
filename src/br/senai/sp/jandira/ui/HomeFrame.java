package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JButton;
import br.senai.sp.jandira.dao.MedicoDAO;

public class HomeFrame extends javax.swing.JFrame {
private PlanoDeSaudePanel planosDeSaudePanel;
    private EspecialidadesPanel especialidadePanel;
    private MedicoPanel medicoPanel;

    private final int POSICAO_X = 10;
    private final int POSICAO_Y = 180;
    private final int POSICAO_LARGURA = 945;
    private final int POSICAO_ALTURA = 370;

    public HomeFrame() {
        initComponents();
        URL caminhoIcone = getClass().getResource("/br/senai/sp/jandira/imagens/icon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        PlanoDeSaudeDAO.getListaPlanosDeSaude();
        EspecialidadeDAO.getEspecialidades();
        initPanels();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonAgenda1 = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 740, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agendaa.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/exit32_1.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do sistema");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(875, 100, 80, 60);

        buttonHome.setBackground(new java.awt.Color(255, 102, 102));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/home.png"))); // NOI18N
        buttonHome.setToolTipText("Voltar pra página inicial");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 100, 80, 60);

        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/health-card.png"))); // NOI18N
        buttonPlanosDeSaude.setToolTipText("Planos de saúde");
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(460, 100, 80, 60);

        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/especialidades32_1.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(370, 100, 80, 60);

        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sick322.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(190, 100, 80, 60);

        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/doctor32_1.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(280, 100, 80, 60);

        buttonAgenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda32_1.png"))); // NOI18N
        buttonAgenda1.setToolTipText("Agenda");
        getContentPane().add(buttonAgenda1);
        buttonAgenda1.setBounds(100, 100, 80, 60);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Dados para contato:");
        panelHome.add(jLabel3);
        jLabel3.setBounds(40, 180, 280, 40);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("SISACON");
        panelHome.add(jLabel4);
        jLabel4.setBounds(40, 60, 220, 40);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Sistema para agendamento de consultas");
        panelHome.add(jLabel5);
        jLabel5.setBounds(40, 100, 280, 40);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("www.sisacom.com.br");
        panelHome.add(jLabel6);
        jLabel6.setBounds(40, 250, 280, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("E-mail: suporte@sisacon.com.br");
        panelHome.add(jLabel7);
        jLabel7.setBounds(40, 210, 280, 30);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Telefone: (11) 1234-5678");
        panelHome.add(jLabel8);
        jLabel8.setBounds(40, 230, 280, 30);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setForeground(new java.awt.Color(204, 204, 0));
        jPanel2.setLayout(null);
        panelHome.add(jPanel2);
        jPanel2.setBounds(10, 150, 920, 10);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 180, 945, 370);

        setBounds(0, 0, 983, 603);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed

        planosDeSaudePanel.setVisible(false);
        especialidadePanel.setVisible(false);
        panelHome.setVisible(true);
        mudarCorDoButton();
        buttonHome.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed
        panelHome.setVisible(false);
        medicoPanel.setVisible(false);
        planosDeSaudePanel.setVisible(true);
        mudarCorDoButton();
        buttonPlanosDeSaude.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        especialidadePanel.setVisible(true);
        panelHome.setVisible(false);
        medicoPanel.setVisible(false);
        planosDeSaudePanel.setVisible(false);
        mudarCorDoButton();
        buttonEspecialidades.setBackground(new java.awt.Color(255,102,102));
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed

    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        medicoPanel.setVisible(true);
        panelHome.setVisible(false);
        planosDeSaudePanel.setVisible(false);
        especialidadePanel.setVisible(false);
        mudarCorDoButton();
        buttonMedicos.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_buttonMedicosActionPerformed
    public void ultimoButton() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda1;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

   private void initPanels() {

        planosDeSaudePanel = new PlanoDeSaudePanel();
        planosDeSaudePanel.setBounds(
                POSICAO_X, POSICAO_Y,
                POSICAO_LARGURA, POSICAO_ALTURA);
        getContentPane().add(planosDeSaudePanel);
        planosDeSaudePanel.setVisible(false);

        especialidadePanel = new EspecialidadesPanel();
        especialidadePanel.setBounds(
                POSICAO_X, POSICAO_Y,
                POSICAO_LARGURA, POSICAO_ALTURA);
        getContentPane().add(especialidadePanel);
        
        medicoPanel = new MedicoPanel();
        medicoPanel.setBounds(POSICAO_X, 
                POSICAO_Y, 
                POSICAO_LARGURA, POSICAO_ALTURA);
        getContentPane().add(medicoPanel);
        
    }

    private void mudarCorDoButton() {
        buttonHome.setBackground(new java.awt.Color(255, 255, 255));
        buttonPlanosDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        buttonEspecialidades.setBackground(new java.awt.Color(255, 255, 255));
        buttonMedicos.setBackground(new java.awt.Color(255, 255, 255));
    }
}
