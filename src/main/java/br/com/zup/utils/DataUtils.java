package br.com.zup.utils;

import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.ThreadLocalRandom;

public class DataUtils {

    public static LocalDate geraDataNascimento() {

        LocalDate start = LocalDate.of(1950, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2002, Month.JANUARY, 1);
        long random = ThreadLocalRandom.current().nextLong(start.toEpochDay(), end.toEpochDay());
        return LocalDate.ofEpochDay(random);
    }

    public static LocalDate geraDataAdmissao() {

        LocalDate start = LocalDate.of(2011, Month.JANUARY, 1);
        long random = ThreadLocalRandom.current().nextLong(start.toEpochDay(), LocalDate.now().minusDays(1).toEpochDay());
        return LocalDate.ofEpochDay(random);

    }
}
