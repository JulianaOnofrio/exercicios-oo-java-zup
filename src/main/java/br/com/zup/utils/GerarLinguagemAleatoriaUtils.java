package br.com.zup.utils;

import br.com.zup.domain.enums.LinguagemDeProgramacao;

import java.util.Random;

public class GerarLinguagemAleatoriaUtils {
    public static LinguagemDeProgramacao gerarLinguagemAleatoria() {
        return LinguagemDeProgramacao.values()[new Random().nextInt(LinguagemDeProgramacao.values().length)];
    }


}
