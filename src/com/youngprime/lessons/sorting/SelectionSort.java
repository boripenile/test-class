package com.youngprime.lessons.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {238, 43, 12, 78, 189, 34, 65, 83, 41, 12};
        array = selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] selectionSort(int[] array) {
        if(array == null || array.length < 2) { return array; }
        int[] arr = new int[array.length];
        int index = 0;
        while (array.length > 0) {
            int minIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            arr[index] = array[minIndex];
            index++;
            array = removeAt(array, minIndex);
        }
        return arr;
    }

    private static int[] removeAt(int[] arr, int index) {
        int[] array = new int[arr.length - 1];
        for(int i = 0; i < array.length; i++) {
            if (i >= index) {
                array[i] = arr[i+1];
            }else{
                array[i] = arr[i];
            }
        }
        return array;
    }
}
