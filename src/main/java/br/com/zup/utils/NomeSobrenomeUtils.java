package br.com.zup.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NomeSobrenomeUtils {

    private static List<String> nomes = new ArrayList<String>(Arrays.asList("João", "Maurício", "Francisco", "Caio", "Roberto", "Vitor"));
    private static List<String> sobrenomes = new ArrayList<String>(Arrays.asList("Alves", "Oliveira", "Guedes", "Marcos", "Onofrio", "Salles"));

    public NomeSobrenomeUtils() {
    }

    public static String geraNome() {
        int indice = new Random().nextInt(nomes.size());
        String nome = nomes.get(indice);
        nomes.remove(nome);
        return nome;
    }

    public static String geraSobrenome() {
        int indice = new Random().nextInt(sobrenomes.size());
        String sobrenome = sobrenomes.get(indice);
        sobrenomes.remove(sobrenome);
        return sobrenome;
    }
}
