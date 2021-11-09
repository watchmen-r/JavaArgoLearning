package LearningSort;

import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 3, 7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int tmp = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < array.length - i; j++) {
                if(array[j-1] > array[j]) {
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
    }
}