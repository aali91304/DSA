public class CheckArraySortedOrNot {

    //LEETCODE 1752 https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        // Count the number of elements that are not in ascending order
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        CheckArraySortedOrNot solution = new CheckArraySortedOrNot();

        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Example 1: " + solution.check(nums1)); // Output: true

        int[] nums2 = {2, 1, 3, 4};
        System.out.println("Example 2: " + solution.check(nums2)); // Output: false

        int[] nums3 = {1, 2, 3};
        System.out.println("Example 3: " + solution.check(nums3)); // Output: true

        int[] nums4 = {1, 1, 1};
        System.out.println("Example 4: " + solution.check(nums4)); // Output: true
    }
}
