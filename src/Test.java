import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 1) {
//                continue;
//            }
//            System.out.println(i);
//        }

        int i = -1;
        while (i < n) {
            i++;
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
