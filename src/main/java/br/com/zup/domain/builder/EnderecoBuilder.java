package br.com.zup.domain.builder;
import br.com.zup.domain.Endereco;
import br.com.zup.domain.enums.Cidade;
import br.com.zup.domain.enums.Estado;

public class EnderecoBuilder {

    private Endereco endereco;
    private static EnderecoBuilder uniqueInstance = new EnderecoBuilder();

    public EnderecoBuilder() {
        super();
    }

    public static EnderecoBuilder getInstance() {
        return uniqueInstance;
    }

    public EnderecoBuilder endereco(String logradouro, Cidade cidade, Estado estado, String cep) {
        this.endereco = new Endereco(logradouro, cidade, estado, cep);
        return this;
    }

    public Endereco build() {
        return this.endereco;
    }


}