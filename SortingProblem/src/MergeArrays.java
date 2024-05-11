import java.util.Arrays;

public class MergeArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        // Concatenate the two arrays
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        // Sort the merged array
        Arrays.sort(mergedArray);

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 7, 2, 9};
        int[] arr2 = {5, 4, 8, 6};

        int[] mergedArray = merge(arr1, arr2);

        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
    }
}
