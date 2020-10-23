package br.com.zup.utils;

import br.com.zup.builder.BeneficioBuilder;
import br.com.zup.domain.Beneficio;
import br.com.zup.domain.enums.Estado;
import br.com.zup.domain.enums.TipoBeneficio;

import java.util.ArrayList;
import java.util.List;

public class BeneficioUtils {
    public static List<Beneficio> gerarBeneficios(Estado estado) {

        List<Beneficio> beneficios = new ArrayList<Beneficio>();
        Beneficio beneficioValeTransporte = BeneficioBuilder.getInstance()
                .beneficio(TipoBeneficio.VALE_TRANSPORTE).aplicarBonus(estado.getBonus()).build();

        Beneficio beneficioValeRefeicao = BeneficioBuilder.getInstance()
                .beneficio(TipoBeneficio.VALE_REFEICAO).aplicarBonus(estado.getBonus()).build();

        Beneficio beneficioAuxilioHomeOffice = BeneficioBuilder.getInstance()
                .beneficio(TipoBeneficio.AUXILIO_HOME_OFFICE).aplicarBonus(estado.getBonus()).build();

        beneficios.add(beneficioValeTransporte);
        beneficios.add(beneficioValeRefeicao);
        beneficios.add(beneficioAuxilioHomeOffice);

        return beneficios;
    }
}
