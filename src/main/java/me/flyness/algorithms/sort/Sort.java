package me.flyness.algorithms.sort;

/**
 * Created by lizhitao on 2017/6/3.
 * 排序接口
 */
public interface Sort {
    /**
     * 排序数组
     *
     * @param array
     */
    void sort(int[] array);

    /**
     * 获取排序算法的名称
     *
     * @return
     */
    String getSortName();
}
