public class AddDigits {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        return addDigits(sumOfDigits(num));
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        AddDigits solution = new AddDigits();

        int num1 = 383;
        System.out.println("Input: " + num1);
        System.out.println("Output: " + solution.addDigits(num1));

        int num2 = 1234;
        System.out.println("Input: " + num2);
        System.out.println("Output: " + solution.addDigits(num2));
    }
}
