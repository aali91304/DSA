public class RotationCountInSortedArray {
    public static int findRotationCount(int[] arr) {
        int n = arr.length;

        // Find the index of the minimum element
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Rotation count is equal to the index of the minimum element
        return minIndex;
    }

    public static void main(String[] args) {
        //Solution solution = new Solution();

        int[] arr1 = {15, 18, 2, 3, 6, 12};
        System.out.println("Output 1: " +findRotationCount(arr1)); // Output: 2

        int[] arr2 = {7, 9, 11, 12, 5};
        System.out.println("Output 2: " +findRotationCount(arr2)); // Output: 4
    }
}
