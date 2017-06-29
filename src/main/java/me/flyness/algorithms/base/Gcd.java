package me.flyness.algorithms.base;

/**
 * Created by lizhitao on 2017/6/29.
 * 欧几里得算法，求最大公约数
 */
public class Gcd {
    public static int gcd(int p, int q) {
        if (q == 0)
            return p;

        int r = p % q;

        return gcd(q, r);
    }

    public static void main(String[] args) {
        System.out.println(gcd(1000, 255));
    }
}
