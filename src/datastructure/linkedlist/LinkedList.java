package datastructure.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        if (head != null) {
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

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        Node temp = head;
        Node pre = head;
        while (temp.getNext() != null) {
            pre = temp;
            temp = temp.getNext();
        }
        tail = pre;
        tail.setNext(null);
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index > length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.setValue(value);
            return true;
        }
        return false;
    }
}
