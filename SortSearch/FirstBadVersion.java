package SortSearch;

class FirstBadVersion {
    public static void main(String[] args) {

    }

    // 呼び出されるメソッド
    static boolean isBadVersion(int version) {
        return true;
    }

    static int binarySearch(int min, int max) {
        int mid = (min + max) /2;

        
        return mid;
    }

    static int firstBadVersion(int n) {
       
        int left = 1;
        int right = n;

        while(left < right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left+1;

    }

}