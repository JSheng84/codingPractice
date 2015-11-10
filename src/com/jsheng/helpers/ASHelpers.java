package com.jsheng.helpers;

import java.util.ArrayList;
import java.util.List;

public class ASHelpers {
    private ASHelpers() {
        //Cannot initialize
    }

    public static void findAndReplaceSpaces(char[] input,
            int length,
            char[] replace) {

        int spaces = 0;
        for (int i = 0; i < length - 1; i++) {
            if (input[i] == ' ') {
                spaces++;
            }
        }
        if ((replace.length - 1) * spaces + length != input.length) {
            System.out.println("Character array does not have a big enough buffer. Buffer space: "
                    + (input.length - length));
            return;
        }
        int tempLength = length - 1;
        int i = input.length -1;
        while (i >= 0) {
            if (input[tempLength] == ' ') {
                for (int k = replace.length -1; k >= 0; k--) {
                    input[i] = replace[k];
                    i--;
                }
            } else {
                input[i] = input[tempLength];
                i--;
            }
            tempLength--;
        }

        System.out.println(input);
    }

    public static void uniqueCharacters(String s) {

        int[] asciiArray = new int[128];
        for (char letter : s.toCharArray()) {
            if (asciiArray[letter] == 1) {
                System.out.println(s + ": not unique");
                return;
            }
            asciiArray[letter] = 1;
        }
        System.out.println(s + ": unique");
    }

    public static String isPalindrome(String word) {
        char[] myWord = word.toCharArray();
        int end = myWord.length - 1;
        int start = 0;
        if (myWord.length%2 == 0) {
            while (start <= (myWord.length -1)/2) {
                if(myWord[end] == ' ') {
                    end --;
                } else if (myWord[start] == ' ') {
                    start++;
                } else {
                    if (myWord[start] != myWord[end]) {
                        return "not found";
                    }
                    start++;
                    end--;
                }
            }
        } else {
            while (start < (myWord.length -1)/2) {
                if(myWord[end] == ' ') {
                    end --;
                } else if (myWord[start] == ' ') {
                    start++;
                } else {
                    if (myWord[start] != myWord[end]) {
                        return "not found";
                    }
                    start++;
                    end--;
                }
            }
        }
        return myWord.toString();
    }

    // Insert, remove, replace, can only be one or more or none
    public static void compareStringEdits(String strOne, String strTwo) {

        if ((strOne.length() > (strTwo.length() + 1)) || (strTwo.length() > (strOne.length() +1))) {
            System.out.println(strOne + " -> " + strTwo + ": false");
            return;
        }
        int minSize = strOne.length() < strTwo.length() ? strOne.length() : strTwo.length();
        int differences = strOne.length() == strTwo.length() ? 0:1;
        for (int i = 0; i < minSize; i++) {
            if (strOne.toCharArray()[i] != strTwo.toCharArray()[i] ) {
                differences++;
            }
        } if (differences <= 1) {
            System.out.println(strOne + " -> " + strTwo + ": true");
        } else {
            System.out.println(strOne + " -> " + strTwo + ": false");
        }
    }

    public static void stringCompress(String str) {

        ArrayList<Character> compress = new ArrayList<Character>();
        int times = 0;
        char current = '0';
        char[] strChar = str.toCharArray();
        for(int i = 0; i < strChar.length; i++) {
            if (times == 0) {
                current = strChar[i];
                times++;
            } else if (current == strChar[i]) {
                times++;
            } else if (current != strChar[i]) {
                compress.add(current);
                compress.add(Integer.toString(times).charAt(0));
                current = strChar[i];
                times = 1;
            }
        }
        compress.add(current);
        compress.add(Integer.toString(times).charAt(0));
        if (compress.size() > str.length()) {
            System.out.println(str);
        } else {
            char[] charString = new char[compress.size()];
            int i = 0;
            for (char c : compress) {
                charString[i] = c;
                i++;
            }
            System.out.println(charString);
        }
    }

    public static void rotateNinty(int[][] matrix, int n) {

        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                // top
                int top = matrix[first][i];
                // left -> top
                matrix[first][i] = matrix[last-offset][first];
                // bottom -> left
                matrix[last-offset][first] = matrix[last][last-offset];
                // right -> bottom
                matrix[last][last-offset] = matrix[i][last];
                // top - right
                matrix[i][last] = top;

                for(int k = 0; k < n; k++) {
                    for(int j = 0; j < n; j++) {
                        System.out.print(matrix[k][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("");
            }
        }
    }

    public static void printPrimes(int n){
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        for (int i = 3; i <= n; i = i + 2) {
             boolean isPrime = true;
             for (int j : primes) {
                 if (i % j == 0 ) {
                     isPrime = false;
                     break;
                 }
             }
             if(isPrime) {
                 primes.add(i);
             }
        }
        int spaces = 0;
        System.out.printf("Prime numbers for " + n + ":\n");
        for (int i : primes) {
            if (spaces < 25) {
                System.out.printf(i + " ");
                spaces++;
            } else {
                System.out.printf("\n" + i + " ");
                spaces = 1;
            }
        }
    }

    public static void zeroMatrix(int[][] matrix, int m, int n) {


    }
}
