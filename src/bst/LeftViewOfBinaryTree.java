package bst;

import com.sun.source.tree.Tree;

import java.util.Scanner;

public class LeftViewOfBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            bst.addNode(sc.nextInt());
        }

        bst.printLeftView();
    }
}
