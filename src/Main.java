import java.util.ArrayList;
import java.util.Scanner;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedListt {
    Node head;
    Node tail;

    public LinkedListt() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insert(int value, int index) {
        Node prev = get(index - 1); // 7
        Node temp = prev.next; // 13
        Node newNode = new Node(value); // 1
        if (index == 0) prepend(value);
        if (temp == null) append(value);
        prev.next = newNode; // 13 -> 1
        newNode.next = temp; // 1 -> 7
    }

    public void removeLast() {
        if (head == null) return;
        if (head.next == null) { // Only one element
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
    }

    public void removeFirst() {
        if (head == null) return;
        Node temp = head;
        head = temp.next;
        temp.next = null;
        if (head == null) tail = null;
    }

    public void remove(int index) {
        Node prev = get(index - 1);
        Node temp = prev.next;
        if (index == 0) {
            removeFirst();
            return;
        }
        if (temp == null) {
            removeLast();
            return;
        }
        prev.next = temp.next;
        temp.next = null;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        while (temp != null) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListt finalList = new LinkedListt();
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
