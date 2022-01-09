import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
//    static int solve(ArrayList<Integer> arr, int m) {
////        System.out.println(arr);
//        int maxElement = Collections.max(arr);
//        if (m == 0) {
//            return maxElement;
//        }
//
//        int idx = arr.indexOf(maxElement);
//        arr.add(0);
//        int lastIdx = arr.size() - 1;
//        int ans = maxElement;
//        while (arr.get(idx) >= Math.max(maxElement / 2, 2)) {
//            arr.set(idx, arr.get(idx) - 1);
//            arr.set(lastIdx, arr.get(lastIdx) + 1);
//            ans = Math.min(ans, solve((ArrayList<Integer>) arr.clone(), m - 1));
//        }
//
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>(n);
//        for (int i = 0; i < n; i++) {
//            arr.add(sc.nextInt());
//        }
//        System.out.println(solve(arr, m));
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = (fib[i-1] + fib[i-2]) % 100;
        }

        System.out.println(fib[n]);
    }
}
