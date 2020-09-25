package br.com.zup.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NomeSobrenomeUtils {

    private List<String> nomes = Arrays.asList("João","Maurício", "Francisco", "Caio", "Roberto", "Vitor");
    private List<String> sobrenomes = Arrays.asList("Alves", "Oliveira", "Guedes", "Marcos", "Onofrio","Salles");

    public NomeSobrenomeUtils() {
    }


    public static String geraNome() {
            List<String> nomes = new NomeSobrenomeUtils().getNomes();
            Random r = new Random();
            return nomes.get(r.nextInt(nomes.size()));
    }
    public static String geraSobrenome() {
        List<String> sobrenomes = new NomeSobrenomeUtils().getSobrenomes();
        Random r = new Random();
        return sobrenomes.get(r.nextInt(sobrenomes.size()));
    }
    public List<String> getNomes() {
        return nomes;
}
    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }
    public List<String> getSobrenomes() {
        return sobrenomes;
    }
    public void setSobrenomes(List<String> sobrenomes) {
        this.sobrenomes = sobrenomes;
    }
}

