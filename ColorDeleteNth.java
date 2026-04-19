/* Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index
    */



package ArrayList;

import java.util.ArrayList;

public class ColorDeleteNth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        int n = 2; // Example: delete 3rd element (index 2)
        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("Colors after deleting element at index " + n + ": " + colors);
        } else {
            System.out.println("Invalid index.");
        }
    }
}
