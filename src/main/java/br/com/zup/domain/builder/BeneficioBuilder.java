package br.com.zup.domain.builder;

import br.com.zup.domain.Beneficio;
import br.com.zup.domain.enums.Estado;
import br.com.zup.domain.enums.TipoBeneficio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BeneficioBuilder {

    private Beneficio beneficio;


    public BeneficioBuilder() {
        super();
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


    public List<Beneficio> buildBeneficios(Estado estado) {

        List<Beneficio> beneficios = new ArrayList<Beneficio>();
        Beneficio beneficioValeTransporte = new BeneficioBuilder()
                .beneficio(TipoBeneficio.VALE_TRANSPORTE).aplicarBonus(estado.getBonus()).build();

        Beneficio beneficioValeRefeicao = new BeneficioBuilder()
                .beneficio(TipoBeneficio.VALE_REFEICAO).aplicarBonus(estado.getBonus()).build();

        Beneficio beneficioAuxilioHomeOffice = new BeneficioBuilder()
                .beneficio(TipoBeneficio.AUXILIO_HOME_OFFICE).aplicarBonus(estado.getBonus()).build();

        beneficios.add(beneficioValeTransporte);
        beneficios.add(beneficioValeRefeicao);
        beneficios.add(beneficioAuxilioHomeOffice);

        return beneficios;
    }

}

