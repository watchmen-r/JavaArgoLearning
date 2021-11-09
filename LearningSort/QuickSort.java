package LearningSort;

import java.util.Arrays;

class QuickSort {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 3, 7, 10, 8};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    /**
     * パーティション分割。今回基準とする値は一番右側の値とする。
     * @param array
     * @param left
     * @param right
     * @return
     */
    static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        // iはpivotより小さい値の境界場所
        int i = left - 1;

        for(int j = left; j < right; j++) {
            if(array[j] <= pivot) {
                i++;
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        // pivotを適切な場所に入れる
        int tmp = array[i+1];
        array[i+1] = array[right];
        array[right] = tmp;

        //partitionの場所を返す 
        return i + 1;
    }

    static void quickSort(int[] array, int left, int right) {
        int partitionIndex;
        if(left < right) {
            partitionIndex = partition(array, left, right);
            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
    }
}