package me.flyness.algorithms.sort;

import me.flyness.algorithms.Ints;

/**
 * Created by lizhitao on 2017/6/3.
 * 插入排序
 */
public class InsertionSort implements Sort {


    @Override
    public void sort(int[] array) {
        sort(array, Direction.LEFT);
    }

    public void sort(int[] array, Direction direction) {
        if (direction == Direction.LEFT) {
            int j;

            for (int i = 1; i < array.length; i++) {
                int tmp = array[i];

                for (j = i; j > 0 && tmp < array[j - 1]; j--) {
                    array[j] = array[j - 1];
                }

                array[j] = tmp;
            }
        } else if (direction == Direction.RIGHT) {
            int j;

            for (int i = 1; i < array.length; i++) {
                int tmp = array[i];

                for (j = i; j > 0 && tmp > array[j - 1]; j--) {
                    array[j] = array[j - 1];
                }

                array[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = Ints.INT_ARRAY;
        new InsertionSort().sort(arr, Direction.LEFT);

        Ints.printIntArray(arr);
    }
}
