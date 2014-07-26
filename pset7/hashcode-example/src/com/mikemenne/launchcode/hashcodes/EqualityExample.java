package com.mikemenne.launchcode.hashcodes;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: mpmenne
 * Date: 7/25/14
 * Time: 3:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class EqualityExample {

    @Test
    public void doubleEqualsTrueSameExactObject() {
        ExampleClass object1 = new ExampleClass();

        boolean areTheyEqual = (object1 == object1);

        assertTrue(areTheyEqual);
    }

    @Test
    public void doubleEqualsDoesntWorkOnTwoDifferentObjects() {
        ExampleClass object1 = new ExampleClass();
        ExampleClass object2 = new ExampleClass();

        boolean areTheyEqual = (object1 == object2);

        assertFalse(areTheyEqual);
    }

    @Test
    public void equalsMethodLooksAtObjectContents() {
        ExampleClass object1 = new ExampleClass("a");
        ExampleClass object2 = new ExampleClass("a");

        boolean areTheyEqual = (object1.equals(object2));

        assertTrue(areTheyEqual);
    }


    private static class ExampleClass {

        private String name;

        public ExampleClass() {}

        public ExampleClass(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof ExampleClass)) {
                return false;
            }

            return this.name.equals(((ExampleClass) o).getName());
        }
    }
}
