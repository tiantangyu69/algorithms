package me.flyness.algorithms.sort.impl;

import me.flyness.algorithms.sort.AbstractSort;

/**
 * Created by lizhitao on 2017/7/5.
 * 希尔排序
 */
public class ShellSort extends AbstractSort {
    @Override
    public void sort(int[] array) {
        int step = 3;
        int size = array.length;
        int h = 1;
        while (h < size / step) {
            h = step * h + 1;
            System.out.println("h: " + h);
        }

        while (h >= 1) {
            for (int i = h; i < size; i++) {
                for (int j = i; j >= h && array[j] < array[j - 1]; j -= h) {
                    exchange(array, j, j - h);
                }
            }

            System.out.println("-----------------h: " + h);
            h = h / step;

            return;
        }
    }

    public static void main(String[] args) {
//        run(new ShellSort());

        run(new ShellSort(), new int[]{25, 6, 7, 48, 5, 99, 88, 10, 16, 29});
    }
}
