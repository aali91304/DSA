package BinarySearch;
//LEETCODE 680  https://leetcode.com/problems/valid-palindrome-ii/description/
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindromeII solution = new ValidPalindromeII();

        // Test cases
        System.out.println(solution.validPalindrome("aba")); // Output: true
        System.out.println(solution.validPalindrome("abca")); // Output: true
        System.out.println(solution.validPalindrome("abc")); // Output: false
    }
}

