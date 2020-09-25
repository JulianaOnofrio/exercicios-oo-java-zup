package br.com.zup.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CepUtils {

        private List<String> cep = Arrays.asList("03177010","03940120", "04561301", "8301020", "1578010", "01397940");


        public static void main(String[] args) {
            System.out.println(br.com.zup.utils.CepUtils.geraCep());
            System.out.println(br.com.zup.utils.CepUtils.geraCep());
            System.out.println(br.com.zup.utils.CepUtils.geraCep());
            System.out.println(br.com.zup.utils.CepUtils.geraCep());
            System.out.println(br.com.zup.utils.CepUtils.geraCep());
            System.out.println(br.com.zup.utils.CepUtils.geraCep());
        }

        public static String geraCep() {
            List<String> cep = new br.com.zup.utils.CepUtils().getCep();
            Random r = new Random();
            return cep.get(r.nextInt(cep.size()));
        }
        public List<String> getCep() {
            return cep;
        }
        public void setCep(List<String> cep) {
            this.cep = cep;
        }

}

