package br.com.zup.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NomeSobrenomeUtils {

    private static List<String> nomes = new ArrayList<String>(Arrays.asList("João", "Maurício", "Francisco", "Caio", "Roberto", "Vitor"));
    private static List<String> sobrenomes = new ArrayList<String>(Arrays.asList("Alves", "Oliveira", "Guedes", "Marcos", "Onofrio", "Salles"));

    //  TODO a declaração do construtor padrão é dispensada nesses casos, ele já é gerado por default:
    //  https://www.devmedia.com.br/construtores-em-java-primeiros-passos/28618
    public NomeSobrenomeUtils() {
    }

    public static String geraNome() {
        int indice = new Random().nextInt(nomes.size());
        String nome = nomes.get(indice);
        //nomes.remove(nome);
        return nome;
    }

    public static String geraSobrenome() {
        int indice = new Random().nextInt(sobrenomes.size());
        String sobrenome = sobrenomes.get(indice);
        //sobrenomes.remove(sobrenome);
        return sobrenome;
    }
}
