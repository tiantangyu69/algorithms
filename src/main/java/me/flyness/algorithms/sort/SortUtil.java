package me.flyness.algorithms.sort;

import me.flyness.algorithms.Ints;

/**
 * Created by lizhitao on 2017/7/3.
 * 排序模板
 */
public class SortUtil {
    private final Sort sort;
    private final int[] array;

    public SortUtil(Sort sort) {
        this.array = Ints.INT_ARRAY;
        this.sort = sort;
    }

    public SortUtil(Sort sort, int[] array) {
        this.array = array;
        this.sort = sort;
    }


    private final boolean less(int num1, int num2) {
        return num1 < num2;
    }

    public SortUtil print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        return this;
    }

    public SortUtil isSorted() {
        boolean flag = true;
        for (int i = 1; i < this.array.length; i++) {
            if (less(this.array[i], this.array[i - 1]))
                flag = false;
        }

        System.out.println("isSorted: " + flag);

        return this;
    }

    public SortUtil sort() {
        this.sort.sort(this.array);
        System.out.println(this.sort.getSortName() + " sort finished.......");
        return this;
    }
}
