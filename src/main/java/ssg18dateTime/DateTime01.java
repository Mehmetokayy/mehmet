package ssg18dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTime01 {

    private LocalDateTime dateTime;

    public static void main(String[] args) {

        // --------  Type code to  Display Current Date  ---------
        LocalDate Date1= LocalDate.now();
        System.out.println(Date1);//2023-02-28

        // --------  Type code to  Display Current Time  ---------

        LocalTime time1= LocalTime.now();
        System.out.println(time1);//20:52:59.453598

        // --------  Type code to     Display Current Date and Time ---------


        LocalDateTime cdt= LocalDateTime.now();
        System.out.println(cdt);



    }

}