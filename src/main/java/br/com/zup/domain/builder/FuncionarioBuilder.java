package br.com.zup.domain.builder;
import br.com.zup.domain.Endereco;
import br.com.zup.domain.Funcionario;
import br.com.zup.domain.Unidade;
import br.com.zup.domain.enums.Cidade;
import br.com.zup.domain.enums.Estado;
import br.com.zup.utils.DataUtils;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioBuilder {

    private Funcionario funcionario;
    private static FuncionarioBuilder uniqueInstance = new FuncionarioBuilder();

    public FuncionarioBuilder() {

    }
    public FuncionarioBuilder funcionario(String nome, String sobrenome, LocalDate dataNascimento, LocalDate dataAdmissao, Endereco endereco, Unidade unidade) {
        this.funcionario = new Funcionario(nome, sobrenome, dataNascimento, dataAdmissao, endereco, unidade);
        unidade.getFuncionarios().add(this.funcionario);
        return this;
    }

    public Funcionario build() {
        return this.funcionario;
    }

    public List<Funcionario> buildFuncionarios(List<Unidade> unidades) {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Endereco enderecoFuncionario1 = EnderecoBuilder.getInstance()
                .endereco("Rua Doutor João Batista de Lacerda,Numero 402,Bairro Mooca, Complemento Casa", Cidade.SAO_PAULO,
                        Estado.SAO_PAULO, "Cep 03177010")
                .build();
        Unidade unidade1 = unidades.get(0);
        Funcionario funcionario1 = FuncionarioBuilder.getInstance().funcionario("João", "Alves", DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario1, unidade1).build();
        funcionarios.add(funcionario1);

        Endereco enderecoFuncionario2 = EnderecoBuilder.getInstance()
                .endereco("Rua Ouro Preto,Numero 1112,Bairro Santo Agostinho, Complemento 2° Andar",
                        Cidade.BELO_HORIZONTE, Estado.MINAS_GERAIS, "Cep 03940120")
                .build();
        Unidade unidade2 = unidades.get(1);
        Funcionario funcionario2 = FuncionarioBuilder.getInstance().funcionario("Mauricio", "Oliveira", DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario2, unidade2).build();
        funcionarios.add(funcionario2);

        Endereco enderecoFuncionario3 = EnderecoBuilder.getInstance()
                .endereco("Avenida Bélgica,Numero 1220,Bairro Sabiá, Complemento Casa",
                        Cidade.UBERLANDIA, Estado.MINAS_GERAIS, "Cep 04561301")
                .build();
        Unidade unidade3 = unidades.get(2);
        Funcionario funcionario3 = FuncionarioBuilder.getInstance().funcionario("Francisco", "Guedes", DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario3, unidade3).build();
        funcionarios.add(funcionario3);

        Endereco enderecoFuncionario4 = EnderecoBuilder.getInstance()
                .endereco("Rua Francisco Teodoro,Numero 72,Bairro Barão Geraldo, Complemento Casa",
                        Cidade.CAMPINAS, Estado.SAO_PAULO, "Cep 8301020")
                .build();
        Unidade unidade4 = unidades.get(3);
        Funcionario funcionario4 = FuncionarioBuilder.getInstance().funcionario("Caio", "Marcos", DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario4, unidade4).build();
        funcionarios.add(funcionario4);

        Endereco enderecoFuncionario5 = EnderecoBuilder.getInstance()
                .endereco("Rua Pascua Vale,Numero 266,Bairro Vila Nova, Complemento Casa",
                        Cidade.SAO_JOSE_DO_RIO_PRETO, Estado.SAO_PAULO, "Cep 1578010")
                .build();
        Unidade unidade5 = unidades.get(4);
        Funcionario funcionario5 = FuncionarioBuilder.getInstance().funcionario("Roberto", "Onofrio", DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario5, unidade5).build();
        funcionarios.add(funcionario5);

        Endereco enderecoFuncionario6 = EnderecoBuilder.getInstance()
                .endereco("Rua América,Numero 52,Bairro Blumenau, Complemento Casa",
                        Cidade.JOINVILLE, Estado.SANTA_CATARINA, "Cep 01397940")
                .build();
        Unidade unidade6 = unidades.get(5);
        Funcionario funcionario6 = FuncionarioBuilder.getInstance().funcionario("Vitor", "Salles", DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario6, unidade6).build();
        funcionarios.add(funcionario6);

        return funcionarios;

    }


    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public static FuncionarioBuilder getInstance() {
        return uniqueInstance;
    }
}
