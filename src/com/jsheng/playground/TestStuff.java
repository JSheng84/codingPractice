package com.jsheng.playground;

import java.util.Scanner;

public class TestStuff {
    public static void  sumDigit(int i) {
        int sum = 0;
        while(i > 0) {
            sum += i % 10;
            i /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Input integer: ");
        int value = input.nextInt();
        sumDigit(value);
        input.close();
    }
}
