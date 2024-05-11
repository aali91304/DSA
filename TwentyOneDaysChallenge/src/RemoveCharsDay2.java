

public class RemoveCharsDay2 {
    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";
        System.out.println(removeChars(string1, string2)); // Output: "ompuer"

        String string3 = "occurrence";
        String string4 = "car";
        System.out.println(removeChars(string3, string4)); // Output: "ouene"

    }
    static String removeChars(String string1, String string2) {
        // Create a boolean array to mark characters present in string2
        boolean[] mark = new boolean[256];
        int len1 = string1.length();
        int len2 = string2.length();

        // Mark characters from string2
        for (int i = 0; i < len2; i++) {
            mark[string2.charAt(i)] = true;
        }

        StringBuilder result = new StringBuilder();

        // Append characters from string1 that are not present in string2
        for (int i = 0; i < len1; i++) {
            if (!mark[string1.charAt(i)]) {
                result.append(string1.charAt(i));
            }
        }

        return result.toString();
    }
}
