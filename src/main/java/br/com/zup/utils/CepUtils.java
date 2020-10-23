package br.com.zup.utils;

import com.github.javafaker.Faker;

public class CepUtils {
    private static final Faker FAKER = new Faker();

    public static String geraCep() {
        return FAKER.address().zipCode();
    }
}

