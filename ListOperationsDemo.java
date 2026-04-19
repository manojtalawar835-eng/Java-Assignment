/* 1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a
LinkedList to perform the following operations with different functions directed as follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing
elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List size, 9. Iterating
over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
    */




package listdemo;

import java.util.*;

public class ListOperationsDemo {
    public static void main(String[] args) {
        // Initialize ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");
        linkedList.add(2, "Mango");
        System.out.println("\nAfter adding at index:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 3. Adding multiple elements
        arrayList.addAll(Arrays.asList("Pineapple", "Papaya"));
        linkedList.addAll(Arrays.asList("Kiwi", "Guava"));
        System.out.println("\nAfter adding multiple:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 4. Accessing elements
        System.out.println("\nAccess element at index 2 in ArrayList: " + arrayList.get(2));
        System.out.println("Access element at index 3 in LinkedList: " + linkedList.get(3));

        // 5. Updating elements
        arrayList.set(0, "Strawberry");
        linkedList.set(1, "Blueberry");
        System.out.println("\nAfter updating:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 6. Removing elements
        arrayList.remove("Papaya");
        linkedList.remove(2);
        System.out.println("\nAfter removing:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 7. Searching elements
        System.out.println("\nSearching 'Orange' in ArrayList: " + arrayList.contains("Orange"));
        System.out.println("Searching 'Kiwi' in LinkedList: " + linkedList.contains("Kiwi"));

        // 8. List size
        System.out.println("\nArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 9. Iterating over list (for-each loop)
        System.out.println("\nIterating ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("\nUsing Iterator on ArrayList:");
        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("\nAfter sorting:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 12. Sublist
        List<String> subArrayList = arrayList.subList(1, 3);
        List<String> subLinkedList = linkedList.subList(0, 2);
        System.out.println("\nSublist of ArrayList: " + subArrayList);
        System.out.println("Sublist of LinkedList: " + subLinkedList);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("\nAfter clearing:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
