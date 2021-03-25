package com.company.Strings.Caesarverschluesselung;

public class Main {

    public static void main(String[] args) {

        String input = "hans";

        System.out.println(input.charAt(0));

        //int encrypt = input.charAt(0)+2;
        //System.out.println((char)encrypt);

        int[] encrypt = new int[input.length()];

        for (int i=0;i<input.length();i++) {

            encrypt[i] = input.charAt(i)+2;

        }

        //string buffer is to use

        System.out.println(encrypt.toString());





/*
        char ch = 'a';

        int ascii = ch;
        int newCharacter = ascii + 2;

        // You can also cast char to int
        int castAscii = (int) ch;

        char encryptedChar = (char) newCharacter;
        System.out.println(encryptedChar);
        System.out.println("The ASCII value of " + ch + " is: " + ascii);

 */











    }
}
