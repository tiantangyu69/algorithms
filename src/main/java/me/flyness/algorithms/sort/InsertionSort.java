package me.flyness.algorithms.sort;

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
        int[] arr = new int[]{13333, 323423422, 253, 2223, 52, 350, 24663, 42, 35, 233, 5, 235, 1, 3534, 49995, 45, 3, 64, 56, 456};
        new InsertionSort().sort(arr, Direction.LEFT);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
