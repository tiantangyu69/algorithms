package me.flyness.algorithms.sort.impl;

import me.flyness.algorithms.sort.AbstractSort;

/**
 * Created by lizhitao on 2017/7/3.
 * 选择排序
 */
public class SelectionSort extends AbstractSort {
    @Override
    public void sort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            int min = i;

            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            exchange(array, min, i);
        }
    }

    public static void main(String[] args) {
        run(new SelectionSort());
    }
}
