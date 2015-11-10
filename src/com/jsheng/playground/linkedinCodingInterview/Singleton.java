package com.jsheng.playground.linkedinCodingInterview;

import java.util.ArrayList;

public class Singleton {
    private static Singleton instance = null;
    private static ArrayList<Integer> singleIter = new ArrayList<Integer>();

    private Singleton() {
        singleIter.add(1);
        // Cannot Instantiate
    }

    public static Singleton getSingleton() {
        if (instance == null) {
            instance = new Singleton();
        } else {
            singleIter.set(0, singleIter.get(0) + 1);
        }

        return instance;
    }

    public void print() {
        System.out.println(singleIter);
    }

}
