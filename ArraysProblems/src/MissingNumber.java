import java.util.Arrays;

// leetcode -268 https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[]nums1 = {3,0,1};
        System.out.println(solution.missingNumber(nums1)); //2

        int[]nums2 = {0,1};
        System.out.println(solution.missingNumber(nums2));  //2
        int[]nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(solution.missingNumber(nums3));  //8


    }
}
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int total = (n*(n+1))/2;
        for(int i=0; i< n;i++){
            total -= nums[i];
        }
        return total;

    }
}
