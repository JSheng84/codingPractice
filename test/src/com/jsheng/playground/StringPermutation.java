package com.jsheng.playground;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPermutation {

    public static ArrayList<String> permutation(String str) {
        ArrayList<String> myPerms = new ArrayList<String>();
        permutation(str, "", myPerms);
        return myPerms;
    }

    public static void permutation(String str,
                    String prefix,
                    ArrayList<String> perms) {
        if(str.length() == 0) {
            perms.add(prefix);
        } else {
            for(int i = 0; i < str.length(); i++) {
                String rem = str.substring(0,i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i), perms);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Input a String: ");
        String myString = input.nextLine();
        input.close();
        ArrayList<String> permList = permutation(myString);
        System.out.println(permList);
    }
}
