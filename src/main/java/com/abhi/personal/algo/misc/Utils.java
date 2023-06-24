package com.abhi.personal.algo.misc;

public class Utils {

    public static int multiplyOldSchool(int a, int b) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0 ; j < b; j++) {
                sum += 1;
            }
        }
        return sum;
    }
}
