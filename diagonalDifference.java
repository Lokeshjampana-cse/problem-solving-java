import java.util.*;

public class Solution {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int n = arr.size();

        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {

            left += arr.get(i).get(i);
            right += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(left - right);
    }
}