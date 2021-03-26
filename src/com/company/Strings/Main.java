package com.company.Strings;

import java.util.HashSet;
import java.util.Set;

import static com.company.Strings.StringHelper.*;

public class Main {

    public static void main(String[] args) {

        /*StringBuilder sb = new StringBuilder("anna");
        boolean output = isPalindrom(sb);
        System.out.println(output);

        String inputString = "katze";
        int output = countLetters(inputString);
        System.out.println(output);

        String inputString = "katze";
        String output = reverseString(inputString);
        System.out.println(output);
*/
        String input = "Strings can suck my ...++++!!!!";
        int[] intArray = new int[129];

        Set<String> output = printAmountOfLetters(input, intArray);
        System.out.println(output);




    }


}
