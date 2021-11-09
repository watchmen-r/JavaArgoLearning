package LearningMath;

class Eratosthenes {
    public static void main(String[] args) {
        // 1から100までの素数を求める
        int n = 100;
        eratosthenes(n);
    }

    public static void eratosthenes(int n) {
        // boolean 配列の初期値はfalse、今回わかりづらいので全部trueにする
        boolean[] isPrime = new boolean[n+1];
        for(int i = 0; i <= n; i++) isPrime[i] = true;
        isPrime[0] = false;
        isPrime[1] = false;
        double sqrtNum = Math.sqrt(n);

        // nの平方根まで求めれば十分
        for(int i = 2; i <= sqrtNum; i++) {
            if(isPrime[i]) {
                for(int j = i*i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 0; i <= n; i++) {
            if(isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}