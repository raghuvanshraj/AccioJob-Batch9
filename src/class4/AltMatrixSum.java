package class4;

import java.util.Scanner;

public class AltMatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int blackSum = 0;
        int whiteSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == j % 2) {
                    blackSum += matrix[i][j];
                } else {
                    whiteSum += matrix[i][j];
                }
            }
        }

        System.out.println(blackSum);
        System.out.println(whiteSum);
    }
}
