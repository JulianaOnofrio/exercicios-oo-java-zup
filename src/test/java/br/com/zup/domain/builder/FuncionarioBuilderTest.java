package br.com.zup.domain.builder;

import br.com.zup.domain.Beneficio;
import br.com.zup.domain.Endereco;
import br.com.zup.domain.Funcionario;
import br.com.zup.domain.Unidade;
import br.com.zup.domain.enums.Cidade;
import br.com.zup.domain.enums.Estado;
import br.com.zup.domain.enums.LinguagemDeProgramacao;
import br.com.zup.utils.DataUtils;
import br.com.zup.utils.NomeSobrenomeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioBuilderTest {
    private Funcionario funcionario;
    private Unidade unidade;

    @BeforeEach
    public void init() {
        Endereco enderecoUnidade = new EnderecoBuilder()
                .endereco("Avenida Rondon Pacheco,Numero 4600,Bairro Tibery, Complemento 7° e 8° andar",
                        Cidade.UBERLANDIA, Estado.MINAS_GERAIS, "38405142")
                .build();
        Endereco enderecoFuncionario = new EnderecoBuilder()
                .endereco("Rua amor, número 2200, Bairro Felicidade, Complemento Sucesso", Cidade.UBERLANDIA, Estado.MINAS_GERAIS, "38405983").build();
        unidade = new UnidadeBuilder().unidade("Uberlândia", enderecoUnidade).build();
        List<Beneficio> beneficios = new BeneficioBuilder().buildBeneficios(unidade.getEndereco().getEstado());

        funcionario = new FuncionarioBuilder().developer(NomeSobrenomeUtils.geraNome(),NomeSobrenomeUtils.geraSobrenome(), DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario, unidade, beneficios,LinguagemDeProgramacao.JAVA).build();

    }

    @Test
    @DisplayName("Teste de Garantia dos 3 Beneficios para Funcionarios")
    public void testeDeFuncionarios() {
        assertEquals(3, funcionario.getBeneficios().size());
    }


    @Test
    @DisplayName("Teste do Cadastro Completo de Funcionario")
    public void testeFuncionariosCompleto() {
        Assertions.assertNotNull(funcionario.getNome());
        Assertions.assertNotNull(funcionario.getSobrenome());
        Assertions.assertNotNull(funcionario.getEndereco());
        Assertions.assertNotNull(funcionario.getBeneficios());
        Assertions.assertNotNull(funcionario.getDataAdmissao());
        Assertions.assertNotNull(funcionario.getDataNascimento());
        Assertions.assertNotNull(funcionario.getUnidade());

    }
}