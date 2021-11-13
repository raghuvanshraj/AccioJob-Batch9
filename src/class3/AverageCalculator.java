package class3;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int totalMarks = 0;
        for (int i = 0; i < n; i++) {
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        int average = totalMarks / n;
        System.out.println(average);
    }
}
