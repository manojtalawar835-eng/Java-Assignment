/*1. Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
    */
package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListIterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        Iterator<String> iterator = list.listIterator(1); // start at index 1 (2nd element)
        System.out.println("Iterating from 2nd element:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
