package com.jsheng.helpers;

import java.util.List;

public class LinkedHelpers {
    private LinkedHelpers() {
        // Cannot Initialize
    }

    // Creates a linked list and returns the head
    public static <T> NodeList<T> createLinkedList(List<T> list) {
        NodeList<T> head = new NodeList<T>(list.get(0));
        NodeList<T> n = head;
        for (int i = 1; i <= list.size() - 1; i ++) {
            n.next = new NodeList<T>(list.get(i));
            n = n.next;

        }
        return head;
    }

    public static void removeDuplicates(NodeList<Integer> head) {
        NodeList<Integer> temp = head;
        while (temp != null) {
            NodeList<Integer> temp2 = temp.next;
            int value = temp.val;
            NodeList<Integer> prev = temp;
            while (temp2 != null) {
                if (!(value == temp2.val)) {
                    prev = temp2;
                } else {
                    prev.next = temp2.next;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
    }

    public static <T> NodeList<T> getKthElement(NodeList<T> n, int element) {
        NodeList<T> p1 = n;
        NodeList<T> p2 = n;
        for ( int i = 1; i <= element; i++) {
            p2 = p2.next;
        }
        while (p2.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        return p1;
    }

    public static <T> void deleteElement(NodeList<T> middle) {
        middle.val = middle.next.val;
        middle.next = middle.next.next;
    }

    public static NodeList<Integer> partitionList(NodeList<Integer> n, int partition) {
        NodeList<Integer> head = n;
        NodeList<Integer> tail = n;

        while (n != null) {
            NodeList<Integer> next = n.next;
            if (n.val < partition) {
                n.next = head;
                head = n;
            } else {
                tail.next = n;
                tail = n;
            }
            n = next;
        }
        tail.next = null;
        return head;
    }

    public static double signOperation(double total, char sign, String s) {
        if (sign == '+') {total = total + Integer.parseInt(s);}
        if (sign == '-') {total = total - Integer.parseInt(s);}
        if (sign == '*') {total = total + Integer.parseInt(s);}
        if (sign == '/') {total = total / Integer.parseInt(s);}
        return total;
    }
}
