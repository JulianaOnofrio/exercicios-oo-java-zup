package br.com.zup.utils;

import br.com.zup.builder.EnderecoBuilder;
import br.com.zup.domain.Endereco;
import br.com.zup.domain.enums.Cidade;

public class EnderecoUtils {
    public static Endereco gerarEndereco() {
        Cidade cidade = CidadeUtils.gerarCidade();

        return EnderecoBuilder.getInstance()
                .logradouro(LogradouroUtils.geraLogradouro()).cidade(cidade)
                .estado(EstadoUtils.geraEstado(cidade))
                .cep(CepUtils.geraCep()).build();

    }
}
