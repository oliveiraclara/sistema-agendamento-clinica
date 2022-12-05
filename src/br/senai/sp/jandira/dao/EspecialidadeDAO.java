package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    private static final String CAMINHO = "C:\\Users\\22282080\\JavaProject\\especialidade.txt";
    private static final Path PATH = Paths.get(CAMINHO);
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282080\\JavaProject\\especialidade_temp.txt";
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public EspecialidadeDAO() {

    }

    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidades.add(especialidade);
    }

    public static void gravar(Especialidade especialidade) {
        try {
            especialidades.add(especialidade);

            BufferedWriter bufferEscrita = Files.newBufferedWriter(PATH, StandardOpenOption.APPEND, StandardOpenOption.WRITE);

            bufferEscrita.write(especialidade.getEspecialidadeSeparadoPontoVirgula());
            bufferEscrita.newLine();
            bufferEscrita.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "O arquivo não existe");
        }

    }

    public static boolean excluir(Integer codigo) {

        for (Especialidade especialidade : especialidades) {
            if (especialidade.getCodigo().equals(codigo)) {
                especialidades.remove(especialidade);
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

            for (Especialidade especialidade : especialidades) {
                bufferEscritaTemp.write(especialidade.getEspecialidadeSeparadoPontoVirgula());
                bufferEscritaTemp.newLine();
            }

            bufferEscritaTemp.close();

            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao criar o arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static Especialidade getEspecialidade(Integer codigo) {

        for (Especialidade especialidade : especialidades) {
            if (especialidade.getCodigo().equals(codigo)) {
                return especialidade;
            }
        }
        return null;
    }

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidade.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidade);
                break;
            }
        }
        atualizarArquivo();
    }

    public static ArrayList<Especialidade> listarTodos() {
        return especialidades;
    }

    public static void getEspecialidades() {

        try {

            BufferedReader bufferReader = Files.newBufferedReader(PATH);

            String linha = "";
            linha = bufferReader.readLine();

            while (linha != null && !linha.isEmpty()) {

                String[] linhaVetor = linha.split(";");

                especialidades.add(new Especialidade(Integer.valueOf(linhaVetor[0]), linhaVetor[1], linhaVetor[2]));

                linha = bufferReader.readLine();
            }

            bufferReader.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "O arquivo não existe");
        }

    }

    public static ArrayList<String> getNomesEspecialidades() {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        ArrayList<String> dados = new ArrayList<>();

        for (Especialidade especialidade : especialidades) {
            dados.add(especialidade.getNome());
        }

        listModel.addAll(dados);

        return dados;

    }

    public static DefaultTableModel getTableModel() {

        Object[][] dados = new Object[especialidades.size()][3];

        int i = 0;
        for (Especialidade especialidade : especialidades) {
            dados[i][0] = especialidade.getCodigo();
            dados[i][1] = especialidade.getNome();
            dados[i][2] = especialidade.getDescricao();
            i++;
        }

        String[] titulos = {"Código", "Nome da especialidade", "Descrição"};

        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }
}
