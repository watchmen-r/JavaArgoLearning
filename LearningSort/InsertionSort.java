package LearningSort;

import java.util.Arrays;

class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 3, 7};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i;
            while(j > 0 && array[j-1] > tmp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = tmp;
        }
    }
}