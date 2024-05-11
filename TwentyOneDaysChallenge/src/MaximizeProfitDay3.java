

public class MaximizeProfitDay3 {
    public static void main(String[] args) {
        int n = 7;
        int[] prices = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(maximizeProfit(n, prices)); // Output: 6

    }
    static int maximizeProfit(int n, int[] prices) {
        if (n <= 1) {
            return 0; // No profit can be made with one or zero days
        }

        int profit = 0;

        // Iterate through the prices and add up all positive price differences
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
