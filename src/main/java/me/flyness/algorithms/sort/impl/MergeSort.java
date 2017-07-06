package me.flyness.algorithms.sort.impl;

import me.flyness.algorithms.Ints;
import me.flyness.algorithms.sort.AbstractSort;

/**
 * Created by lizhitao on 2017/7/6.
 * 归并排序
 */
public class MergeSort extends AbstractSort {
    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    public void mergeSort(int[] array, int left, int right) {
        if (left >= right)
            return;

        int middle = left + (right - left) / 2;

        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);
        merge(array, left, middle, right);
    }

    public void merge(int[] array, int left, int middle, int right) {
        int i = left;
        int j = middle + 1;

        System.out.println(i + " :: " + j + " :: " + right);
        int[] aux = new int[array.length];

        for (int k = left; k <= right; k++) {
            aux[k] = array[k];
        }

        System.out.print("aux: ");
        Ints.print(aux);

        for (int k = left; k <= right; k++) {
            if (i > middle)
                array[k] = aux[j++];
            else if (j > right)
                array[k] = aux[i++];
            else if (aux[j] < aux[i])
                array[k] = aux[j++];
            else
                array[k] = aux[i++];
        }


        Ints.print(array);
        System.out.println();
    }

    public static void main(String[] args) {
        run(new MergeSort(), new int[]{399, 43, 5, 999, 888, 56, 9999, 9});
    }
}
