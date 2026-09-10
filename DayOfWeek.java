import java.time.*;
import java.util.*;


public class DayOfWeek {


    public static String dayOfTheWeek(int day,int month,int year){


        LocalDate date =
                LocalDate.of(year,month,day);



        return date.getDayOfWeek().toString();

    }



    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);



        int day=sc.nextInt();

        int month=sc.nextInt();

        int year=sc.nextInt();



        System.out.println(
                dayOfTheWeek(day,month,year)
        );



        sc.close();

    }
}