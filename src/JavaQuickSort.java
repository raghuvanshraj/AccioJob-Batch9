import java.util.Arrays;
import java.util.Scanner;

public class JavaQuickSort {
    static int partition(int[] arr, int l, int r) {
        int i = l;
        for (int j = l; j < r; j++) {
            if (arr[j] < arr[r]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

        return i;
    }

    static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int p = partition(arr, l, r);

        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
