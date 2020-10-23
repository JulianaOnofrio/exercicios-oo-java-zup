package br.com.zup.builder;

import br.com.zup.domain.Beneficio;
import br.com.zup.domain.enums.Estado;
import br.com.zup.domain.enums.TipoBeneficio;
import br.com.zup.utils.BeneficioUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BeneficioBuilderTest {
    @Test
    @DisplayName("Teste Beneficio Nunca Negativo")
    public void testeBeneficio() {
        Beneficio beneficio = BeneficioBuilder.getInstance().beneficio(TipoBeneficio.VALE_REFEICAO).build();
        assertTrue(beneficio.getValorBeneficio().compareTo(BigDecimal.ZERO) > 0);

    }
    @Test
    @DisplayName("Teste Beneficio com bonus acrescido")
    public void testeBeneficioSomadosComBonus() {
        Beneficio beneficio = BeneficioBuilder.getInstance().beneficio(TipoBeneficio.VALE_REFEICAO)
                .aplicarBonus(Estado.SAO_PAULO.getBonus()) .build();
        assertTrue(beneficio.getValorBeneficio().compareTo(new BigDecimal("980")) == 0);

    }

    @Test
    @DisplayName("Teste deve conter todos e somente tres beneficios")
    public void deveConterTresBeneficiosNaLista() {
        List<Beneficio> benes = BeneficioUtils.gerarBeneficios(Estado.SAO_PAULO);

        assertTrue(benes.size() == 3);
    }

    @Test
    @DisplayName("Teste deve conter todos e somente tres beneficios")
    public void deveConterTresBeneficiosUmTipoDeCada() {
        List<Beneficio> benes = BeneficioUtils.gerarBeneficios(Estado.SAO_PAULO);

        long vr = benes.stream().filter(b -> b.getTipoBeneficio().equals(TipoBeneficio.VALE_REFEICAO)).count();
        long ao = benes.stream().filter(b -> b.getTipoBeneficio().equals(TipoBeneficio.AUXILIO_HOME_OFFICE)).count();
        long vt = benes.stream().filter(b -> b.getTipoBeneficio().equals(TipoBeneficio.VALE_TRANSPORTE)).count();

        assertTrue(vr == 1 && ao == 1 && vt == 1);
    }
}


