package datastructure.doublylinkedlists;

public class Main {
  public static void main(String[] args) {
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
    doublyLinkedList.append(2);
    doublyLinkedList.append(3);
    doublyLinkedList.append(4);
    doublyLinkedList.append(10);
    doublyLinkedList.append(9);

    doublyLinkedList.remove(3);
    doublyLinkedList.printList();

  }
}
