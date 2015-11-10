package com.jsheng.playground.linkedinCodingInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Implement a method to build a tree from a list of parent-child relationships
 * And return the root Node of the tree
 * Child   Parent  IsLeft
 *  15      20      true
 *  19      80      true
 *  17      20      false
 *  16      80      false
 *  80      50      false
 *  50      null    false
 *  20      50      true
 *
 *  You should return the following tree:
 *      50
 *     /  \
 *    20   80
 *   / \   / \
 *  15 17 19 16
 */
public class Question {
    public static Node<Integer> buildTree (List<Relation> data) {
        Node<Integer> head = null;
        HashMap<Integer, Integer> left = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> right = new HashMap<Integer, Integer>();

        for (Relation s: data) {
            if (s._parent == null) {
                head = new Node<Integer>(s._child);
            } else if (s._isLeft) {
                left.put(s._parent, s._child);
            }
            else {
                right.put(s._parent, s._child);
            }
         }

        System.out.println(left);
        System.out.println(right);
        buildTreeMap(head, left, right);
        return head;
    }

    public static void buildTreeMap(Node<Integer> node,
                    HashMap<Integer, Integer> left,
                    HashMap<Integer, Integer> right) {
         if (left.containsKey(node._id)) {
             node._left = new Node<Integer>(left.get(node._id));
         }
         if (right.containsKey(node._id)) {
             node._right = new Node<Integer>(right.get(node._id));
         }
         if (node._left != null) {
             buildTreeMap(node._left, left, right);
         }
         if (node._right != null) {
             buildTreeMap(node._right, left, right);
         }
    }


    public static void main(String[] args) {
        List<Relation> relation = new ArrayList<Relation>();

        relation.add(new Relation(15, 20, true));
        relation.add(new Relation(19, 80, true));
        relation.add(new Relation(17, 20, false));
        relation.add(new Relation(16, 80, false));
        relation.add(new Relation(80, 50, false));
        relation.add(new Relation(50, false));
        relation.add(new Relation(20, 50, true));
        relation.add(new Relation(8, 17, true));

        BTreePrinter.printNode(buildTree(relation));

        Singleton.getSingleton().print();
        Singleton.getSingleton().print();
        Singleton.getSingleton().print();
    }
}