import java.util.*;

public class lapindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            String s = sc.next();

            int n = s.length();

            int[] left = new int[26];
            int[] right = new int[26];

            // First half
            for (int i = 0; i < n / 2; i++) {
                left[s.charAt(i) - 'a']++;
            }

            // Second half
            for (int i = (n + 1) / 2; i < n; i++) {
                right[s.charAt(i) - 'a']++;
            }

            boolean same = true;

            for (int i = 0; i < 26; i++) {
                if (left[i] != right[i]) {
                    same = false;
                    break;
                }
            }

            if (same) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}