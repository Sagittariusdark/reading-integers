package com.andrew;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Andrew");
        s1.setAge(35);
        Student s2 = new Student("Andrew",36);
        System.out.println("S1==s2 " + (s1==s2));
        System.out.println("s1.equals(s2)"+ s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.toString());
        System.out.println("s2.toString() = " + s2.toString());

    }
}
