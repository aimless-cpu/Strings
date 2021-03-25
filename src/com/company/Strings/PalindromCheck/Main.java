package com.company.Strings.PalindromCheck;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();


        StringBuilder sb = new StringBuilder(userInput);

        boolean output = isPalindrom(sb);

        System.out.println(output);


    }

    private static boolean isPalindrom(StringBuilder sb) {
        boolean out = sb.toString().equalsIgnoreCase(sb.reverse().toString());
        return out;
    }

}
