package br.com.zup.utils;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class DataUtils {

    public static LocalDate geraDataNascimento(){

        LocalDate start =LocalDate.of(1950,Month.JANUARY,1);
        LocalDate end = LocalDate.of(2002,Month.JANUARY,1);
        long days = ChronoUnit.DAYS.between(start,end);
        return start.plusDays(new Random().nextInt((int) days+1));
    }

    public static LocalDate geraDataAdmissao() {

        LocalDate start = LocalDate.of(2011,Month.JANUARY,1);
        long days = ChronoUnit.DAYS.between(start,LocalDate.now().plusDays(-1));
        return start.plusDays(new Random().nextInt((int) days +1));

    }
}