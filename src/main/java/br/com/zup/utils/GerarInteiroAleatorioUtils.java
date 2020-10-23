package br.com.zup.utils;

import java.util.Random;

public class GerarInteiroAleatorioUtils {
    private static final Random RANDOM = new Random();

    public static int gerarInteiro(int limite) {
        return RANDOM.nextInt(limite);
    }
}


