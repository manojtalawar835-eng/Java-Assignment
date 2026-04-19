package LinkedList;

import java.util.LinkedList;

public class LinkedListOfferLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        list.offerLast("Pink"); // adds at the end

        System.out.println("LinkedList after adding Pink: " + list);
    }
}
