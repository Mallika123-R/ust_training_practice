package localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateEx {

    public static void main(String[] args)
    {
        LocalDate today=LocalDate.now();
        System.out.println("Today date is "+today);

        String dob="23/05/2020";
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter);

        LocalDate dateofJoining=LocalDate.parse(dob,formatter);
        System.out.println("My date of joining "+dateofJoining);

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getYear());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getDayOfYear());

        System.out.println(today.plusDays(10));
        System.out.println(today.plusMonths(2));
        System.out.println(today.plusYears(3));

        System.out.println(today.minusDays(10));
        System.out.println(today.minusMonths(2));
        System.out.println(today.minusYears(3));

        System.out.println(today.isEqual(dateofJoining));
        System.out.println(today.isAfter(dateofJoining));
        System.out.println(today.isBefore(dateofJoining));

        System.out.println(today.isLeapYear());

        //convert string to local date
        String str="2021/07/06";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate  str1 = LocalDate.parse(str, formatter1);
        System.out.println(str1);

        String stringDate=str1.format(formatter1);
        System.out.println(stringDate);

        long noofDays= ChronoUnit.DAYS.between(dateofJoining,today);
        long noofMonths= ChronoUnit.MONTHS.between(dateofJoining,today);
        long noofYears= ChronoUnit.YEARS.between(dateofJoining,today);

        System.out.println("Total Exp "+noofDays+ " Days "+noofMonths+ " Months "+noofYears+ " Years");


        //local date to string








    }
}
