package extra_practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        Date myDate = new Date(); //Fri Feb 03 09:41:19 CET 2023

        System.out.println(myDate);

        System.out.println(myDate.getTime()); //1675413949704 ==> 1 Ocak 1970 den su ana kadar ki mili saniye miktari

        //Iicnde bulundugunuz an nasil alinir?
        System.out.println(LocalDate.now());

        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Paris")));

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(5).plusMonths(1));


        //Iki tarih nasil karsilastirilir?






    }




}
