package com.andrew;

import java.util.Locale;
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("My new program");
//        int t = 5, s = 4, v = 7;
//        System.out.println(t > s && t > v || s < v);
//
//        int t1 = 5, s1 = 4, v1 = 7;
//        System.out.println(((t < v) || (s > v)) && (t < s));
//
//
//        System.out.println( (t1 > s1) && (t1 > v1) || (s1 < v1)); // true
//        System.out.println(( (t1 < v1) || (s1 > v1) ) && (t1 < s1) ); // false
        System.out.println("Input you option: Yes or No ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        switch (input) {
            case "yes":
                System.out.println("OK");
                break;
            case "no":
                System.out.println("BAD!");
                break;
            default:
                System.out.println("Fuck You");
        }

    }
}
