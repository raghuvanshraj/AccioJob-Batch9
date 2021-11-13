package class2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    static int fahrenheitToCelsius(int f) {
        return ((f - 32) * 5) / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int c = fahrenheitToCelsius(f);
        System.out.println(c);
    }
}
