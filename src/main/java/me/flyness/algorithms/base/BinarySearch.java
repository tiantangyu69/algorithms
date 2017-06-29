package me.flyness.algorithms.base;

import me.flyness.algorithms.Ints;
import me.flyness.algorithms.sort.InsertionSort;
import me.flyness.algorithms.sort.Sort;

/**
 * Created by lizhitao on 2017/6/29.
 * 二分查找
 */
public class BinarySearch {
    private static Sort sort = new InsertionSort();

    /**
     * 使用循环实现二分查找
     *
     * @param key
     * @param arr
     * @return
     */
    public static int index(int key, int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            System.out.println("--------left: " + left + " ; right: " + right + " ; middle: " + middle);
            if (key < arr[middle])
                right = middle - 1;
            else if (key > arr[middle])
                left = middle + 1;
            else
                return middle;
        }

        return -1;
    }

    /**
     * 使用递归实现二分查找
     *
     * @param key
     * @param arr
     * @return
     */
    public static int search(int key, int[] arr) {
        return search(key, arr, 0, arr.length - 1);
    }

    public static int search(int key, int[] arr, int left, int right) {
        if (left > right)
            return -1;

        int middle = left + (right - left) / 2;

        if (key > arr[middle])
            return search(key, arr, middle + 1, right);
        else if (key < arr[middle])
            return search(key, arr, left, middle - 1);
        else
            return middle;
    }

    public static void main(String[] args) {
        int[] arr = Ints.SORTED_INT_ARRAY;

        sort.sort(arr);

        System.out.println(index(888888, arr));
        System.out.println(search(888888, arr));
    }
}
