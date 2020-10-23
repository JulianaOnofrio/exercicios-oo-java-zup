package br.com.zup.builder;
import br.com.zup.domain.Beneficio;
import br.com.zup.domain.enums.TipoBeneficio;

import java.math.BigDecimal;

public class BeneficioBuilder {

    private Beneficio beneficio;

    private static BeneficioBuilder uniqueInstance  = new BeneficioBuilder();

    private BeneficioBuilder() {

    }

    public static BeneficioBuilder getInstance() {
        return uniqueInstance;
    }

    public BeneficioBuilder beneficio(TipoBeneficio tipoBeneficio) {
        if (tipoBeneficio.getValor().compareTo(BigDecimal.ZERO) < 0) {
            this.beneficio.setValorBeneficio(BigDecimal.ZERO);
        }

        this.beneficio = new Beneficio(tipoBeneficio);

        return this;
    }

    public BeneficioBuilder aplicarBonus(BigDecimal bonus) {
        beneficio.setValorBeneficio(beneficio.getValorBeneficio().multiply(bonus));

        return this;
    }

    public Beneficio build() {
        return this.beneficio;
    }




}

