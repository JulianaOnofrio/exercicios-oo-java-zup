package br.com.zup.builder;

import br.com.zup.domain.Funcionario;
import br.com.zup.domain.Unidade;
import br.com.zup.utils.FuncionarioUtils;
import br.com.zup.utils.UnidadeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioBuilderTest {
    private Funcionario funcionario;

    @BeforeEach
    public void init() {
        List<Unidade> unidades = UnidadeUtils.gerarUnidades(1);
        funcionario = FuncionarioUtils.gerarFuncionarios(unidades, 1).get(0);
    }

    @Test
    @DisplayName("Teste de Beneficios de Funcionarios")
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

