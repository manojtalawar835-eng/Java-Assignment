package LinkedList;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListSwap {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        Collections.swap(list, 0, 2); // swap first (index 0) and third (index 2)

        System.out.println("LinkedList after swapping: " + list);
    }
}
