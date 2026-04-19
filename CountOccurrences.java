/*Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()
*/

 package String;
 

public class CountOccurrences {
    public static int countOccurrences(String main, String sub) {
        int count = 0, index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String main = "AIET AIET AIET College";
        String sub = "AIET";
        System.out.println("Occurrences of '" + sub + "': " + countOccurrences(main, sub));
    }
}
