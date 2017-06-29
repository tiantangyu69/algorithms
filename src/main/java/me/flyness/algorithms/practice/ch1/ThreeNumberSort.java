package me.flyness.algorithms.practice.ch1;

/**
 * Created by lizhitao on 2017/6/29.
 */
public class ThreeNumberSort {
    public static void sort(int a, int b, int c) {
        if (a > b) {
            int t;
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            int t;
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            int t;
            t = b;
            b = c;
            c = t;
        }

        System.out.println(a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        sort(1, 2, 3);
        sort(1, 3, 2);
        sort(2, 1, 3);
        sort(2, 3, 1);
        sort(3, 2, 1);
        sort(3, 1, 2);
    }
}
