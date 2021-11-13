package class3;

import java.util.Scanner;

public class ArmstrongNumberFinder {
    static boolean isArmstrong(int n) {
        int x = n;
        int y = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            y += Math.pow(digit, 3);
        }
        return x == y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean ans = isArmstrong(n);
        int ansInt;
        if (ans) {
            ansInt = 1;
        } else {
            ansInt = 0;
        }
        System.out.println(ansInt);
    }
}
