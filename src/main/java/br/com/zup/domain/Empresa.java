package br.com.zup.domain;

import java.time.LocalDate;
import java.util.List;

public class Empresa {
    private String nomeFantasia;
    private LocalDate dataAbertura;
    private List<Funcionario> funcionarios;
    private List<Unidade> unidades;

public Empresa() {
    super();

}
    public Empresa(String nomeFantasia, LocalDate dataAbertura, List<Funcionario> funcionarios,List<Unidade> unidades) {
        super();
        this.nomeFantasia = nomeFantasia;
        this.dataAbertura = dataAbertura;
        this.funcionarios = funcionarios;
        this.unidades = unidades;

    }


    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Unidade> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<Unidade> unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nomeFantasia='" + nomeFantasia + '\'' +
                ", dataAbertura=" + dataAbertura +
                ", funcionarios=" + funcionarios +
                ", unidades=" + unidades +
                '}';
    }
}
