public static int marsExploration(String s) {
    String expected = "SOS";
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != expected.charAt(i % 3)) {
            count++;
        }
    }

    return count;
}