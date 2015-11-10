package com.jsheng.playground.crackingCodingInterview;

import java.util.Arrays;
import java.util.HashSet;

import com.jsheng.helpers.LinkedHelpers;
import com.jsheng.helpers.NodeList;

public class Chp2LinkedLists extends AbstractQuestionsTemplate {

    public Chp2LinkedLists() {
        // Initialize
    }

    // ***** Question Methods *****
    public void question2_1(NodeList<Integer> head) {
        startQ(2.1);
        System.out.println("Remove duplicates from an unsorted linked list, also do it with no buffer.\n");

        // Start
        head.print();
        HashSet<Integer> set = new HashSet<Integer>();
        NodeList<Integer> temp = head;
        while (temp != null) {
            set.add(temp.val);
            temp = temp.next;
        }
        System.out.println("\nUsing a HashSet O(n)");
        System.out.println(set);

        LinkedHelpers.removeDuplicates(head);
        System.out.println("Using Brute Force O(n^2)");
        head.print();
    }

    public void question2_2(NodeList<Integer> head, int element) {
        startQ(2.2);
        System.out.println("Find the kth from the last element of a singly linked list.\n");

        // Start
        head.print();
        System.out.println(LinkedHelpers.getKthElement(head, element).val + " is " + element + " from the last element.");
    }

    public void question2_3(NodeList<Integer> head, int element) {
        startQ(2.3);
        System.out.println("Implement an algorithm to delete the " + element + ""
                + " node of a list given only that node.\n");

        // Start
        head.print();
        NodeList<Integer> middle = head;
        for (int i = 1; i < element; i++) {
            middle = middle.next;
        }
        LinkedHelpers.deleteElement(middle);
        head.print();
    }

    public void question2_4(NodeList<Integer> n, int partition) {
        startQ(2.4);
        System.out.println("Partition LL around value " + partition + ", such that all nodes less than x come before."
                + " If x is contained in the list, the values of x only need to be after the elements"
                + " less than x.\n");

        // Start
        n.print();
        LinkedHelpers.partitionList(n, partition).print();
    }

    public void question2_5(NodeList<Character> n) {
        startQ(2.5);
        System.out.println("You have two numbers represented by linked lists. Each node represents a single digit "
                + "and they are in reverse order. Sum them up and add the two numbers together and return a linked list.");

        // Start
        n.print();
        StringBuilder s = new StringBuilder();
        double total = 0;
        char sign = '+';

        while(n != null) {
            if (Character.isDigit(n.val)) {
                s.append(n.val);
            } else {
                total = total + LinkedHelpers.signOperation(total, sign, s.toString());
                s = new StringBuilder();
                switch (n.val) {
                case '+': sign = n.val;
                case '-': sign = n.val;
                case '*': sign = n.val;
                case '/': sign = n.val;
                }
            }
            n = n.next;
        }
        total = LinkedHelpers.signOperation(total, sign, s.toString());
        System.out.println(total);
    }

    public static void main(String[] args) {
        System.out.println("**** Linked Lists questions ****");
        Chp2LinkedLists questions = new Chp2LinkedLists();
        questions.question2_1(LinkedHelpers.createLinkedList(Arrays.asList(3,3,4,2,4,5,2,1,4,5)));
        questions.question2_2(LinkedHelpers.createLinkedList(Arrays.asList(6,5,4,3,6,2)),3);
        questions.question2_3(LinkedHelpers.createLinkedList(Arrays.asList(6,5,4,3,6,2)), 3);
        questions.question2_4(LinkedHelpers.createLinkedList(Arrays.asList(3,5,8,5,10,2,1)), 5);
        questions.question2_5(LinkedHelpers.createLinkedList(Arrays.asList('7','1','6','+','5','9','2','/','2','0')));
    }
}
