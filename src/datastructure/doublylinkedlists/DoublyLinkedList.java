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
        System.out.print("My Doubly Linked List: null <- ");
        Node temp = head;
        while (temp != null) {
            if (temp.getNext() == null) {
                System.out.print(temp.getValue() + " -> null");
            } else {
                System.out.print(temp.getValue() + " <-> ");
            }
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = temp.getPrev();
            tail.setNext(null);
            temp.setPrev(null);
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = temp.getNext();
            head.setPrev(null);
            temp.setNext(null);
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index == 0 || index >= length) return null;
        Node temp = head;
        if (index < (length / 2)) {
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.getPrev();
            }
        }
        return temp;
    }
}
