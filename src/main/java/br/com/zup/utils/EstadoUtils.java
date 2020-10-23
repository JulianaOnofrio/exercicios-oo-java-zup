package br.com.zup.utils;

import br.com.zup.domain.enums.Cidade;
import br.com.zup.domain.enums.Estado;

public class EstadoUtils {
    public static Estado geraEstado(Cidade cidade) {
        if (cidade == Cidade.CAMPINAS) {
            return Estado.SAO_PAULO;
        }

        if (cidade == Cidade.JOINVILLE) {
            return Estado.SANTA_CATARINA;
        }

        return Estado.MINAS_GERAIS;
    }
}
