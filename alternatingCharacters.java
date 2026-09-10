public static int alternatingCharacters(String s) {
    int deletions = 0;

    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == s.charAt(i - 1)) {
            deletions++;
        }
    }

    return deletions;
}