import java.util.*;

class Solution {
    public static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();

        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                result.add(i);
            }
        }

        return result;
    }
}