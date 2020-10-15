package br.com.zup.domain.builder;

import br.com.zup.domain.Endereco;
import br.com.zup.domain.Unidade;
import br.com.zup.domain.enums.Cidade;
import br.com.zup.domain.enums.Estado;

import java.util.ArrayList;
import java.util.List;

public class UnidadeBuilder {

    private Unidade unidade;
    private static UnidadeBuilder uniqueInstance = new UnidadeBuilder();

    public UnidadeBuilder() {
        super();
    }

    public UnidadeBuilder unidade(String nomeUnidade, Endereco endereco) {
        this.unidade = new Unidade(nomeUnidade, endereco);
        return this;
    }

    public Unidade build() {
        return this.unidade;
    }

    public List<Unidade> buildUnidades() {
        List<Unidade> unidades = new ArrayList<Unidade>();

        Endereco enderecoUnidade1 = EnderecoBuilder.getInstance()
                .endereco("Rua Pascoal dias,Numero 525,Bairro Vila Cordeiro, Complemento Ed RM Square",
                        Cidade.SAO_PAULO, Estado.SAO_PAULO, "04581060")
                .build();
        Unidade unidade1 = UnidadeBuilder.getInstance().unidade("São Paulo", enderecoUnidade1).build();
        unidades.add(unidade1);

        Endereco enderecoUnidade2 = EnderecoBuilder.getInstance()
                .endereco("Rua Paraíba,Numero 330,Bairro Funcionários, Complemento 21°Andar",
                        Cidade.BELO_HORIZONTE, Estado.MINAS_GERAIS, "30130140")
                .build();
        Unidade unidade2 = UnidadeBuilder.getInstance().unidade("Belo Horizonte", enderecoUnidade2).build();
        unidades.add(unidade2);

        Endereco enderecoUnidade3 = EnderecoBuilder.getInstance()
                .endereco("Avenida Rondon Pacheco,Numero 4600,Bairro Tibery, Complemento 7° e 8° andar",
                        Cidade.UBERLANDIA, Estado.MINAS_GERAIS, "38405142")
                .build();
        Unidade unidade3 = UnidadeBuilder.getInstance().unidade("Uberlândia", enderecoUnidade3).build();
        unidades.add(unidade3);

        Endereco enderecoUnidade4 = EnderecoBuilder.getInstance()
                .endereco("Avenida José Rocha Bomfim,Numero 214,Bairro Jardim Santa Genebra, Complemento Bloco Moscou Cond. Praça Capital",
                        Cidade.CAMPINAS, Estado.SAO_PAULO, "13080650")
                .build();
        Unidade unidade4 = UnidadeBuilder.getInstance().unidade("Campinas", enderecoUnidade4).build();
        unidades.add(unidade4);

        Endereco enderecoUnidade5 = EnderecoBuilder.getInstance()
                .endereco("Rua Jaír Martins Mil Homens,Numero 500,Bairro Nova Redentora, Complemento 9°Andar",
                        Cidade.SAO_JOSE_DO_RIO_PRETO, Estado.SAO_PAULO, "15080310")
                .build();
        Unidade unidade5 = UnidadeBuilder.getInstance().unidade("São José do Rio Preto", enderecoUnidade5).build();
        unidades.add(unidade5);

        Endereco enderecoUnidade6 = EnderecoBuilder.getInstance()
                .endereco("Rua Doutor João Colin,Numero 1285,Bairro América, Complemento Salas 19 e 21",
                        Cidade.JOINVILLE, Estado.SANTA_CATARINA, "89201010")
                .build();
        Unidade unidade6 = UnidadeBuilder.getInstance().unidade("Santa Catarina", enderecoUnidade6).build();
        unidades.add(unidade6);

        return unidades;
    }

    public static UnidadeBuilder getInstance() {
        return uniqueInstance;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

}
