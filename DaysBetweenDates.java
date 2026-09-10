import java.time.*;
import java.util.*;


public class DaysBetweenDates {


    public static int daysBetweenDates(String date1,String date2){


        LocalDate d1 = LocalDate.parse(date1);

        LocalDate d2 = LocalDate.parse(date2);


        return Math.abs((int)ChronoUnit.DAYS.between(d1,d2));

    }



    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);



        System.out.print("Enter first date (yyyy-mm-dd): ");

        String date1=sc.next();



        System.out.print("Enter second date (yyyy-mm-dd): ");

        String date2=sc.next();



        int result=daysBetweenDates(date1,date2);



        System.out.println("Number of Days: "+result);



        sc.close();

    }
}