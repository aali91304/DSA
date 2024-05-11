package BinarySearch;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] array1 = {1, 2, 3, 4, 5, 3, 1};
        int target1 = 3;
        MountainArray1 mountainArray1 = new MountainArray1(array1);
        int result1 = solution.findInMountainArray(target1, mountainArray1);
        System.out.println("Example 1: " + result1); // Output: 2

        // Example 2
        int[] array2 = {0, 1, 2, 4, 2, 1};
        int target2 = 3;
        MountainArray1 mountainArray2 = new MountainArray1(array2);
        int result2 = solution.findInMountainArray(target2, mountainArray2);
        System.out.println("Example 2: " + result2); // Output: -1
    }
}

class MountainArray1 {
    private int[] array;

    public MountainArray1(int[] arr) {
        this.array = arr;
    }

    public int get(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }
}

class Solution {
    public int findInMountainArray(int target, MountainArray1 mountainArr) {
        int peakIndex = findPeakIndex(mountainArr);
        int leftResult = binarySearch(mountainArr, target, 0, peakIndex, true);

        if (leftResult != -1) {
            return leftResult;
        }

        return binarySearch(mountainArr, target, peakIndex + 1, mountainArr.length() - 1, false);
    }
    private int findPeakIndex(MountainArray1 mountainArr) {
        int left = 0;
        int right = mountainArr.length() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private int binarySearch(MountainArray1 mountainArr, int target, int left, int right, boolean increasing) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                if (increasing) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (increasing) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }
}