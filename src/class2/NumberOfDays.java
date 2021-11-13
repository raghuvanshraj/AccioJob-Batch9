package class2;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int ans;
        if (m <= 7) {
            if (m == 2) {
                ans = 28;
            } else if (m % 2 == 1) {
                ans = 31;
            } else {
                ans = 30;
            }
        } else {
            if (m % 2 == 1) {
                ans = 30;
            } else {
                ans = 31;
            }
        }

        System.out.println(ans);
    }
}
