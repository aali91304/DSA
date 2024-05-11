import java.util.Arrays;

public class MinAndMaxValue {
    public static void main(String[] args) {
        int[][] arr= {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}

        };


        System.out.println(max(arr));
    }
    static int max(int[][]arr){
        int max=Integer.MIN_VALUE;

//        //1ST APPROACH
//        for(int row=0;row< arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                if(arr[row][col]>max){
//                    max=arr[row][col];
//                }
//            }
//        }

        //2ND APPROACH
        for(int[]ints : arr){
            for(int element : ints){
                if(element >max){
                    max=element;
                }
            }
        }
        return max;
    }
}
