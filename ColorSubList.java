package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ColorSubList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        List<String> subColors = colors.subList(0, 2); // from index 0 to 2 (exclusive)

        System.out.println("Extracted colors: " + subColors);
    }
}
