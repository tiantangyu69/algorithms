package me.flyness.algorithms.sort;

import me.flyness.algorithms.Ints;

/**
 * Created by lizhitao on 2017/7/3.
 * 选择排序
 */
public class SelectionSort implements Sort {
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

    /**
     * 交换
     *
     * @param array
     * @param min
     * @param i
     */
    private void exchange(int[] array, int min, int i) {
        int tmp = array[i];
        array[i] = array[min];
        array[min] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = Ints.INT_ARRAY;
        new SelectionSort().sort(arr);

        Ints.printIntArray(arr);
    }
}
