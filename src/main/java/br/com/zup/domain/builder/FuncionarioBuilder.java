package br.com.zup.domain.builder;

import br.com.zup.domain.*;
import br.com.zup.domain.enums.Cidade;
import br.com.zup.domain.enums.Estado;
import br.com.zup.utils.CepUtils;
import br.com.zup.utils.DataUtils;
import br.com.zup.utils.LogradouroUtils;
import br.com.zup.utils.NomeSobrenomeUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioBuilder {

    private Funcionario funcionario;
    private static FuncionarioBuilder uniqueInstance = new FuncionarioBuilder();

    public FuncionarioBuilder() {

    }

    public FuncionarioBuilder funcionario(String nome, String sobrenome, LocalDate dataNascimento, LocalDate dataAdmissao, Endereco endereco, Unidade unidade, List<Beneficio> beneficios) {
        this.funcionario = new Funcionario(nome, sobrenome, dataNascimento, dataAdmissao, endereco, unidade, beneficios);
        unidade.getFuncionarios().add(this.funcionario);

        return this;
    }

    public Funcionario build() {
        return this.funcionario;
    }

    public List<Funcionario> buildFuncionarios(Empresa empresa) {

        List<Unidade> unidades = empresa.getUnidades();

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();


        Endereco enderecoFuncionario1 = EnderecoBuilder.getInstance()
                .endereco(LogradouroUtils.geraLogradouro(), Cidade.SAO_PAULO,
                        Estado.SAO_PAULO, CepUtils.geraCep())
                .build();
        Unidade unidade1 = unidades.get(0);
        List<Beneficio> beneficios1 = BeneficioBuilder.getInstance().buildBeneficios(enderecoFuncionario1.getEstado());

        Funcionario funcionario1 = FuncionarioBuilder.getInstance().funcionario(NomeSobrenomeUtils.geraNome(), NomeSobrenomeUtils.geraSobrenome(), DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario1, unidade1, beneficios1).build();
        funcionarios.add(funcionario1);

        Endereco enderecoFuncionario2 = EnderecoBuilder.getInstance()
                .endereco(LogradouroUtils.geraLogradouro(),
                        Cidade.BELO_HORIZONTE, Estado.MINAS_GERAIS, CepUtils.geraCep())
                .build();
        Unidade unidade2 = unidades.get(1);
        List<Beneficio> beneficios2 = BeneficioBuilder.getInstance().buildBeneficios(enderecoFuncionario2.getEstado());
        Funcionario funcionario2 = FuncionarioBuilder.getInstance().funcionario(NomeSobrenomeUtils.geraNome(), NomeSobrenomeUtils.geraSobrenome(), DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario2, unidade2, beneficios2).build();
        funcionarios.add(funcionario2);

        Endereco enderecoFuncionario3 = EnderecoBuilder.getInstance()
                .endereco(LogradouroUtils.geraLogradouro(),
                        Cidade.UBERLANDIA, Estado.MINAS_GERAIS, CepUtils.geraCep())
                .build();
        Unidade unidade3 = unidades.get(2);
        List<Beneficio> beneficios3 = BeneficioBuilder.getInstance().buildBeneficios(enderecoFuncionario3.getEstado());
        Funcionario funcionario3 = FuncionarioBuilder.getInstance().funcionario(NomeSobrenomeUtils.geraNome(), NomeSobrenomeUtils.geraSobrenome(), DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario3, unidade3, beneficios3).build();
        funcionarios.add(funcionario3);

        Endereco enderecoFuncionario4 = EnderecoBuilder.getInstance()
                .endereco(LogradouroUtils.geraLogradouro(),
                        Cidade.CAMPINAS, Estado.SAO_PAULO, CepUtils.geraCep())
                .build();
        Unidade unidade4 = unidades.get(3);
        List<Beneficio> beneficios4 = BeneficioBuilder.getInstance().buildBeneficios(enderecoFuncionario4.getEstado());
        Funcionario funcionario4 = FuncionarioBuilder.getInstance().funcionario(NomeSobrenomeUtils.geraNome(), NomeSobrenomeUtils.geraSobrenome(), DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario4, unidade4, beneficios4).build();
        funcionarios.add(funcionario4);

        Endereco enderecoFuncionario5 = EnderecoBuilder.getInstance()
                .endereco(LogradouroUtils.geraLogradouro(),
                        Cidade.SAO_JOSE_DO_RIO_PRETO, Estado.SAO_PAULO, CepUtils.geraCep())
                .build();
        Unidade unidade5 = unidades.get(4);
        List<Beneficio> beneficios5 = BeneficioBuilder.getInstance().buildBeneficios(enderecoFuncionario5.getEstado());
        Funcionario funcionario5 = FuncionarioBuilder.getInstance().funcionario(NomeSobrenomeUtils.geraNome(), NomeSobrenomeUtils.geraSobrenome(), DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario5, unidade5, beneficios5).build();
        funcionarios.add(funcionario5);

        Endereco enderecoFuncionario6 = EnderecoBuilder.getInstance()
                .endereco(LogradouroUtils.geraLogradouro(),
                        Cidade.JOINVILLE, Estado.SANTA_CATARINA, CepUtils.geraCep())
                .build();
        Unidade unidade6 = unidades.get(5);
        List<Beneficio> beneficios6 = BeneficioBuilder.getInstance().buildBeneficios(enderecoFuncionario6.getEstado());
        Funcionario funcionario6 = FuncionarioBuilder.getInstance().funcionario(NomeSobrenomeUtils.geraNome(), NomeSobrenomeUtils.geraSobrenome(), DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario6, unidade6, beneficios6).build();
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
