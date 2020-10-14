package br.com.zup.domain.enums;

import java.math.BigDecimal;

public enum ValorPercentual {
    P30(new BigDecimal("1.3")),
    P40(new BigDecimal("1.4"));

    private BigDecimal percentual;

    ValorPercentual(BigDecimal percentual) {
        this.percentual = percentual;
    }

    public BigDecimal getPercentual() {
        return percentual;
    }
}

