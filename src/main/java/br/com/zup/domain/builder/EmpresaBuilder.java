package br.com.zup.domain.builder;

import br.com.zup.domain.Empresa;
import br.com.zup.domain.Endereco;
import br.com.zup.domain.Funcionario;
import br.com.zup.domain.Unidade;
import br.com.zup.domain.enums.Cidade;
import br.com.zup.domain.enums.Estado;
import br.com.zup.utils.DataUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpresaBuilder {

    private static Empresa empresa;


    public Empresa getEmpresa() {
        return empresa;
    }

   public EmpresaBuilder() {

        empresa = new Empresa();
        empresa.setNomeFantasia("ZUP INNOVATION");
        this.build();
    }

    public void build() {

        empresa.setDataAbertura(LocalDate.of(2000, 10, 10));
        empresa.setUnidades(this.buildUnidades());
        empresa.setFuncionarios(this.buildFuncionarios());
    }

    public List<Unidade> buildUnidades() {
        List<Unidade> unidades = new ArrayList<Unidade>();


        Unidade unidade1 = new Unidade();
        unidade1.setNomeUnidade("São Paulo");
        unidade1.setEndereco(new Endereco("Rua Pascoal dias,Numero 525,Bairro Vila Cordeiro, Complemento Ed RM Square", Cidade.SAO_PAULO, Estado.SAO_PAULO, "Cep 04581060"));

        Unidade unidade2 = new Unidade();
        unidade2.setNomeUnidade("Belo Horizonte");
        unidade2.setEndereco(new Endereco("Rua Paraíba,Numero 330,Bairro Funcionários, Complemento 21°Andar", Cidade.BELO_HORIZONTE, Estado.MINAS_GERAIS, "Cep 30130140"));

        Unidade unidade3 = new Unidade();
        unidade3.setNomeUnidade("Uberlândia");
        unidade3.setEndereco(new Endereco("Avenida Rondon Pacheco,Numero 4600,Bairro Tibery, Complemento 7° e 8° andar", Cidade.UBERLANDIA, Estado.MINAS_GERAIS, "Cep 38405142"));

        Unidade unidade4 = new Unidade();
        unidade4.setNomeUnidade("Campinas");
        unidade4.setEndereco(new Endereco("Avenida José Rocha Bomfim,Numero 214,Bairro Jardim Santa Genebra, Complemento Bloco Moscou Cond. Praça Capital", Cidade.CAMPINAS, Estado.SAO_PAULO, "Cep 13080650"));

        Unidade unidade5 = new Unidade();
        unidade5.setNomeUnidade("São José do Rio Preto");
        unidade5.setEndereco(new Endereco("Rua Jaír Martins Mil Homens,Numero 500,Bairro Nova Redentora, Complemento 9°Andar", Cidade.SAO_JOSE_DO_RIO_PRETO, Estado.SAO_PAULO, "Cep 15080310"));

        Unidade unidade6 = new Unidade();
        unidade6.setNomeUnidade("Santa Catarina");
        unidade6.setEndereco(new Endereco("Rua Doutor João Colin,Numero 1285,Bairro América, Complemento Salas 19 e 21", Cidade.JOINVILLE, Estado.SANTA_CATARINA, "Cep 89201010"));


        unidades.add(unidade1);
        unidades.add(unidade2);
        unidades.add(unidade3);
        unidades.add(unidade4);
        unidades.add(unidade5);
        unidades.add(unidade6);

        return unidades;
    }


    public List<Funcionario> buildFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();


        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("João");
        funcionario1.setSobrenome("Alves");
        funcionario1.setDataNascimento(LocalDate.of(1991, 04, 21));
        funcionario1.setDataAdmissao(DataUtils.geraDataAdmissao());
        funcionario1.setEndereco(new Endereco("Rua Doutor João Batista de Lacerda,Numero 402,Bairro Mooca, Complemento Casa", Cidade.SAO_PAULO, Estado.SAO_PAULO, "Cep 03177010"));

        Unidade unidade1 = empresa.getUnidades().get(0);
        funcionario1.setUnidade(unidade1);
        unidade1.getFuncionarios().add(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Mauricio");
        funcionario2.setSobrenome("Oliveira");
        funcionario2.setDataNascimento(LocalDate.of(1991, 12, 10));
        funcionario2.setDataAdmissao(LocalDate.of(2018, 10, 14));
        funcionario2.setEndereco(new Endereco("Rua Ouro Preto,Numero 1112,Bairro Santo Agostinho, Complemento 2° Andar", Cidade.BELO_HORIZONTE, Estado.MINAS_GERAIS, "Cep 03940120"));

        Unidade unidade2 = empresa.getUnidades().get(1);
        funcionario2.setUnidade(unidade2);
        unidade2.getFuncionarios().add(funcionario2);

        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Francisco");
        funcionario3.setSobrenome("Guedes");
        funcionario3.setDataNascimento(LocalDate.of(1991, 11, 19));
        funcionario3.setDataAdmissao(LocalDate.of(2019, 10, 10));
        funcionario3.setEndereco(new Endereco("Avenida Bélgica,Numero 1220,Bairro Sabiá, Complemento Casa", Cidade.UBERLANDIA, Estado.MINAS_GERAIS, "Cep 04561301"));

        Unidade unidade3 = empresa.getUnidades().get(2);
        funcionario3.setUnidade(unidade3);
        unidade3.getFuncionarios().add(funcionario3);

        Funcionario funcionario4 = new Funcionario();
        funcionario4.setNome("Caio");
        funcionario4.setSobrenome("Marcos");
        funcionario4.setDataNascimento(LocalDate.of(2020, 11, 13));
        funcionario4.setDataAdmissao(LocalDate.of(2020, 11, 10));
        funcionario4.setEndereco(new Endereco("Rua Francisco Teodoro,Numero 72,Bairro Barão Geraldo, Complemento Casa", Cidade.CAMPINAS, Estado.SAO_PAULO, "Cep 8301020"));

        Unidade unidade4 = empresa.getUnidades().get(3);
        funcionario4.setUnidade(unidade4);
        unidade4.getFuncionarios().add(funcionario4);

        Funcionario funcionario5 = new Funcionario();
        funcionario5.setNome("Roberto");
        funcionario3.setSobrenome("Onofrio");
        funcionario3.setDataNascimento(LocalDate.of(2017, 11, 13));
        funcionario3.setDataAdmissao(LocalDate.of(2016, 12, 15));
        funcionario5.setEndereco(new Endereco("Rua Pascua Vale,Numero 266,Bairro Vila Nova, Complemento Casa", Cidade.SAO_JOSE_DO_RIO_PRETO, Estado.SAO_PAULO, "Cep 1578010"));

        Unidade unidade5 = empresa.getUnidades().get(4);
        funcionario5.setUnidade(unidade4);
        unidade5.getFuncionarios().add(funcionario5);

        Funcionario funcionario6 = new Funcionario();
        funcionario6.setNome("Lucas");
        funcionario6.setSobrenome("Vendrame");
        funcionario6.setDataNascimento(LocalDate.of(2017, 11, 18));
        funcionario6.setDataAdmissao(LocalDate.of(2019, 12, 14));
        funcionario6.setEndereco(new Endereco("Rua América,Numero 52,Bairro Blumenau, Complemento Casa", Cidade.JOINVILLE, Estado.SANTA_CATARINA, "Cep 01397940"));

        Unidade unidade6 = empresa.getUnidades().get(5);
        funcionario6.setUnidade(unidade5);
        unidade6.getFuncionarios().add(funcionario6);

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);
        funcionarios.add(funcionario6);

        return funcionarios;

    }

    private static EmpresaBuilder uniqueInstance = new EmpresaBuilder();

    public static EmpresaBuilder getInstance() {
        return uniqueInstance;
    }
}

