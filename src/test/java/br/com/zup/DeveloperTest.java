package br.com.zup;

import br.com.zup.domain.Beneficio;
import br.com.zup.domain.Endereco;
import br.com.zup.domain.Funcionario;
import br.com.zup.domain.Unidade;
import br.com.zup.domain.builder.BeneficioBuilder;
import br.com.zup.domain.builder.EnderecoBuilder;
import br.com.zup.domain.builder.FuncionarioBuilder;
import br.com.zup.domain.builder.UnidadeBuilder;
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

public class DeveloperTest {

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
        List<Beneficio> beneficios4 = BeneficioBuilder.getInstance().buildBeneficios(enderecoFuncionario.getEstado());
        funcionario = FuncionarioBuilder.getInstance().developer(NomeSobrenomeUtils.geraNome(), NomeSobrenomeUtils.geraSobrenome(), DataUtils.geraDataNascimento(),
                DataUtils.geraDataAdmissao(), enderecoFuncionario, unidade,beneficios4, LinguagemDeProgramacao.JAVA).build();
    }

    @Test
    @DisplayName("Teste de linguagem de programação para developer")
    public void testeDeDeveloper() {
        Assertions.assertEquals("Developer",funcionario.getClass().getSimpleName());
    }
}
