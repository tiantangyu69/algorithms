package me.flyness.algorithms.sort;

/**
 * Created by lizhitao on 2017/6/3.
 * 排序接口
 */
public interface Sort {
    enum Direction {LEFT, RIGHT}

    void sort(int[] array);

    void sort(int[] array, Direction direction);
}
