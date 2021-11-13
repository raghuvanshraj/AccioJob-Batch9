import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JavaArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//
//        // Input
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        // Printing
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }

        String input = scanner.nextLine();
        String[] splitInput = input.split(",");
//        System.out.println(Arrays.toString(splitInput));
        for (String x : splitInput) {
            System.out.println(Integer.parseInt(x));
        }
    }
}
