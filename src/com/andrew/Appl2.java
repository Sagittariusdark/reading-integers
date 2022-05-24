package com.andrew;

public class Appl2 {
    public static void main(String[] args) {
        int x = 5;
        int a = 5;
//        int sum = ++x + a;
//        System.out.println(sum);
        int res = x++ + a;
        System.out.println(res);
        System.out.println(res+x);
    }
}
