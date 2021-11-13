package class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.TreeSet;

public class TwoSumInAnArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nAndT = br.readLine();
        String[] nAndTSplit = nAndT.split(" ");
        int n = Integer.parseInt(nAndTSplit[0]);
        long t = Long.parseLong(nAndTSplit[1]);
        long[] arr = new long[n];
        String arrString = br.readLine();
        String[] arrStringSplit = arrString.split(" ");
        TreeMap<Long, Integer> indices = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrStringSplit[i]);
            indices.put(arr[i], i);
        }

        TreeSet<Long> values = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            if (values.contains(t - arr[i])) {
                int j = indices.get(t - arr[i]);
                System.out.println(j + " " + i);
                break;
            }
            values.add(arr[i]);
        }
    }
}
