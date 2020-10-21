package br.com.zup.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LogradouroUtils {

    private static List<String> logradouros = new ArrayList<String>(Arrays.asList("Rua Doutor João Batista de Lacerda,Numero 402,Bairro Mooca, Complemento Casa", "Rua Ouro Preto,Numero 1112,Bairro Santo Agostinho, Complemento 2° Andar", "Avenida Bélgica,Numero 1220,Bairro Sabiá, Complemento Casa", "Rua Francisco Teodoro,Numero 72,Bairro Barão Geraldo, Complemento Casa", "Rua Pascua Vale,Numero 266,Bairro Vila Nova, Complemento Casa", "Rua América,Numero 52,Bairro Blumenau, Complemento Casa"));

    //  TODO a declaração do construtor padrão é dispensada nesses casos, ele já é gerado por default:
    //  https://www.devmedia.com.br/construtores-em-java-primeiros-passos/28618
    public LogradouroUtils() {
    }

    public static String geraLogradouro() {
        int indice = new Random().nextInt(logradouros.size());
        String logradouro = logradouros.get(indice);
        logradouros.remove(logradouro);
        return logradouro;
    }
}
