public class CommonFactors {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int countCommonFactors(int a, int b) {
        int gcdValue = gcd(a, b);
        return countFactors(gcdValue);
    }

    public static int countFactors(int n, int i, int count) {
        if (i > n / 2) {
            return count + 1; // Add 1 for n itself
        }

        if (n % i == 0) {
            count++;
        }

        return countFactors(n, i + 1, count);
    }

    public static int countFactors(int n) {
        return countFactors(n, 1, 0);
    }

    public static void main(String[] args) {
        int a = 12, b = 6;
        System.out.println("Input: a = " + a + ", b = " + b);
        System.out.println("Output: " + countCommonFactors(a, b));

        int x = 25, y = 30;
        System.out.println("Input: a = " + x + ", b = " + y);
        System.out.println("Output: " + countCommonFactors(x, y));
    }
}
