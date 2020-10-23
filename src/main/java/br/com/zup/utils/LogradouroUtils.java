package br.com.zup.utils;

import com.github.javafaker.Faker;

public class LogradouroUtils {

   private static final Faker FAKER = new Faker();

   public static String geraLogradouro() {
       return FAKER.address().streetAddress();
   }

}
