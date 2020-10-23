package br.com.zup.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ZupUtils {
    private static List<String> nomes = new ArrayList<String>(Arrays.asList("CAMPINAS", "UBERLÂNDIA", "SÃO PAULO", "JOINVILLE", "SÃO JOSÉ DO RIO PRETO ", "BELO HORIZONTE"));
    public static String gerarNome() {
        int indice = new Random().nextInt(nomes.size());
        String nome = nomes.get(indice);
        return nome;
    }

}
