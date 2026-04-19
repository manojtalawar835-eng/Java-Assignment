/* 2. Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList
    */


package ArrayList;

import java.util.ArrayList;

public class ColorRemove {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove color "Blue" if present
        colors.remove("Blue");

        System.out.println("Colors after removal: " + colors);
    }
}
