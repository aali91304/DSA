import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSumDay1 {

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 1};
        int k1 = 6;
        int n1 = arr1.length;

        int[] arr2 = {1, 1, 1, 1};
        int k2 = 2;
        int n2 = arr2.length;

        System.out.println(getPairsCount(arr1, n1, k1)); // Output: 2
        System.out.println(getPairsCount(arr2, n2, k2)); // Output: 6
    }
    static int getPairsCount(int[] arr, int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int complement = k - arr[i];

            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
}
