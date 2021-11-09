package ArrayEasy;

class PlusOne {
    public static void main(String[] args) {
        int digits[] = { 1, 1, 2 };
        plusone(digits);
    }

    public static int[] plusone(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }
}