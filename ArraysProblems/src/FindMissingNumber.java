//Find the missing number in sorted Array.

import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //9
        int[] nums = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Array is :");
        for (int num : nums) {
            System.out.print(num + " ");  //{1,2,3,4,5,7,8,9}
        }
        System.out.println();
        int result = missingNumber(nums, n + 1);
        System.out.println("Missing number: " + result);  //6
    }

    public static int missingNumber(int[] nums, int n) {
        int res = 0;
        int sum = (n * (n - 1) / 2); //formula for sum
        //int sum = (n * (n + 1) / 2); // Corrected formula for sum

        System.out.println("Expected sum: " + sum);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Adding " + nums[i] + " to res");
            res += nums[i];
        }
        System.out.println("Actual sum: " + res);
        return sum - res;
    }
}
