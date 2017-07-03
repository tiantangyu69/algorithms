package me.flyness.algorithms.sort;

import me.flyness.algorithms.Ints;

/**
 * Created by lizhitao on 2017/6/3.
 * 插入排序
 */
public class InsertionSort implements Sort {


    @Override
    public void sort(int[] array) {

        int j;

        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];

            for (j = i; j > 0 && tmp < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }

            array[j] = tmp;
        }
    }


    public static void main(String[] args) {
        int[] arr = Ints.INT_ARRAY;
        new InsertionSort().sort(arr);

        Ints.printIntArray(arr);
    }
}
