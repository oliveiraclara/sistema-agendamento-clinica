package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Pessoa {

   private String nome;
    private String email;
    private String telefone;
    private String tipoSanguineo;
    private LocalDate dataNascimento;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getDataNascimento() {
        return dataNascimento.format(dateTimeFormatter);
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento, dateTimeFormatter);
    }
}
