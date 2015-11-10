package com.jsheng.playground;

/*
@author jsheng
* 1 11 21 1211 111221 312211 13112221 1113213211
* 4 14 1114 3114
* repeater + number
*/
class Solution {

  public static String lookSay (String number) {
    if (number.length() > 1) {
      StringBuilder returnNumber = new StringBuilder();
      char value = number.charAt(0);
      String remainder = number.substring(1);
      int repeater = 1;

      for (char k : remainder.toCharArray()) {
        if (k == value) {
            repeater = repeater + 1;
        } else {
          returnNumber.append(repeater + "" + value);
          value = k;
        }
      }

      returnNumber.append(repeater + "" + value);

      return returnNumber.toString();

      }
    return "1" + number;
  }

  public static void main(String[] args) {

    int times = 3;
    String number = "1";


    for(int i = 0; i <= times; i++) {
      number = lookSay(number);
    }

    System.out.println(number);
  }
}

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */