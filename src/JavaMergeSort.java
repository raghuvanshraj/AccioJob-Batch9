import java.util.Arrays;
import java.util.Scanner;

public class JavaMergeSort {
    static int[] _merge(int[] left, int[] right) {
        int n = left.length;
        int m = right.length;
        int[] ans = new int[n + m];

        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (left[i] < right[j]) {
                ans[k++] = left[i++];
            } else {
                ans[k++] = right[j++];
            }
        }

        while (i < n) {
            ans[k++] = left[i++];
        }

        while (j < m) {
            ans[k++] = right[j++];
        }

        return ans;
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int leftSz = mid - l + 1;
        int[] left = new int[leftSz];
        for (int i = 0; i < leftSz; i++) {
            left[i] = arr[l + i];
        }

        int rightSz = r - mid;
        int[] right = new int[rightSz];
        for (int i = 0; i < rightSz; i++) {
            right[i] = arr[mid + i + 1];
        }

        int[] ans = _merge(left, right);
        int sz = ans.length;
        for (int i = 0; i < sz; i++) {
            arr[l + i] = ans[i];
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
