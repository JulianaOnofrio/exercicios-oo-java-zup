package br.com.zup.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Unidade {
    private String nomeUnidade;
    private Endereco endereco;
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Unidade(){
        super();
    }

    public Unidade(String nomeUnidade, Endereco endereco, List<Funcionario> funcionarios) {
        super();
        this.nomeUnidade = nomeUnidade;
        this.endereco = endereco;
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Unidade{" +
                "nomeUnidade='" + nomeUnidade + '\'' +
                ", endereco=" + endereco +
                ", funcionarios=" + funcionarios +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unidade unidade = (Unidade) o;
        return Objects.equals(nomeUnidade, unidade.nomeUnidade) &&
                Objects.equals(endereco, unidade.endereco) &&
                Objects.equals(funcionarios, unidade.funcionarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeUnidade, endereco, funcionarios);
    }

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
















