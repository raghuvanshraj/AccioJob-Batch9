package bst;

import java.util.Scanner;

public class MinimumElementInBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            bst.addNode(sc.nextInt());
        }

        System.out.println(bst.minimumValue());
    }
}
