import java.util.*;

public class exceptionHandling{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            int p = sc.nextInt();

            System.out.println(n / p);
        }
        catch (InputMismatchException e) {
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}