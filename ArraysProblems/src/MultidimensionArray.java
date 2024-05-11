import java.util.Scanner;
import java.util.Arrays;

public class MultidimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];  // Initialize the array of arrays

        Scanner sc = new Scanner(System.in);

        // Initialize the second dimension arrays
        for (int row = 0; row < arr.length; row++) {
            System.out.print("Enter the number of elements for row " + row + ": ");
            int cols = sc.nextInt();
            arr[row] = new int[cols];
        }

        // Input values for each element
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter value for arr[" + row + "][" + col + "]: ");
                arr[row][col] = sc.nextInt();
            }
        }

        // Print the array
        System.out.println("Array is:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Convert and print the array using Arrays.toString()
      //  System.out.println("Array as a string: " + Arrays.deepToString(arr));

        // Print the array
        System.out.println("Array is:");
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for(int[]a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

