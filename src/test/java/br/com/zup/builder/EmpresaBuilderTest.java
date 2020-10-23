package br.com.zup.builder;

import br.com.zup.domain.Empresa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpresaBuilderTest {
    @Test
    @DisplayName("Teste de Funcionalidade da Empresa Builder")
    public void testeFuncionariosCompleto() {
        Empresa empresa = EmpresaBuilder.getInstance().build();
        assertNotNull(empresa.getNomeFantasia());
        assertNotNull(empresa.getDataAbertura());
        assertAll(() -> {
            assertNotNull(empresa.getFuncionarios());
            assertNotEquals(0, empresa.getFuncionarios().size());

        });
        assertAll(() -> {
            assertNotNull(empresa.getUnidades());
            assertNotEquals(0, empresa.getUnidades().size());
        });
    }
}
