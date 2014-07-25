package com.mikemenne.launchcode.hashcodes;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mmenne on 7/25/14.
 */
public class StringHashCodeExample {

    public static final int MAX_STRINGS = 10_000_000;

    public static void main(String[] varArgs) {
        long start = System.currentTimeMillis();
        Set<String> strings = new HashSet<String>();
        for (int i = 0; i < MAX_STRINGS; i++) {
            strings.add(i + "");
        }
        long end = System.currentTimeMillis();
        System.out.println("String HashCode Test\n");
        System.out.println(String.format("Does the list contain 3?\n %s", strings.contains("3") ? "why yes it does" : "nope"));
        System.out.println(String.format("Process took %s seconds", (end - start) / 1000));
    }
}
