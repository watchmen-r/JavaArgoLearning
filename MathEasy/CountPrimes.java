package MathEasy;

class CountPrimes {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        // 2は判定に含まないので(strictly less than)
        if(n <= 2) {
            return 0;
        }

        // エラトステネスの篩
        // boolean 配列の初期値はfalse
        boolean[] notPrimeNumber = new boolean[n];
        double sqrtNum = Math.sqrt(n);
        for(int i = 2; i <= sqrtNum; i++ ) {
            if(notPrimeNumber[i] == false) {
                for(int j = i*i; j < n; j+= i) {
                    notPrimeNumber[j] = true;
                }
            }
        }

        int count = 0;
        for(int i = 2; i < n; i++) {
            if(!notPrimeNumber[i]) {
                count++;
            }
        }
        return count;
    }
}