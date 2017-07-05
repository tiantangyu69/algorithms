package me.flyness.algorithms.sort.impl;

import me.flyness.algorithms.sort.AbstractSort;
import me.flyness.algorithms.sort.SortUtil;

/**
 * Created by lizhitao on 2017/6/3.
 * 插入排序
 */
public class InsertionSort extends AbstractSort {


    @Override
    public void sort(int[] array) {
        int size = array.length;

        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                exchange(array, j, j - 1);
            }
        }


        /*int j;

        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];

            for (j = i; j > 0 && tmp < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }

            array[j] = tmp;
        }*/
    }

    public static void main(String[] args) {
        new SortUtil(new InsertionSort()).isSorted().sort().isSorted().print();
    }
}
