package BinarySearch;
//LEETCODE 33  https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
       int right = nums.length - 1;
//
//        // Find the index of the smallest element (the pivot)
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] > nums[right]) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//
//        // Now left is the index of the smallest element (pivot)
//        int pivot = left;
//        left = 0;
//        right = nums.length - 1;
//
//        // Decide which half to perform binary search based on the target and pivot
//        if (target >= nums[pivot] && target <= nums[right]) {
//            left = pivot;
//        } else {
//            right = pivot;
//        }
//
//        // Regular binary search
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        return -1;


        //2nd Approach


        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check which part of the array is sorted
            if (nums[left] <= nums[mid]) {
                // Left half is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // Target is in the left half
                } else {
                    left = mid + 1; // Target is in the right half
                }
            } else {
                // Right half is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }

        return -1; // Target not found
    }
    public static void main(String[] args) {
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Example 1: " + solution.search(nums1, target1)); // Output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println("Example 2: " + solution.search(nums2, target2)); // Output: -1

        int[] nums3 = {1};
        int target3 = 0;
        System.out.println("Example 3: " + solution.search(nums3, target3)); // Output: -1
    }
}
