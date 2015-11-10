package com.jsheng.playground.linkedinCodingInterview;

/**
 * Represents a pair relation between one parent node and one child node inside a binary tree
 * If the _parent is null, it represents the ROOT node
 */
public class Relation {
    public Integer _parent = null;
    public Integer _child = null;
    public boolean _isLeft;

    public Relation(int child, int parent, boolean left) {
        this._parent = parent;
        this._child = child;
        this._isLeft = left;
    }

    public Relation(int child, boolean left) {
        this._child = child;
        this._isLeft = left;
    }
}