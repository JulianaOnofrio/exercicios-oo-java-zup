package br.com.zup.domain;

import java.time.LocalDate;
import java.util.List;

public class QA extends Funcionario {

    public QA(String nome, String sobrenome, LocalDate dataNascimento, LocalDate dataAdmissao, Endereco endereco, Unidade unidade, List<Beneficio> beneficios) {

        super.setNome(nome);
        super.setSobrenome(sobrenome);
        super.setDataNascimento(dataNascimento);
        super.setDataAdmissao(dataAdmissao);
        super.setEndereco(endereco);
        super.setUnidade(unidade);
        super.setBeneficios(beneficios);

    }

    @Override
    public String toString() {
        return
                super.toString() +
                        "\ttipoFuncionario="+this.getClass().getSimpleName()+"\n"+
                        "}\n"+
                        "---------------------------------------------------------\n";
    }
}