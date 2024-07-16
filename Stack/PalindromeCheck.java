package Stack;

public class PalindromeCheck {
    boolean bool;

    public PalindromeCheck(String word){
        int size = word.length();
        System.out.println();
        StackArrays stackArray = new StackArrays(size);

        for (int i = 0; i < size; i++) {
            char character = word.charAt(i);
            stackArray.pushCharacter(character);
        }
        // Check if the characters match from start to end
        int matchCount = 0;
        for (int i=0;i<size;i++){
            if(stackArray.arr[i] == stackArray.arr[stackArray.topOfStack - i]){
                System.out.println("letter match");
                matchCount ++;
            } else {
                System.out.println("letter does NOT match");
            }
        }

        if(matchCount == size){
            this.bool = true;
            System.out.println(word + " IS a palindrome.");
        } else {
            this.bool = false;
            System.out.println(word + " is NOT a palindrome.");
        }

    }

}