package BinarySearch;
//LEETCODE 153 https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

public class MinimumOfSortedArray {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // If the array is not rotated or has only one element
        if (nums[left] < nums[right]) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the minimum element
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            // Check which part of the array is rotated
            if (nums[mid] >= nums[left]) {
                // Left half is sorted, minimum element is in the right half
                left = mid + 1;
            } else {
                // Right half is sorted, minimum element is in the left half or at mid
                right = mid;
            }
        }

        // If the loop terminates, left and right pointers converge, and the minimum element is at nums[left]
        return nums[left];
    }

    public static void main(String[] args) {
        MinimumOfSortedArray solution = new MinimumOfSortedArray();

        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Example 1: " + solution.findMin(nums1)); // Output: 1

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Example 2: " + solution.findMin(nums2)); // Output: 0

        int[] nums3 = {11, 13, 15, 17};
        System.out.println("Example 3: " + solution.findMin(nums3)); // Output: 11
    }
}
