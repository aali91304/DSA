
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // int nums[] = {2, 3, 4, 5, 6};
        //int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(nums));


        String[]str=new String[4];
        for(int i=0;i< str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));

    }

    static int change(int[]num) {
        num[0] = 95;
        return 0;
    }
}


//        System.out.println("before changing ");
//        for(int arr:nums){
//
//            System.out.print(arr+" ");
//        }
//        System.out.println("");
//        change(nums);
//        System.out.println("After changing");
//        for(int arr:nums){
//            //System.out.print(arr+" ");
//
//        }
//    }
//
//
//


//





