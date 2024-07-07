package datastructure.doublylinkedlists;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        if (tail != null) {
            System.out.println("Head: " + head.getValue());
        } else {
            System.out.println("Head: null");
        }
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void getTail() {
        if (tail != null) {
            System.out.println("Tail: " + tail.getValue());
        } else {
            System.out.println("Tail: null");
        }
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void printList() {
        System.out.print("My Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }
}
