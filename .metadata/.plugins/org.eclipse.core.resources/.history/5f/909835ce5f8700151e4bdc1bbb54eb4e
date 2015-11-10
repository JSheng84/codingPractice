package com.jsheng.playground;

import java.io.IOException;
import java.util.Scanner;

public class LookSay {

    private LookSay() {
        // can't do anything
    }

    public static String lookandsay(String number){
        StringBuilder result= new StringBuilder();

        char repeat= number.charAt(0);
        number= number.substring(1) + " ";
        int times= 1;

        for(char actual: number.toCharArray()){
            if(actual != repeat){
                result.append(times + "" + repeat);
                times= 1;
                repeat= actual;
            }else{
                times+= 1;
            }
        }
        return result.toString();
    }

    public static String lookAndSay2(String num, String number) {
        for (int i=1; i < Integer.parseInt(number); i++) {
            num = lookandsay(num);
        }
        return num;
    }

    public static void main(String[] args) throws IOException{
        Scanner inputReader = new Scanner(System.in);
        System.out.printf("Insert an seed: ");
        String num = String.valueOf(inputReader.nextInt());
        System.out.printf("Insert an integer: ");
        String number = String.valueOf(inputReader.nextInt());
        String seed = num;

        for (int i=1;i<=Integer.parseInt(number);i++) {
            System.out.println("For Iteration " + i + ": " + seed);
            seed = lookandsay(seed);
        }

        num = lookAndSay2(num, number);
        System.out.println("For Number: " + number + "\n" + "Look and Say value: " + num);
        inputReader.close();
    }
}
