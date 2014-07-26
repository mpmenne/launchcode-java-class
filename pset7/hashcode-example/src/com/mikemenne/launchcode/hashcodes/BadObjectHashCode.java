package com.mikemenne.launchcode.hashcodes;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mmenne on 7/25/14.
 */
public class BadObjectHashCode {

    public static final int MAX_STRINGS = 50_000;

    public static void main(String[] varArgs) {
        long start = System.currentTimeMillis();
        Set<BadObject> badObjects = new HashSet<BadObject>();
        for (int i = 0; i < MAX_STRINGS; i++) {
            badObjects.add(new BadObject(i + ""));
        }
        long end = System.currentTimeMillis();
        System.out.println("BadObject HashCode Test\n");
        System.out.println(String.format("Does the list contain 3?\n %s", badObjects.contains("3") ? "why yes it does" : "nope"));
        System.out.println(String.format("Process took %s seconds", (end - start) / 1000));
    }

    private static class BadObject{
        private String name;

        private BadObject(String name) {
            this.name = name;
        }

        @Override
        public int hashCode() {
            return 1;
        }
    }
}

