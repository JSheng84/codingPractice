package com.jsheng.helpers;

public class NodeList<T> {
    public NodeList<T> next = null;
    public T val;

    public NodeList(T t) {
        val = t;
    }

    public void appendToTail(T d) {
        NodeList<T> end = new NodeList<T>(d);
        NodeList<T> n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void print() {
        NodeList<T> n = this;

        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
        System.out.println();
    }

    public T get(int element) {
        NodeList<T> n = this;
        for (int i = 0; i < element; i++) {
            n = n.next;
        }
        return n.val;
    }

    public int length() {
        NodeList<T> n = this;
        int i = 0;
        while (n != null) {
            i = i + 1;
            n = n.next;
        }

        return i;
    }
}