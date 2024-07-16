package Stack;

import java.util.LinkedList;

//Implement a stack datastructure using LinkedList instead of Arrays

public class StackLinkedList {
    private LinkedList linkedList;
    private int topOfStack;

    public StackLinkedList(){
        this.linkedList = new LinkedList<>();
        this.topOfStack = -1;
        System.out.println("The linked list stack is created.");
    }

    //Check if it is empty
    public boolean isEmpty(){
       return linkedList.isEmpty();
    }

    //implement a push method
    public void push(int value){
        linkedList.add(value);
        topOfStack++;
        System.out.println("The value " + value + " is successfully inserted");
    }

    // implement pop method
    public void pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty. Cannot pop.");
        } else {
            linkedList.pop();
            topOfStack--;
            System.out.println("The value " + linkedList.getLast() + " is successfully popped");
        }
    }

    // implement peek
    public void peek() {
        if (isEmpty()) {
            System.out.println("The linked list stack is empty. Nothing to peek.");
        } else {
            System.out.println(linkedList.peek() + " is the value at the top of the stack.");
        }
    }

    // implement delete a stack
    public void deleteStack(){
        linkedList.clear();
        topOfStack = -1;
        System.out.println("The stack has been deleted.");
    }


}
