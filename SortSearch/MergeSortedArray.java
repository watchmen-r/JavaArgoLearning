package SortSearch;

class ConvertSortedArray {
    public static void main(String[] args) {

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        int[] num1Copy = new int[m];
        for(int i = 0; i < m; i++) {
            num1Copy[i] = nums1[i];
        }

        int mp = 0;
        int np = 0;

        for(int i = 0; i < m+n; i++) {
            if(np >= n || (mp < m && num1Copy[mp] < nums2[np])) {
                nums1[i] = num1Copy[mp++];
            } else {
                nums1[i] = nums2[np++];
            }
        }
    }

}