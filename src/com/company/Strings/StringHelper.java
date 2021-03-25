package com.company.Strings;

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
/*
    public static String printAmountOfLetters(String inputString) {

        inputString = "Der Tag ist schön.";

        //to char[]
        char[] charArray = new char[129];


        //to int[]
        int[] intArray = new int[129];








        return ;


    }

 */






}
