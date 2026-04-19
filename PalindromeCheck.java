/* Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():
*/

package String;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        String input1 = "Madam";
        String input2 = "A man, a plan, a canal: Panama";
        System.out.println("'" + input1 + "' is palindrome? " + isPalindrome(input1));
        System.out.println("'" + input2 + "' is palindrome? " + isPalindrome(input2));
    }
}
