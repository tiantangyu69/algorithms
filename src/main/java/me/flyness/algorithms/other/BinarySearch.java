package me.flyness.algorithms.other;

import me.flyness.algorithms.sort.InsertionSort;
import me.flyness.algorithms.sort.Sort;

/**
 * Created by lizhitao on 2017/6/29.
 * 二分查找
 */
public class BinarySearch {
    private static Sort sort = new InsertionSort();

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

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 34, 55, 66, 77, 88, 99, 100, 120, 333, 500, 678, 777, 789, 999,
                1010, 1111, 1233, 1345, 1566, 2222, 2345, 3333, 4555, 5555, 5666, 5888, 7889, 8888,
                8990, 9000, 9100, 10000, 10001, 10002, 10003, 10004, 10005, 10006, 10007, 10008, 11000,
                11111, 12222, 13111, 15555, 17777, 21111, 22222, 68689, 98989, 888888, 85675675};

        sort.sort(arr);

        System.out.println(index(888888, arr));
    }
}
