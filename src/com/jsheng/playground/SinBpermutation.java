package com.jsheng.playground;

import java.util.HashMap;
import java.util.Scanner;
/*
 * Find all the permutations of s inside of b
 * 0(B*S)
 */
public class SinBpermutation {
    private static void findPerms(String s, String b) {
        if(s.length() > b.length()) {
            System.out.println("Substring can't be longer than main string");
            return;
        }
        HashMap<Character,Integer> sMap = new HashMap<Character, Integer>();
        fillMap(sMap, s.toCharArray());
        for (int i = 0; i < b.length() - s.length() + 1; i++) {
            if(sMap.containsKey(b.charAt(i))) {
                System.out.println(i);
                HashMap<Character, Integer> bMap = new HashMap<Character, Integer>();
                String sTiny = b.substring(i, i + s.length());
                fillMap(bMap, sTiny.toCharArray());
                if(sMap.equals(bMap)) {
                    System.out.println("(" + i + "," + (i + s.length() - 1) + ") " + sTiny);
                }
            }
        }
    }

    private static void fillMap(HashMap<Character, Integer> sMap, char[] s) {
        for(char c: s) {
            if(sMap.containsKey(c)) {
                sMap.put(c, sMap.get(c) + 1);
            } else {
                sMap.put(c, 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Input a String: ");
        String s = input.nextLine();
        System.out.printf("Input a larger String:");
        String b = input.nextLine();
        System.out.println(s + "," + b);
        findPerms(s,b);
        input.close();
    }
}
