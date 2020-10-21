package br.com.zup.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CepUtils {

    private static List<String> ceps = new ArrayList<String>(Arrays.asList("03177010", "03940120", "04561301", "8301020", "1578010", "01397940"));

    //  TODO a declaração do construtor padrão é dispensada nesses casos, ele já é gerado por default:
    //  https://www.devmedia.com.br/construtores-em-java-primeiros-passos/28618
    public CepUtils() {
    }

    public static String geraCep() {

        int indice = new Random().nextInt(ceps.size());
        String cep = ceps.get(indice);
        ceps.remove(indice);
        return cep;
    }
}


