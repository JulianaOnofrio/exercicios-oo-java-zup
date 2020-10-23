package br.com.zup.builder;

import br.com.zup.domain.Endereco;
import br.com.zup.domain.enums.Cidade;
import br.com.zup.domain.enums.Estado;

public class EnderecoBuilder {

    private Endereco endereco = new Endereco();

    private static EnderecoBuilder uniqueInstance = new EnderecoBuilder();

    private EnderecoBuilder() {
        super();
    }

    public static EnderecoBuilder getInstance() {
        return new EnderecoBuilder();
    }

    public EnderecoBuilder logradouro(String logradouro) {
        this.endereco.setLogradouro(logradouro);
        return this;
    }

    public EnderecoBuilder cidade(Cidade cidade) {
        this.endereco.setCidade(cidade);
        return this;
    }

    public EnderecoBuilder estado(Estado estado) {
        this.endereco.setEstado(estado);
        return this;
    }

    public EnderecoBuilder cep(String cep) {
        this.endereco.setCep(cep);
        return this;
    }


    public Endereco build() {
        return endereco;
    }
}

