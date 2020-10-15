package br.com.zup.domain;

import java.time.LocalDate;

public class QA extends Funcionario {

    public QA(String nome, String sobrenome, LocalDate dataNascimento, LocalDate dataAdmissao, Endereco endereco, Unidade unidade) {

        super.setNome(nome);
        super.setSobrenome(sobrenome);
        super.setDataNascimento(dataNascimento);
        super.setDataAdmissao(dataAdmissao);
        super.setEndereco(endereco);
        super.setUnidade(unidade);

    }

    @Override

    public String toString() {
        return super.toString() +
                "\ntipodefuncionario=" + this.getClass().getSimpleName();

    }
}