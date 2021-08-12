package localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ProductValidity {

    public static void main(String[] args)
    {

        LocalDate today=LocalDate.now();
        System.out.println("Today date is "+today);

        System.out.println("Enter manufacture date");
        Scanner scanner=new Scanner(System.in);
        String mandate=scanner.next();
        DateTimeFormatter mdate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate mdate1 = LocalDate.parse(mandate, mdate);
        System.out.println(mdate1);

       // long noOfdays1= ChronoUnit.DAYS.between()
        long  noOfDays1= ChronoUnit.DAYS.between(mdate1,today);
        if (noOfDays1>30) {
            System.out.println("not valid");
        }
        else {
            System.out.println("valid");
        }
        // Product -> expiry date
        // consider taday date ->  check product is valid / expired
        System.out.println("Enter Expiry date");
        String expdate=scanner.next();
        DateTimeFormatter exdate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate exdate1 = LocalDate.parse(expdate, exdate);
        if (today.isAfter(exdate1)) {
            System.out.println("not valid");
        }
        else {
            System.out.println("valid");
        }

        // today - resign -> 30 days ->  give dataofReleving=?
        LocalDate dat=LocalDate.of(20121,07,06);
        System.out.println(dat);


    }
}
