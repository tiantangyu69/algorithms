package me.flyness.algorithms.sort.impl;

import me.flyness.algorithms.sort.AbstractSort;

/**
 * Created by lizhitao on 2017/7/5.
 * 希尔排序
 */
public class ShellSort extends AbstractSort {
    @Override
    public void sort(int[] array) {
        int size = array.length;
        int h = 1;
        while (h < size / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < size; i++) {
                for (int j = i; j >= h && array[j] < array[j - 1]; j -= h) {
                    exchange(array, j, j - h);
                }
            }

            h = h / 3;
        }
    }

    public static void main(String[] args) {
        run(new ShellSort());
    }
}
