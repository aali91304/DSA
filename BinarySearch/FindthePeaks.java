package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class FindthePeaks {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();

        int n = mountain.length;
        int i = 1;

        while (i < n - 1) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peaks.add(i);
            }
            i++;
        }

        return peaks;
    }

    public static void main(String[] args) {
        FindthePeaks solution = new FindthePeaks();

        int[] mountain1 = {2, 4, 4};
        System.out.println("Example 1: " + solution.findPeaks(mountain1)); // Output: []

        int[] mountain2 = {1, 4, 3, 8, 5};
        System.out.println("Example 2: " + solution.findPeaks(mountain2)); // Output: [1, 3]
    }
}
