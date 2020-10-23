package br.com.zup.domain;

import br.com.zup.domain.enums.LinguagemDeProgramacao;

public class Developer extends Funcionario {
    private LinguagemDeProgramacao linguagemDeProgramacao;

    public Developer(LinguagemDeProgramacao linguagemDeProgramacao) {
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
        return
                super.toString() +
                        "\tlinguagemProgramacao="+linguagemDeProgramacao+",\n"+
                        "\ttipoFuncionario="+this.getClass().getSimpleName()+"\n"+
                        "}\n"+
                        "---------------------------------------------------------\n";
    }

    @Override
    public String demonstrarHabilidade() {
        return "Eu sei codar";
    }
}
