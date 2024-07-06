package datastructure.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(5);
        myLinkedList.append(10);
        myLinkedList.append(9);
        myLinkedList.append(13);
        myLinkedList.append(8);
        myLinkedList.prepend(1);

//        myLinkedList.removeLast();
//        myLinkedList.removeFirst();

//        myLinkedList.set(3, 11);

        myLinkedList.printList();

        System.out.println(myLinkedList.get(6).getValue());

    }
}
