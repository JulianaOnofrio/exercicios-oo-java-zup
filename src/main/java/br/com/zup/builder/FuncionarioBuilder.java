package br.com.zup.builder;

import br.com.zup.domain.*;
import br.com.zup.utils.GerarInteiroAleatorioUtils;
import br.com.zup.utils.GerarLinguagemAleatoriaUtils;

import java.time.LocalDate;
import java.util.List;

public class FuncionarioBuilder {

    private Funcionario funcionario;
    private static FuncionarioBuilder uniqueInstance = new FuncionarioBuilder();

    private FuncionarioBuilder() {

    }

    public FuncionarioBuilder nome(String nome) {
        this.funcionario.setNome(nome);
        return this;
    }

    public FuncionarioBuilder sobrenome(String sobrenome) {
        this.funcionario.setSobrenome(sobrenome);
        return this;
    }

    public FuncionarioBuilder dataNascimento(LocalDate dataNascimento) {
        this.funcionario.setDataNascimento(dataNascimento);
        return this;
    }

    public FuncionarioBuilder dataAdmissao(LocalDate dataAdmissao) {
        this.funcionario.setDataAdmissao(dataAdmissao);
        return this;
    }

    public FuncionarioBuilder endereco(Endereco endereco) {
        this.funcionario.setEndereco(endereco);
        return this;
    }

    public FuncionarioBuilder unidade(Unidade unidade) {
        this.funcionario.setUnidade(unidade);
        return this;
    }

    public FuncionarioBuilder beneficios(List<Beneficio> beneficios) {
        this.funcionario.setBeneficios(beneficios);
        return this;
    }

    public static FuncionarioBuilder getInstance() {
        return uniqueInstance;
    }

    public FuncionarioBuilder qa() {
        this.funcionario = new QA();
        return this;
    }

    public FuncionarioBuilder developer() {
        this.funcionario = new Developer(GerarLinguagemAleatoriaUtils.gerarLinguagemAleatoria());
        return this;
    }

    public FuncionarioBuilder random() {
        if (GerarInteiroAleatorioUtils.gerarInteiro(5) % 2 == 0) {
            return developer();
        }
        return qa();
    }

    public Funcionario build() {
        return this.funcionario;
    }

}


