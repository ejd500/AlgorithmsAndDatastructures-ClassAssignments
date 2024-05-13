package Arrays;


/**
 * 1. insert  into an Array
 * 2. Traverse an Array
 * 3. Delete Array for both (specific value as well as the whole array)
 * 4. Search for an element in an array
 */
import java.util.Arrays;
public class SingleDimensionArray{
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToInsert){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" +  e);
        }
    }

    public void traverseArray(){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            // Can do something to each element
        }     
    }

    public void deleteSpecificIndex(int index){
        int[] newArray = new int[arr.length - 1];
        int newIndex = 0;

        for (int i=0;i<arr.length;i++) {
            if (i != index) {
                newArray[newIndex] = arr[i];
                newIndex++;
            }
        }

        arr = newArray;
    }

    public void deleteWholeArray(){
        int[] newArray = new int[0];
        arr = newArray;
    }

    public void searchForElement(int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.println("index = " + i);
            }
        }
    }

    public static void main(String[] args) {
        //create the object of the class
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(8);
        singleDimensionArray.insert(0,1);
        singleDimensionArray.insert(1,2);
        singleDimensionArray.insert(2,3);
        singleDimensionArray.insert(3,4);
        singleDimensionArray.insert(4,5);
        singleDimensionArray.insert(5,3);
        singleDimensionArray.insert(6,4);
        singleDimensionArray.insert(7,5);
//        System.out.println(singleDimensionArray.toString());
        System.out.println(Arrays.toString(singleDimensionArray.arr));
        System.out.println("Traversed Array: ");
        singleDimensionArray.traverseArray();
        System.out.println("Search for 5: ");
        singleDimensionArray.searchForElement(5);
        System.out.println("Delete specific index (i.e. index 0): ");
        singleDimensionArray.deleteSpecificIndex(0);
        System.out.println(Arrays.toString(singleDimensionArray.arr));
        singleDimensionArray.deleteWholeArray();
        System.out.println(Arrays.toString(singleDimensionArray.arr));

    }
}
