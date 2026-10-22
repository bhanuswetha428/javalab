package com.scsvmv.util;

public class MathUtil {
    public static int square(int n) {
        return n * n;
    }

    public static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        System.out.println(MathUtil.square(4));
        System.out.println(MathUtil.cube(3));
    }
}
