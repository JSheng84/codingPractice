package com.jsheng.playground.linkedinCodingInterview;

/**
 * Represents a single Node inside a binary tree
 */
class Node<T extends Comparable<?>> {
    Node<T> _left, _right;
    T _id;

    public Node(T data) {
        this._id = data;
    }
}