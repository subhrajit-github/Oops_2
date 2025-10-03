package com.ListImplementation;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // 1. Add elements (append)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Initial List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 2. Add element at index
        list.add(2, "Grapes"); // Insert at index 2
        System.out.println("\nAfter inserting Grapes at index 2:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 3. Get element
        System.out.println("\nElement at index 3: " + list.get(3));

        // 4. Remove element
        list.remove(1); // Remove "Banana"
        System.out.println("\nAfter removing element at index 1:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 5. Add more elements to trigger resize
        list.add("Papaya");
        list.add("Pineapple");
        list.add("Watermelon");

        System.out.println("\nAfter adding more elements (check resize):");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 6. Size of the list
        System.out.println("\nFinal Size of list: " + list.size());
    }
}
