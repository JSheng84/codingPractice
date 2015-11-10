package com.jsheng.playground;

import java.util.HashMap;

public class HashInt {

    private HashInt() {
        //Factory class
    }

    public static void hashInt(int[] intArray, HashMap<Integer,Integer> intMap) {
        for(int i: intArray) {
            if(intMap.containsKey(i)) {
                intMap.put(i, intMap.get(i) + 1);
            } else {
                intMap.put(i, 1);
            }
        }
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> intArray2 = new HashMap<Integer,Integer>();
        int[] intArray = {1, 3, 5, 6, 3, 1, 6};

        hashInt(intArray, intArray2);

        for (int j: intArray) {
            if (intArray2.get(j) == 1) {
                System.out.println(j);
            }
        }


    }
}
