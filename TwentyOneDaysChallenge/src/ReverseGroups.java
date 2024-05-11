

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseGroups {

    // Function to reverse every sub-array group of size K
    static void reverseInGroups(ArrayList<Long> arr, int N, int K) {
        for (int i = 0; i < N; i += K) {
            int left = i;
            int right = Math.min(i + K - 1, N - 1);

            while (left < right) {
                // Swap elements at left and right indices
                Collections.swap(arr, left, right);

                // Move indices towards the center
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        int N1 = 5, K1 = 3;
        ArrayList<Long> arr1 = new ArrayList<>(List.of(1L, 2L, 3L, 4L, 5L));
        reverseInGroups(arr1, N1, K1);
        System.out.println(arr1);  // Output: [3, 2, 1, 5, 4]

        int N2 = 4, K2 = 3;
        ArrayList<Long> arr2 = new ArrayList<>(List.of(5L, 6L, 8L, 9L));
        reverseInGroups(arr2, N2, K2);
        System.out.println(arr2);  // Output: [8, 6, 5, 9]
    }

}
