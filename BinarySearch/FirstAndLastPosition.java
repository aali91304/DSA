package BinarySearch;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] ans = searchRange(nums, target);

        // Print the result
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = findStartingPosition(nums, target);
        int end = findEndingPosition(nums, target);

        return new int[]{start, end};
    }

    private static int findStartingPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (start < nums.length && nums[start] == target) {
            return start;
        } else {
            return -1;
        }
    }

    private static int findEndingPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (end >= 0 && nums[end] == target) {
            return end;
        } else {
            return -1;
        }
    }
}
