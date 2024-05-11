package BinarySearch;

//LEETCODE 125 https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true; // Empty string or null is considered palindrome
        }

        // Convert the string to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Use binary search to check if the string is a palindrome
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // If characters at current positions don't match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // If all characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        // Test cases
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println("Is \"" + s1 + "\" a valid palindrome? " + solution.isPalindrome(s1));
        System.out.println("Is \"" + s2 + "\" a valid palindrome? " + solution.isPalindrome(s2));
    }
}
