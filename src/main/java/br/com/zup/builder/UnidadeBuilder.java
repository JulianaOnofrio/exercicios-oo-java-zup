package br.com.zup.builder;

import br.com.zup.domain.Endereco;
import br.com.zup.domain.Unidade;

public class UnidadeBuilder {

    private Unidade unidade = new Unidade();
    private static UnidadeBuilder uniqueInstance = new UnidadeBuilder();


    public UnidadeBuilder nome(String nome) {
        this.unidade.setNomeUnidade(nome);
        return this;
    }

    public UnidadeBuilder endereco(Endereco endereco) {
        this.unidade.setEndereco(endereco);
        return this;
    }

    private UnidadeBuilder() {
        super();
    }

    public static UnidadeBuilder getInstance() {
        return uniqueInstance;
    }

    public UnidadeBuilder unidade(String nomeUnidade, Endereco endereco) {
        this.unidade = new Unidade(nomeUnidade, endereco);
        return this;
    }

    public Unidade build() {
        return unidade;
    }

}
