package br.com.zup.utils;
import br.com.zup.domain.enums.Cidade;
import java.util.Random;
public class CidadeUtils {

    public static Cidade gerarCidade() {
        return Cidade.values()[new Random().nextInt(Cidade.values().length)];
    }
}


