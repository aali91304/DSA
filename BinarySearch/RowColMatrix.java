package BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][]matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
//       int target = 39;
//
//       int[] ans = search(matrix,target);
//        if (ans[0] != -1 && ans[1] != -1) {
//            System.out.println("Element present at row: " + ans[0] + ", column: " + ans[1]);
//        } else {
//            System.out.println("Element not found.");
//        }


        System.out.println(Arrays.toString(search(matrix,39)));

    }
    static int[] search(int[][]matrix,int target){
        int row =0;
        int col = matrix.length-1;
        while (row < matrix.length && col >= 0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col] < target){
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }

}
