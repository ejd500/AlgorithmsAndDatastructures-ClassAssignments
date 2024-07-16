package Stack;

import java.util.Arrays;

public class StackArrays {
    int [] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The array stack is created with a size of: " + size);
    }

    //Check if it is empty
    public boolean isEmpty(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    //check if stack is Full
    public boolean isFull(){
        if (topOfStack == arr.length -1){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    //implement a push method
    public void push(int value){
        if (isFull()){
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    public void pushCharacter(char character){
        if (isFull()){
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = character;
            topOfStack++;
            System.out.println("The character is successfully inserted");
        }
    }

    // implement pop method
    public void pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty. Cannot pop.");
        } else {
            int value = arr[topOfStack];
            topOfStack--;
            System.out.println("The value " + value + " is successfully popped");
        }
    }

    // implement peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty. Nothing to peek.");
            return -1;
        } else {
            System.out.println(arr[topOfStack] + " is the value at the top of the stack.");
            return arr[topOfStack];
        }
    }

    // implement delete a stack
    public void deleteStack(){
        arr = null;
        topOfStack = -1;
        System.out.println("The stack has been deleted.");
    }

}
