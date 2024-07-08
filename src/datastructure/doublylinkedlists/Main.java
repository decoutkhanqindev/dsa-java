package datastructure.doublylinkedlists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.insert(2, 3);

        doublyLinkedList.printList();

    }
}
