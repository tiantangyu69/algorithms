package me.flyness.algorithms.sort;

import me.flyness.algorithms.sort.impl.InsertionSort;

/**
 * Created by lizhitao on 2017/7/3.
 * 排序
 */
public abstract class AbstractSort implements Sort {

    /**
     * 获取排序算法的名称
     *
     * @return
     */
    public String getSortName() {
        return this.getClass().getSimpleName();
    }


    protected void exchange(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    protected static void run(Sort sort) {
        new SortUtil(sort).isSorted().sort().isSorted().print();
    }
}
