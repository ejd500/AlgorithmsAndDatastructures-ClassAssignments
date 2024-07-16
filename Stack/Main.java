package Stack;

public class Main {
    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        System.out.println();

        stackArrays.pop();
        stackArrays.peek();

        System.out.println();
        stackArrays.deleteStack();
        stackArrays.peek();


        PalindromeCheck palindromeCheck = new PalindromeCheck("hannah");
        System.out.println();
        System.out.println("Palindrome Check for HANNAH == " + palindromeCheck.bool);
        PalindromeCheck palindromeCheckTwo = new PalindromeCheck("jump");
        System.out.println();
        System.out.println("Palindrome Check for JUMP == " + palindromeCheckTwo.bool);


        System.out.println();
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.peek();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.pop();
        stackLinkedList.peek();
        stackLinkedList.deleteStack();
        stackLinkedList.isEmpty();
        stackLinkedList.peek();

    }
}
