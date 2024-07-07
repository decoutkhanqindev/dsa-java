package datastructure.doublylinkedlists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(10);
        doublyLinkedList.printList();

        System.out.println(doublyLinkedList.removeLast().getValue());
        doublyLinkedList.printList();
    }
}
