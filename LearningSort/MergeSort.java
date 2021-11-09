package LearningSort;

import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 3, 7, 10, 8};
        mergeSort(array, array.length, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 
     * @param array ソート対象の配列
     * @param n 配列の数
     * @param left 左の場所
     * @param right 右の場所
     */
    public static void mergeSort(int[] array, int n, int left, int right) {
        if(left+1 < right) {
            int mid = (left + right) / 2;
            mergeSort(array, n, left, mid);
            mergeSort(array, n, mid, right);
            merge(array, n, left, mid, right);
        }
    }

    public static void merge(int[] array, int n, int left, int mid, int right) {
        // 色々初期化
        int leftNum = mid - left;
        int rightNum = right - mid;
        int[] leftArray = new int[leftNum+1];
        int[] rightArray = new int[rightNum+1];
        for(int i = 0; i < leftNum; i++) leftArray[i] = array[i+left];
        for(int i = 0; i < rightNum; i++) rightArray[i] = array[i+mid];
        leftArray[leftNum] = Integer.MAX_VALUE;
        rightArray[rightNum] = Integer.MAX_VALUE;

        // 分割した配列の場所
        int pointerLeft = 0;
        int pointerRight = 0;

        for(int i = left; i < right; i++) {
            if(leftArray[pointerLeft] <= rightArray[pointerRight]) {
                array[i] = leftArray[pointerLeft];
                pointerLeft++;
            } else {
                array[i] = rightArray[pointerRight];
                pointerRight++;
            }
        }
    }
}