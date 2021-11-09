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

    // 考えはOK、実装も概ねOK、だがoverflowについて考えられていなかった。
    static int firstBadVersion(int n) {
        int min = 0;
        int max = n;
        int mid = 0;
        while(min != max) {
            // 安直に(max + min /2）をするとoverflowを起こす
            // そのため下記のようにする（普通に計算すれば(max + min /2) と同じになる）
            mid = min + (max - min) / 2;

            // badの場合はbadの最初はmin側にある
            if(isBadVersion(mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

}