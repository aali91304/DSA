package BinarySearch;

public class FindtheMiddleIndexinArray {

         static int findMiddleIndex(int[] nums) {
             int totalSum = 0;

             for (int num : nums) {
                 totalSum += num;
             }

             int leftSum = 0;
             int rightSum = totalSum;

             for (int i = 0; i < nums.length; i++) {
                 rightSum -= nums[i];

                 if (leftSum == rightSum) {
                     return i;
                 }

                 leftSum += nums[i];
             }

             return -1;
        }

        public static void main(String[] args) {
           FindtheMiddleIndexinArray solution = new FindtheMiddleIndexinArray();

            int[]nums = {2, 3, -1, 8, 4};
            int[]nums1 = {1,-1,4};

           System.out.println(solution.findMiddleIndex(nums));
            System.out.print(solution.findMiddleIndex(nums1));
        }
    }


