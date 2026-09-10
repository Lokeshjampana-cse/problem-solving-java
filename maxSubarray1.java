import java.util.*;

public class maxSubarray {

    public static int[] maxSubarray(List<Integer> arr) {

        // Maximum subarray sum
        int current = arr.get(0);
        int maxSubarray = arr.get(0);

        // Maximum subsequence sum
        int maxElement = arr.get(0);
        int maxSubsequence = 0;

        for (int i = 1; i < arr.size(); i++) {

            int value = arr.get(i);

            // Kadane's Algorithm
            current = Math.max(value, current + value);
            maxSubarray = Math.max(maxSubarray, current);

            // For subsequence
            if (value > 0) {
                maxSubsequence += value;
            }

            maxElement = Math.max(maxElement, value);
        }

        // If all elements are negative
        if (maxSubsequence == 0) {
            maxSubsequence = maxElement;
        }

        return new int[]{maxSubarray, maxSubsequence};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            int[] result = maxSubarray(arr);

            System.out.println(result[0] + " " + result[1]);
        }

        sc.close();
    }
}