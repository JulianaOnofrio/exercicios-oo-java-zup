package br.com.zup.utils;

import br.com.zup.builder.UnidadeBuilder;
import br.com.zup.domain.Unidade;

import java.util.ArrayList;
import java.util.List;

public class UnidadeUtils {
    public static List<Unidade> gerarUnidades(int quantidade) {

        List<Unidade> unidades = new ArrayList<Unidade>();

        while (quantidade > 0) {
            Unidade u = UnidadeBuilder.getInstance()
                    .nome(ZupUtils.gerarNome())
                    .endereco(EnderecoUtils.gerarEndereco())
                    .build();

            quantidade--;
            unidades.add(u);
        }
        return unidades;
    }
}
