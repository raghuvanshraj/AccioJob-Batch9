import class21.LinkedList;

import java.util.Scanner;

public class JavaLinkedLists {
    public static void main(String[] args) {
        // a -> add
        // r -> remove
        // ai -> add at index
        // ri -> remove from index
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int q = sc.nextInt();
        while (q != 0) {
            q--;
            switch (sc.next()) {
                case "a" -> {
                    int value = sc.nextInt();
                    ll.add(value);
                }
                case "r" -> ll.remove();
                case "ai" -> {
                    int index = sc.nextInt();
                    int value = sc.nextInt();
                    ll.add(index, value);
                }
                case "ri" -> {
                    int index = sc.nextInt();
                    ll.remove(index);
                }
            }

            ll.print();
        }
    }
}
