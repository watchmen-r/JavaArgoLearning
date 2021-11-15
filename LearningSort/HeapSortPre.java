package LearningSort;

import java.util.Arrays;

class HeapSort {
    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 1, 3, 7, 5};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void heapSort(int[] array) {
        int n = array.length;

        /** 
         * heapを作成する
         * スタートは[2分の1-1]。これによりスタートの子Nodeは左の2k+1、右の2k+2なので
         * ちょうど配列の一番後ろを指定することになる。
         * iをデクリメントすることで全subtreeを整理することができる
        */
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // 一つずつ取り出す
        for (int i = n - 1; i > 0; i--) {
            // rootに一番大きい数があるので一番後ろに入れる
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;

            heapify(array, i, 0);
        }
    }

    public static void heapify(int array[], int n, int i) {
        // subtreeのrootとなるインデックスを入れる
        int largest = i;
        // subtreeの左は2k+1、右は2k+2
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // 左のnodeがrootより大きい場合
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // 右のノードがrootか左より大きい場合
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // System.out.println(Arrays.toString(array));
        
        // rootが最初の値ではない場合
        if (largest != i) {
            int tmp = array[i];
            array[i] = array[largest];
            array[largest] = tmp;

            heapify(array, n, largest);
        }

    }
}