package br.com.zup.domain;

import br.com.zup.domain.enums.TipoBeneficio;

import java.math.BigDecimal;
import java.util.Objects;

public class Beneficio {

    private TipoBeneficio tipoBeneficio;
    private BigDecimal valorBeneficio;


    public Beneficio() {
        super();
    }

    public Beneficio(TipoBeneficio tipoBeneficio) {
        super();
        this.tipoBeneficio = tipoBeneficio;
        this.valorBeneficio = tipoBeneficio.getValor();

    }


    public TipoBeneficio getTipoBeneficio() {
        return tipoBeneficio;
    }

    public BigDecimal getValorBeneficio() {
        return valorBeneficio;
    }

    public void setValorBeneficio(BigDecimal valorBeneficio) {
        this.valorBeneficio = valorBeneficio;
    }

    public void setTipoBeneficio(TipoBeneficio tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beneficio beneficio = (Beneficio) o;
        return tipoBeneficio == beneficio.tipoBeneficio &&
                Objects.equals(valorBeneficio, beneficio.valorBeneficio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoBeneficio, valorBeneficio);
    }

    @Override
    public String toString() {
        return "\nBeneficio{\n" +
                "\ttipoBeneficio=" + tipoBeneficio + ",\n" +
                "\tvalorBeneficio=" + valorBeneficio + "\n" +
                '}';
    }
}




