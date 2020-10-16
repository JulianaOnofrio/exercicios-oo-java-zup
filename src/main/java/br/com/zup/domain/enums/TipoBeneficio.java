package br.com.zup.domain.enums;

import java.math.BigDecimal;

public enum TipoBeneficio {

    VALE_TRANSPORTE(new BigDecimal("400")), VALE_REFEICAO(new BigDecimal("700")), AUXILIO_HOME_OFFICE(new BigDecimal("100"));


    private BigDecimal valor;


    public BigDecimal getValor()
    {
        return this.valor;
    }


    private TipoBeneficio(BigDecimal valor)
    {
        this.valor = valor;
    }

}


