package br.com.zup.domain;
import br.com.zup.domain.enums.Cidade;
import br.com.zup.domain.enums.Estado;

import java.util.Objects;

public class Endereco {

    private String logradouro;
    private Cidade cidade;
    private Estado estado;
    private String cep;

    public Endereco() {
        super();
    }


 public Endereco(String logradouro, Cidade cidade, Estado estado, String cep) {
     super();
     this.logradouro = logradouro;
     this.cidade = cidade;
     this.estado = estado;
     this.cep = cep;
 }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro=" + logradouro + ",\n" +
                "cidade=" + cidade + ",\n" +
                "estado=" + estado + ",\n" +
                "cep=" + cep +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(logradouro, endereco.logradouro) &&
                cidade == endereco.cidade &&
                estado == endereco.estado &&
                Objects.equals(cep, endereco.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logradouro, cidade, estado, cep);
    }
}


