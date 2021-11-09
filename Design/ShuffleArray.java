package Design;

import java.util.Random;

class ShuffleArray {

    private int[] nums;
    private Random random;

    public void Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        if(nums == null) return null;
        int[] shuffleNums = nums.clone();
        for(int i = 0; i < shuffleNums.length; i++) {
            int j = random.nextInt(i+1);
            swap(shuffleNums, i, j);
        }
        return shuffleNums;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}