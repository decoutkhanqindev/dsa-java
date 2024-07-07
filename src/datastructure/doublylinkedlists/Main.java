package datastructure.doublylinkedlists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(10);
        doublyLinkedList.getHead();
//        doublyLinkedList.getTail();
//        doublyLinkedList.getLength();

        doublyLinkedList.printList();
    }
}
