package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList<>();
    private Especialidade especialidade;
    private ArrayList<Especialidade> especialidades;

    private static final String CAMINHO = "C:\\Users\\22282080\\JavaProject\\medico.txt";
    private static final Path PATH = Paths.get(CAMINHO);
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282080\\JavaProject\\medico_temp.txt";
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    private static final int QUANTIDADE_INDICES_ARQUIVO_PADRAO = 6;

    public MedicoDAO(Medico medico) {
        this.medicos.add(medico);
    }

    public MedicoDAO() {

    }

    public static void gravar(Medico medico) {
        try {
            medicos.add(medico);

            BufferedWriter bufferEscrita = Files.newBufferedWriter(PATH, StandardOpenOption.APPEND, StandardOpenOption.WRITE);

            bufferEscrita.write(medico.getMedicoSeparadoPontoVirgula());
            bufferEscrita.newLine();
            bufferEscrita.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "O arquivo não existe");
        }

    }

    public static boolean excluir(Integer codigo) {

        for (Medico medico : medicos) {
            if (medico.getCodigo().equals(codigo)) {
                medicos.remove(medico);

                break;
            }
        }
        atualizarArquivo();

        return false;
    }

    public static void atualizarArquivo() {
        File arquivoAtual = new File(CAMINHO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bufferEscritaTemp = Files.newBufferedWriter(PATH_TEMP, StandardOpenOption.APPEND, StandardOpenOption.WRITE);

            for (Medico medico : medicos) {
                bufferEscritaTemp.write(medico.getMedicoSeparadoPontoVirgula());
                bufferEscritaTemp.newLine();
            }

            bufferEscritaTemp.close();

            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao criar o arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void atualizar(Medico medico) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medico.getCodigo())) {
                medicos.set(medicos.indexOf(m), medico);
                break;
            }
            atualizarArquivo();
        }
    }

    public static ArrayList<Medico> listarTodos() {
        return medicos;
    }

    public static Medico getMedico(Integer codigo) {

        for (Medico medico : medicos) {
            if (medico.getCodigo().equals(codigo)) {
                return medico;
            }
        }
        return null;
    }

    public static void getMedicos() {

        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = "";

            linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {

                String[] linhaVetor = linha.split(";");

                ArrayList<Especialidade> especialidades = new ArrayList<>();
                int i = 0;

                while (i + QUANTIDADE_INDICES_ARQUIVO_PADRAO < linhaVetor.length) {
                    especialidades.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(linhaVetor[QUANTIDADE_INDICES_ARQUIVO_PADRAO + i])));
                    i++;
                }

                Medico medico = new Medico(Integer.valueOf(linhaVetor[0]), linhaVetor[1], linhaVetor[2], linhaVetor[3], linhaVetor[4], linhaVetor[5], especialidades);

                medicos.add(medico);
                linha = br.readLine();
            }

            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquvo");
        }

    }

    public static DefaultTableModel getTableModel() {

        Object[][] dados = new Object[medicos.size()][3];

        int i = 0;
        for (Medico medico : medicos) {
            dados[i][0] = medico.getCodigo();
            dados[i][1] = medico.getCrm();
            dados[i][2] = medico.getNome();
            i++;
        }

        String[] titulos = {"Código", "CRM", "Nome do Médico"};

        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }

}
