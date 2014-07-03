package com.mikemenne.launchcode.util;

import com.mikemenne.launchcode.AppOutput;

/**
 * User: mpmenne
 * Date: 7/3/14
 * Time: 2:04 AM
 */
public class ScreenOutput implements AppOutput{
    @Override
    public void print(String output) {
        System.out.println(output);
    }
}
