package br.com.zup.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LogradouroUtils {

    private List<String> logradouro = Arrays.asList("Rua Doutor João Batista de Lacerda,Numero 402,Bairro Mooca, Complemento Casa","Rua Ouro Preto,Numero 1112,Bairro Santo Agostinho, Complemento 2° Andar", "Avenida Bélgica,Numero 1220,Bairro Sabiá, Complemento Casa", "Rua Francisco Teodoro,Numero 72,Bairro Barão Geraldo, Complemento Casa", "Rua Pascua Vale,Numero 266,Bairro Vila Nova, Complemento Casa", "Rua América,Numero 52,Bairro Blumenau, Complemento Casa");

    public LogradouroUtils() {
    }

    public static String geraLogradouro() {
        List<String> logradouro = new br.com.zup.utils.LogradouroUtils().getLogradouro();
        Random r = new Random();
        return logradouro.get(r.nextInt(logradouro.size()));
    }
    public List<String> getLogradouro() {
        return logradouro;
    }
    public void getLogradouro(List<String> logradouro) {
        this.logradouro = logradouro;
    }
}
