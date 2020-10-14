package br.com.zup.domain.enums;

import java.math.BigDecimal;

public enum Estado {
    SAO_PAULO(new BigDecimal("1.4")), SANTA_CATARINA(new BigDecimal("1.3")), MINAS_GERAIS(new BigDecimal("1.3"));


    private BigDecimal bonus;


    public BigDecimal getBonus() {
        return this.bonus;
    }


    private Estado(BigDecimal bonus) {
        this.bonus = bonus;
    }
}
