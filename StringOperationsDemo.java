/*3a. Develop a java program for performing various string operations with different string handling
functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()
*/

package StringOperations;
import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "   Java Programming   ";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // String Searching
        System.out.println("Does str1 contain 'lo'? " + str1.contains("lo"));

        // Substring Operations
        System.out.println("Substring of str2 (0-3): " + str2.substring(0, 3));

        // String Modification
        System.out.println("Replace 'World' with 'Java': " + str2.replace("World", "Java"));

        // Whitespace Handling
        System.out.println("Trimmed str3: '" + str3.trim() + "'");

        // String Concatenation
        String concat = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concat);

        // String Splitting
        String sentence = "AIET is a great place";
        String[] words = sentence.split(" ");
        System.out.println("Splitting sentence:");
        for (String w : words) {
            System.out.println(w);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder result: " + sb);

        // String Formatting
        String formatted = String.format("My name is %s and I am %d years old", "John", 20);
        System.out.println("Formatted string: " + formatted);

        // Validate Email
        String email = "student@aiet.edu";
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
            System.out.println("Valid email: " + email);
        } else {
            System.out.println("Invalid email.");
        }
    }
}

