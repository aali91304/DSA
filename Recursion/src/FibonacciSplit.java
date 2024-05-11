import java.util.ArrayList;
import java.util.List;

public class FibonacciSplit {

    public static List<Integer> splitIntoFibonacci(String num) {
        List<Integer> result = new ArrayList<>();
        backtrack(num, result, 0);
        return result;
    }

    private static boolean backtrack(String num, List<Integer> result, int index) {
        if (index == num.length() && result.size() >= 3) {
            return true;
        }

        for (int i = index; i < num.length(); i++) {
            if (num.charAt(index) == '0' && i > index) {
                // Skip if there are leading zeroes in a number
                break;
            }

            long currentNum = Long.parseLong(num.substring(index, i + 1));

            if (currentNum > Integer.MAX_VALUE) {
                // Avoid overflow of integer type
                break;
            }

            int size = result.size();
            if (size >= 2 && currentNum > result.get(size - 1) + result.get(size - 2)) {
                // If the current number is greater than the sum of the last two numbers, no need to continue
                break;
            }

            if (size <= 1 || currentNum == result.get(size - 1) + result.get(size - 2)) {
                // Add the current number to the result and continue the search
                result.add((int) currentNum);
                if (backtrack(num, result, i + 1)) {
                    return true;
                }
                result.remove(result.size() - 1); // Backtrack if the current path doesn't lead to a valid sequence
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(splitIntoFibonacci("1101111")); // Output: [11, 0, 11, 11]
        System.out.println(splitIntoFibonacci("112358130")); // Output: []
        System.out.println(splitIntoFibonacci("0123")); // Output: []
    }
}
