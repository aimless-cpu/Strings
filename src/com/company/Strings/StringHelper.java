package com.company.Strings;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringHelper {

    /*
    is Palindrom String : boolean
    count Letters String, char : int
    reverse String String : String
    print Amount Of Letters String : char & int
     */

    public static boolean isPalindrom(StringBuilder sb) {
        return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }

    public static int countLetters(String inputString) {
        return  inputString.length()-1;
    }

    public static String reverseString(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        return  sb.reverse().toString();
    }

    public static Set<String> printAmountOfLetters(String input, int[] intArray) {

        Set<String> output = new TreeSet<>();

        for (int i = 0; i< input.length(); i++) {
            int tmp = input.toCharArray()[i];
            intArray[tmp]++;

        }

        for (int j=0; j<129; j++) {

            if (intArray[j] != 0) {
                output.add((char)j + ":" + intArray[j]);
            }

        }


        return output;




    }







}
