package com.andrew.calc;

import com.andrew.Calc;

public class MainCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(2,3));
        System.out.println(calc.div( 20, 2));
    }
}
