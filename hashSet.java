import java.util.*;

public class hashSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            String first = sc.next();
            String second = sc.next();

            String pair = first + " " + second;

            set.add(pair);

            System.out.println(set.size());
        }
    }
}