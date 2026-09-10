import java.time.*;
import java.util.*;


public class DayOfYear {


    public static int dayOfYear(String date){


        LocalDate d = LocalDate.parse(date);


        return d.getDayOfYear();

    }



    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);



        System.out.print("Enter date: ");

        String date=sc.next();



        System.out.println(
                "Day Number: "+dayOfYear(date)
        );



        sc.close();

    }
}