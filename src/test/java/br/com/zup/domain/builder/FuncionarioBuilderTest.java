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
        Endereco enderecoUnidade = EnderecoBuilder.getInstance()
                .endereco("Avenida Rondon Pacheco,Numero 4600,Bairro Tibery, Complemento 7° e 8° andar",
                        Cidade.UBERLANDIA, Estado.MINAS_GERAIS, "38405142")
                .build();
        Endereco enderecoFuncionario = EnderecoBuilder.getInstance()
                .endereco("Rua amor, número 2200, Bairro Felicidade, Complemento Sucesso", Cidade.UBERLANDIA, Estado.MINAS_GERAIS, "38405983").build();
        unidade = UnidadeBuilder.getInstance().unidade("Uberlândia", enderecoUnidade).build();
        List<Beneficio> beneficios = BeneficioBuilder.getInstance().buildBeneficios(unidade.getEndereco().getEstado());
        funcionario = FuncionarioBuilder.getInstance().developer(NomeSobrenomeUtils.geraNome(), NomeSobrenomeUtils.geraSobrenome(), DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario, unidade, beneficios, LinguagemDeProgramacao.JAVA).build();
    }

    @Test
    @DisplayName("Teste de funcionarios")
    public void testeDeFuncionarios() {
        Funcionario funcionario = FuncionarioBuilder.getInstance().getFuncionario();
        assertEquals(3, funcionario.getBeneficios().size());
    }


    @Test
    @DisplayName("Teste do Cadastro Completo de Funcionario")
    public void testeFuncionariosCompleto() {
        Funcionario funcionario = FuncionarioBuilder.getInstance().getFuncionario();
        Assertions.assertNotNull(funcionario.getNome());
        Assertions.assertNotNull(funcionario.getSobrenome());
        Assertions.assertNotNull(funcionario.getEndereco());
        Assertions.assertNotNull(funcionario.getBeneficios());
        Assertions.assertNotNull(funcionario.getDataAdmissao());
        Assertions.assertNotNull(funcionario.getDataNascimento());
        Assertions.assertNotNull(funcionario.getUnidade());

    }

}


//pesquisar onde roda no junit no intellij
//asserção- resultado esperado
//funcionario tem que ter 3 beneficios
//nunca seja negativo - criar um teste negativo ao inves de adicionar eu substraio
//eu já uso o método que eu fiz com a aquela lógica
//assert notnull eu levo ele direto e não
//penso antes qual é o resultado esperado e ai eu penso na variação
//implementa o tratamento e ai eu faço um maior que zero.

