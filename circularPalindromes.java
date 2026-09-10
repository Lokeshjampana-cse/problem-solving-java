import java.util.*;

class Result {

    public static List<Integer> circularPalindromes(String s) {
        int n = s.length();
        String doubled = s + s;
        List<Integer> result = new ArrayList<>();

        for (int start = 0; start < n; start++) {
            String rotation = doubled.substring(start, start + n);
            result.add(longestPalindrome(rotation));
        }

        return result;
    }

    private static int longestPalindrome(String s) {
        int maxLength = 1;

        for (int center = 0; center < s.length(); center++) {
            int left = center;
            int right = center;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                maxLength = Math.max(maxLength, right - left + 1);
                left--;
                right++;
            }

            left = center;
            right = center + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                maxLength = Math.max(maxLength, right - left + 1);
                left--;
                right++;
            }
        }

        return maxLength;
    }
}