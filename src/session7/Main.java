package session7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args){
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDate d1 = d.plusDays(2);
        System.out.println(d1);
        LocalDate t = LocalDate.of(2022,10,15);
        LocalDate t1= t.plusYears(1);
        System.out.println(t);
        System.out.println(t1);

        LocalDate y = LocalDate.parse("2022-09-30");
        System.out.println(y);

        long b = ChronoUnit.DAYS.between(LocalDate.now(),d1);
        System.out.println(b);
    }
}
