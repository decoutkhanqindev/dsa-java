package datastructure.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(5);
        myLinkedList.prepend(1);
//        myLinkedList.removeLast();
        myLinkedList.removeFirst();
        myLinkedList.printList();
    }
}
