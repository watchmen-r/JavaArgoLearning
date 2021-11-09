package LearningSort;

import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 3, 7};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int minNumPlace = 0;
        for(int i = 0; i < array.length; i++) {
            minNumPlace = i;
            for(int j = i; j < array.length; j++) {
                minNumPlace = array[minNumPlace] > array[j] ? j : minNumPlace;
            }
            int tmp = array[i];
            array[i] = array[minNumPlace];
            array[minNumPlace] = tmp;
        }
    }
}