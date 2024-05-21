package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class AverageTemp {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of temperatures you will enter: ");
        int numTemps = input.nextInt();
        SingleDimensionArray temps = new SingleDimensionArray(numTemps);
        System.err.println(Arrays.toString(temps.arr));
        
        for (int i=0;i<temps.arr.length; i++){
            System.err.print("Enter temperature " + (i+1) + ": ");
            int temp = input.nextInt();
            temps.arr[i] = temp;
            
        }

        System.err.println("Array: " + Arrays.toString(temps.arr));
        
        // Calculate the Average Temperature...
        int sum = 0;
        for (int temp : temps.arr) {
            sum += temp;
        }
        System.out.println("Sum: " + sum);
        double average = (double)sum / numTemps;
        System.out.println("Average: " + average);
        
        // Given the avarage tempeture, how many of the numbers in the array are above the average temperature?
        int aboveAvg = 0;
        for (int temp : temps.arr) {
            if(temp > average){
                aboveAvg ++;
            }
        }
        System.out.println(aboveAvg + " numbers are above the average temperature.");
        
        input.close();
        
    }
}

//Calculate the avarage temperature, and give how many days are above the average temperature

//  1. take an input from the user (eg 8)
//  2. promt the user to enter all the 8 numbers
//  3. calculate the average temperature
//  4. Given the avarage tempeture, how many of the numbers in line 2 are above the average temperature
