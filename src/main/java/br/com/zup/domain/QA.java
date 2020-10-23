package br.com.zup.domain;

public class QA extends Funcionario {

    public QA() {

    }

    @Override
    public String toString() {
        return
                super.toString() +
                        "\ttipoFuncionario="+this.getClass().getSimpleName()+"\n"+
                        "}\n"+
                        "---------------------------------------------------------\n";
    }

    @Override
    public String demonstrarHabilidade() {
        return "Eu sei testar";
    }
}