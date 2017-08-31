package sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Dave on 2017/8/29
 * Describes
 */
public class MySort {
    /**
     * 冒泡排序
     */
    @Test
    public void sort1() {
        int[] array = {1, 3, 9, 2, 5, 7};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tem = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tem;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 选择排序
     */
    @Test
    public void sort2() {
        int[] array = {1, 3, 9, 2, 5, 7};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    int tem = array[j];
                    array[j] = array[i];
                    array[i] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }





}
