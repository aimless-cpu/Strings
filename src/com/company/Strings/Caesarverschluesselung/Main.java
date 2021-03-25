package com.company.Strings.Caesarverschluesselung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String rerun = "rerun";
        String stringToEncode = null;
        String stringToDecode = null;

        while (rerun.equalsIgnoreCase("rerun")) {

            Scanner sc = new Scanner(System.in);

            if (stringToEncode==null) {
                System.out.println("String?");
                stringToEncode = sc.next();
            }

                System.out.println("encrypt or decrypt?");
                String inputSwitch = sc.next();

                int key;
                char[] output;

                switch (inputSwitch) {
                    case "encrypt":
                        System.out.println("key?");
                        key = sc.nextInt();

                        output = getEncrypt(stringToEncode, key);
                        stringToDecode = new String(output);

                        System.out.println(output);

                        break;

                    case "decrypt":
                        System.out.println("key?");
                        key = sc.nextInt();

                        output = getDecrypt(stringToDecode, key);
                        //stringToEncode = output;

                        System.out.println(output);

                        break;

                    default:
                        System.out.println("nope");

                }

            System.out.println("Type rerun to rerun.");


                rerun = sc.next();


        }

    }


   public static char[] getEncrypt(String stringToEncode, int a) {
        int[] encrypt = new int[stringToEncode.length()];

        for (int i = 0; i< stringToEncode.length(); i++) {

        encrypt[i] = stringToEncode.charAt(i)+a;

    }
        char[] output = new char[stringToEncode.length()];

        for (int j = 0; j< stringToEncode.length(); j++) {
            output[j] = (char)encrypt[j];
        }

        return output;
    }

    public static char[] getDecrypt(String stringToDecode, int a) {
        int[] encrypt = new int[stringToDecode.length()];

        for (int i = 0; i< stringToDecode.length(); i++) {

            encrypt[i] = stringToDecode.charAt(i)-a;

        }

        char[] output = new char[stringToDecode.length()];

        for (int j = 0; j< stringToDecode.length(); j++) {
            output[j] = (char)encrypt[j];
        }

        return output;
    }



}
