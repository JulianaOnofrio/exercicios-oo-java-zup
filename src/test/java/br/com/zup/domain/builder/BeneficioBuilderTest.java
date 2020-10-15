package br.com.zup.domain.builder;

import br.com.zup.domain.Beneficio;
import br.com.zup.domain.enums.TipoBeneficio;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BeneficioBuilderTest {
    @Test
    @DisplayName("Teste beneficio nunca negativa")
    public void testeBeneficio() {
        Beneficio beneficio = BeneficioBuilder.getInstance().beneficio(TipoBeneficio.VALE_REFEICAO).build();
        assertTrue(beneficio.getValorBeneficio().compareTo(BigDecimal.ZERO) > 0);

    }
}

