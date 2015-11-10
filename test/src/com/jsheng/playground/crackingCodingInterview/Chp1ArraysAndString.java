package com.jsheng.playground.crackingCodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.jsheng.helpers.ASHelpers;
import com.jsheng.helpers.Pair;
import com.jsheng.playground.StringPermutation;

public class Chp1ArraysAndString extends AbstractQuestionsTemplate {

    public Chp1ArraysAndString() {
        // Initialize
    }

    // ***** Question Methods *****
    public void question1_1(String[] testArray) {
        startQ(1.1);
        System.out.println("Question: Implement an Algorithm to determine if a string is"
                + " all unique characters, no other data structures. \n");

        // Start
        for(String s: testArray) {
            ASHelpers.uniqueCharacters(s);
        }
    }

    public void question1_2(List<Pair<String, String>> myList) {
        startQ(1.2);
        System.out.println("Question: Given two strings, write a method to decide"
                + " if one is a permutation of the other\n");

        for(Pair<String,String> s : myList) {
            ASHelpers.isPerm(s.getLeft(), s.getRight());
        }
    }

    public void question1_3(String input,
                    int length,
                    String replacement) {

        startQ(1.3);
        System.out.println("Question: Replace all spaces in " + input +
                " with " + replacement + ". Use a character array.\n");

        // Start
        System.out.println("Input:" + input);
        ASHelpers.findAndReplaceSpaces(input.substring(1, input.length() - 1).toCharArray(),
                length,
                replacement.toCharArray());
    }

    public void question1_4(String input) {
        startQ(1.4);
        System.out.println("Question: Given a string, write a function to check if it is a permutation"
                + " of a palindrome and is not case sensitive.");

        // Start
        System.out.println("Input: " + input);
        String lowerInput = input.toLowerCase();

        ArrayList<String> perms = StringPermutation.permutation(lowerInput);
        HashMap<String, Integer> myPerms = new HashMap<String, Integer>();
        for (String i : perms) {
            if (ASHelpers.isPalindrome(i)) {
                if (myPerms.containsKey(i)) {
                    myPerms.put(i, myPerms.get(i) + 1);
                }
                myPerms.put(i, 1);
            }
        }
        if (myPerms.isEmpty()) {
            System.out.println("No permutations found.");
        } else {
            System.out.println("Found permutations: " + myPerms.size());
            if (myPerms.size() > 5) {
                System.out.print("First five permutations found: ");
                int i = 1;
                for (String s: myPerms.keySet()) {
                    System.out.println(s);
                    if (i == 5) {
                        break;
                    }
                    i++;
                }
            } else {
                for (String s: myPerms.keySet()) {
                    System.out.println(s);
                }
            }
        }
    }

    public void question1_5(String testString, List<String> results) {
        startQ(1.5);
        System.out.println("There are three types of edits that can be performed on strings: "
                + "insert a character, remove a character or replace a character. Given two strings,\n"
                + "write a function to check if they are one edit (or zero edits) away.\n");

        // Start
        System.out.println("String one: " + testString);
        System.out.println("String two choices: " + results);

        for (String s : results) {
            ASHelpers.compareStringEdits(testString, s);
        }
    }

    public void question1_6(List<String> inputs) {
        startQ(1.6);
        System.out.println("Implement string compression using the counts of repeated characters"
                + "if your string isn't smaller return the original string.\n");

        //Start
        System.out.println("My Inputs:" + inputs);
        for (String s: inputs) {
            ASHelpers.stringCompress(s);
        }
    }

    public void question1_7(int n) {
        startQ(1.7);
        System.out.println("Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, "
                + "write a method to rotate the image by 90 degrees. Can you do this in place?\n");

        //start
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = i + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        ASHelpers.rotateNinty(matrix, n);

    }

    public void question1_8(int m, int n) {
        startQ(1.8);
        System.out.println("Write an algorithm such that if an element in a MxN matrix is 0,"
                + " its entire row and column are set to 0\n");

        // Start
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = i + 1;
                if(i + j == 3) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        ASHelpers.zeroMatrix(matrix, m, n);
    }

    public void question1_9() {
        startQ(1.9);
        System.out.println("Assume you have a method isSubstring, given two strings s1 s2, check if s2 is a rotation"
                + " of s1 using only one call to isSubstring (e.g. \"waterbottle\" is a rotation of \"erbottlewat\"\n");

        // Start
        System.out.println("Double s1 and see if s2 is a substring.");
    }

    // ***** Main *****
    public static void main(String[] args) {

    	// ***** Constants *****
    	ArrayList<Pair<String,String>> q2 = new ArrayList<Pair<String,String>>();
    	q2.add(new Pair<String,String>("tac", "cat"));
    	q2.add(new Pair<String,String>("furniture", "turniefur"));
    	q2.add(new Pair<String,String>("rest", "resturant"));
    	q2.add(new Pair<String,String>("dog", "cat"));
    System.out.println("**** Strings and Arrays questions ****");
    Chp1ArraysAndString questions = new Chp1ArraysAndString();
    questions.question1_1(new String[]{"cat", "hat", "piccolo", "fantastic"});
    questions.question1_2(q2);
    questions.question1_3("\"Mr John Smith    \"", 13, "%20");
    questions.question1_4("Taco Cat");
    questions.question1_5("pale", Arrays.asList("pale", "pales", "laep", "dinasour", "pal", "bale"));
    questions.question1_6(Arrays.asList("aabccccaaa", "abc", "easyasonetwothree", "eeeeappeezzee"));
    questions.question1_7(5);
    questions.question1_8(5, 4);
    questions.question1_9();
    }
}
