package DoubleLinkedList;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    //Create a DLL
    public DoublyNode createDLL(int nodeValue) {
//        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }


    //insert into a DLL
    //0. If link list doesn't exist
    //1. inserting at the beginning
    //2. Inserting at the ending
    //3. Insert anywhere

    public void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = tail;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    //Traverse a Linked List
    public void traverseDLL() {
        if (head == null) {
            System.out.println("DLL does not exist");
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <-> ");

                }
                tempNode = tempNode.next;
            }
            System.out.print("\n");
        }
    }

    // Reverse Traverse
    public void reverseTraverseDLL() {
        if (head == null) {
            System.out.println("DLL does not exist");
        } else {
            DoublyNode tempNode = tail;
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(tempNode.value);
                if (i != 0) {
                    System.out.print(" <-> ");

                }
                tempNode = tempNode.prev;
            }
        }
        System.out.print("\n");
    }

    // Search Node
    public void searchForNode(int nodeValue) {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.value == nodeValue) {
                System.out.println("Value " + nodeValue + " found at index " + i);
            }
            tempNode = tempNode.next;
        }
    }

    // Deletion Method
    public void deleteNodeAtIndex(int index) {
        //Deleting a Node from a Double Linked List
        //0. If link list doesn't exist
        if(this.size == 0){
            System.out.println("Double linked list doesn't exist.");
        } else if (index == 0){ // deleting at the begining
            head = head.next;
            head.prev = null;
            this.size = size -1;
        } else if (index == size - 1){ // deleting at the end
            tail = tail.prev;
            tail.next = null;
            this.size = size -1;
        } else { // deleting anywhere in the list
            if(head.next == null){
                head = tail = null;
                this.size = 0;
            } else if(tail.prev == null){
                head = tail = null;
                this.size = 0;
            } else { // deleting anywhere in the list
                DoublyNode tempNode = head;
                for (int i = 0; i < index; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.prev.next = tempNode.next;
                tempNode.next.prev = tempNode.prev;

                System.out.println("Deleted node value: " + tempNode.value);
                this.size--;
            }
        }

    }

    //     Delete entire DLL
    public void deleteEntireDLL(DoublyLinkedList doublyLinkedList){
        doublyLinkedList.size = 0;
        head = tail = null;
    }

}



