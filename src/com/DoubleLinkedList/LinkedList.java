package com.DoubleLinkedList;

public class LinkedList {
    private Node first;
    private Node last;
    private int count = 0;

    // ✅ Add element at end
    public void add(Object e) {
        if (first == null) {
            first = new Node(e);
            last = first;
        } else {
            Node n = new Node(e, null, last);
            last.next = n;
            last = n;
        }
        count++;
    }

    // ✅ Add element at specific index
    public void add(int index, Object e) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) { // insert at beginning
            Node n = new Node(e, first, null);
            if (first != null) first.prev = n;
            first = n;
            if (last == null) last = n; // if list was empty
            count++;
            return;
        }

        if (index == size()) { // insert at end
            add(e);
            return;
        }

        Node curr = first;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        Node n = new Node(e, curr, curr.prev);
        curr.prev.next = n;
        curr.prev = n;
        count++;
    }

    // ✅ Remove element at specific index
    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) { // remove first
            first = first.next;
            if (first != null) first.prev = null;
            else last = null; // list became empty
            count--;
            return;
        }

        Node curr = first;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        if (curr.next != null)
            curr.next.prev = curr.prev;
        else
            last = curr.prev;

        if (curr.prev != null)
            curr.prev.next = curr.next;

        count--;
    }

    // ✅ Get element by index
    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Node curr = first;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.ele;
    }

    // ✅ Reverse the linked list
    public void reverse() {
        Node curr = first;
        Node temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null) {
            last = first;
            first = temp.prev;
        }
    }

    // ✅ Size of list
    public int size() {
        return count;
    }

    // ✅ String representation
    public String toString() {
        if (size() == 0) return "[]";

        StringBuilder s = new StringBuilder("[");
        Node curr = first;
        while (curr != null) {
            s.append(curr.ele);
            if (curr.next != null) s.append(", ");
            curr = curr.next;
        }
        s.append("]");
        return s.toString();
    }
}
