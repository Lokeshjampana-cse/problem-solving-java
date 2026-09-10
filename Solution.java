import java.util.*;

public class Solution {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

        int m = matrix.size();
        int n = matrix.get(0).size();

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> values = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;

            // Top row
            for (int j = left; j <= right; j++) {
                values.add(matrix.get(top).get(j));
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                values.add(matrix.get(i).get(right));
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                values.add(matrix.get(bottom).get(j));
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                values.add(matrix.get(i).get(left));
            }

            int len = values.size();

            // Rotate anti-clockwise
            int index = r % len;

            // Top row
            for (int j = left; j <= right; j++) {
                matrix.get(top).set(j, values.get(index));
                index = (index + 1) % len;
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                matrix.get(i).set(right, values.get(index));
                index = (index + 1) % len;
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                matrix.get(bottom).set(j, values.get(index));
                index = (index + 1) % len;
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                matrix.get(i).set(left, values.get(index));
                index = (index + 1) % len;
            }
        }

        // Print result
        for (List<Integer> row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }

            matrix.add(row);
        }

        matrixRotation(matrix, r);
    }
}