//Q3) write a java program to calculate the sum of all the elements in an integer array

public class q3 {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate the sum
        int sum = 0;
         for (int i = 0; i < numbers.length; i++) {
             sum += numbers[i];
         }

// Print the result
         System.out.println("Sum of the array elements: " + sum);
     }
 }

