package com.mikemenne.launchcode.hashcodes;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mmenne on 7/25/14.
 */
public class GoodObjectHashCode {

    public static final int MAX_STRINGS = 100000;

    public static void main(String[] varArgs) {
        long start = System.currentTimeMillis();
        Set<GoodObject> goodObjects = new HashSet<GoodObject>();
        for (int i = 0; i < MAX_STRINGS; i++) {
            goodObjects.add(new GoodObject(i + ""));
        }
        long end = System.currentTimeMillis();
        System.out.println("GoodObject HashCode Test\n");
        System.out.println(String.format("Does the list contain 3?\n %s", goodObjects.contains("3") ? "why yes it does" : "nope"));
        System.out.println(String.format("Process took %s seconds", (end - start) / 1000));
    }

    private static class GoodObject{
        private String name;

        private GoodObject(String name) {
            this.name = name;
        }

        @Override
        public int hashCode() {
            return Integer.parseInt(name);
        }
    }
}

