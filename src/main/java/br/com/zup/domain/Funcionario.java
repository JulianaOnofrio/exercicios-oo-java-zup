package br.com.zup.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;


public class Funcionario {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private LocalDate dataAdmissao;
    private Endereco endereco;
    private Unidade unidade;
    private List<Beneficio> beneficios;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String sobrenome, LocalDate dataNascimento, LocalDate dataAdmissao, Endereco endereco, Unidade unidade, List<Beneficio> beneficios) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.endereco = endereco;
        this.unidade = unidade;
        this.beneficios = beneficios;


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public List<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "\nFuncionario{" + "\n" +
                "\tnome=" + nome + "\n" +
                "\tsobrenome=" + sobrenome + ",\n" +
                "\tdataNascimento=" + dataNascimento + ",\n" +
                "\tdataAdmissao=" + dataAdmissao + ",\n" +
                "\tendereco=" + endereco + ",\n" +
                "\tbeneficios=" + beneficios + ",\n" +
                "}\n"+
                "---------------------------------------------------------\n";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome) &&
                Objects.equals(sobrenome, that.sobrenome) &&
                Objects.equals(dataNascimento, that.dataNascimento) &&
                Objects.equals(dataAdmissao, that.dataAdmissao) &&
                Objects.equals(endereco, that.endereco) &&
                Objects.equals(unidade, that.unidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome, dataNascimento, dataAdmissao, endereco, unidade);
    }


}

