package DoubleLinkedList;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertDLL(1, 0);
        doublyLinkedList.insertDLL(2, 1);
        doublyLinkedList.insertDLL(3, 2);

        doublyLinkedList.traverseDLL();
        doublyLinkedList.reverseTraverseDLL();
        doublyLinkedList.searchForNode(3);
        doublyLinkedList.deleteNodeAtIndex(1);
        doublyLinkedList.traverseDLL();
        System.out.println("Size = " + doublyLinkedList.size);
        doublyLinkedList.deleteEntireDLL(doublyLinkedList);
        doublyLinkedList.traverseDLL();
        System.out.println("Size = " + doublyLinkedList.size);
    }
}
