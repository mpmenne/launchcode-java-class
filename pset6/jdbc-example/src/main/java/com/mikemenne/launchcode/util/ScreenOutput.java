package com.mikemenne.launchcode.util;

import com.mikemenne.launchcode.AppOutput;
import org.springframework.stereotype.Service;

/**
 * User: mpmenne
 * Date: 7/3/14
 * Time: 2:04 AM
 */

@Service
public class ScreenOutput implements AppOutput{
    @Override
    public void print(String output) {
        System.out.println(output);
    }
}
