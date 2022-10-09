package com.srikar.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class Strings {
    

    public static void main(String[] args) {
        var string1 = "Test";
        var string2 = "Test";

        System.out.println(string1 == string2);

        String third = new String("Test");
        String fourth = new String("Test");

        System.out.println(third == fourth);

        String fifth = new String("Test").intern();
        String sixth = new String("Test").intern();

        System.out.println(fifth == sixth);
        System.out.println(string1 == sixth);
        System.out.println(string2 == fifth);

        testStringReference(sixth);
        System.out.println(sixth);

        var bytes = "a".getBytes();

        byte[] bString = new byte[]{83, 104, 114, 101, 101, 107, 97, 114};
        var shreekar = new String(bString);

        System.out.println(shreekar);
        for(byte b : bytes) {
            System.out.println(b);
        } 

        mapsTest();
    }

    static void testStringReference(String test) {
        test = test + "1";
    }

    static void mapsTest() {

        Map<Character, Integer> map = new HashMap<>();

        map.put('A', 97);
        map.put('a', 65);

        map.forEach((k, v) -> {
            System.out.println(k + ", " + v);
        });
    }
}
