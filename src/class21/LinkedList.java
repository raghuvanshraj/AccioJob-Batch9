package class21;

import java.util.Scanner;

public class LinkedList {
    Node head;

    // appending to the end of the linked list
    public void add(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }

        Node curr = this.head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new Node(value);
    }

    public void add(int index, int value) {
        Node curr = this.head;
        Node prev = null;
        while (curr != null && index != 0) {
            prev = curr;
            curr = curr.next;
            index--;
        }

        Node node = new Node(value);
        if (prev != null) {
            prev.next = node;
        }
        node.next = curr;
    }

    public void remove() {
        if (this.head == null) {
            return;
        }
        int value = this.head.value;
        this.head = this.head.next;
    }

    public void remove(int index) {
        Node curr = this.head;
        Node prev = null;
        while (curr != null && index != 0) {
            prev = curr;
            curr = curr.next;
            index--;
        }

        if (curr != null) {
            if (prev != null) {
                prev.next = curr.next;
            } else {
                this.head = this.head.next;
            }
        }
    }

    public void remove(Node node) {
        Node curr = this.head;
        Node prev = null;
        while (curr != null && curr != node) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            if (prev != null) {
                prev.next = curr.next;
            } else {
                this.head = this.head.next;
            }
        }
    }

    public void deleteTheMiddleOfTheLinkedList() {
        Node fp = this.head;
        Node sp = this.head;
        while (fp != null && fp.next != null) {
            fp = fp.next.next;
            sp = sp.next;
        }

        this.remove(sp);
    }

    private void _printInReverse(Node curr) {
        if (curr == null) {
            return;
        }
        this._printInReverse(curr.next);
        System.out.print(curr.value + " ");
    }

    public void printInReverse() {
        this._printInReverse(this.head);
    }

    public void print() {
        Node curr = this.head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            ll.add(sc.nextInt());
            n--;
        }

//        ll.deleteTheMiddleOfTheLinkedList();
//        ll.print();

        ll.printInReverse();
    }
}
