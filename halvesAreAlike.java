class Solution {

    public boolean halvesAreAlike(String s) {

        int countA = 0;
        int countB = 0;

        int half = s.length() / 2;

        for (int i = 0; i < half; i++) {

            if (isVowel(s.charAt(i))) {
                countA++;
            }
        }

        for (int i = half; i < s.length(); i++) {

            if (isVowel(s.charAt(i))) {
                countB++;
            }
        }

        return countA == countB;
    }

    private boolean isVowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' ||
               c == 'O' || c == 'U';
    }
}