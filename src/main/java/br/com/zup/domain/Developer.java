package br.com.zup.domain;

import br.com.zup.domain.enums.LinguagemDeProgramacao;

import java.time.LocalDate;

public class Developer extends Funcionario {
    private LinguagemDeProgramacao linguagemDeProgramacao;

    public Developer(String nome, String sobrenome, LocalDate dataNascimento, LocalDate dataAdmissao, Endereco endereco, Unidade unidade, LinguagemDeProgramacao linguagemDeProgramacao) {

        super.setNome(nome);
        super.setSobrenome(sobrenome);
        super.setDataNascimento(dataNascimento);
        super.setDataAdmissao(dataAdmissao);
        super.setEndereco(endereco);
        super.setUnidade(unidade);
        this.linguagemDeProgramacao = linguagemDeProgramacao;


    }

    public LinguagemDeProgramacao getLinguagemDeProgramacao() {
        return linguagemDeProgramacao;
    }

    public void setLinguagemDeProgramacao(LinguagemDeProgramacao linguagemDeProgramacao) {
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    @Override

    public String toString() {
        return super.toString() +
                "linguagemdeprogramacao=" + linguagemDeProgramacao + "\n" +
                "tipodefuncionario=" + this.getClass().getSimpleName();

    }
}
