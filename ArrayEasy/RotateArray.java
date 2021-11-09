package ArrayEasy;

class Solution {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2 };
        int k = 2;
        rotate(nums, k);

    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int upNumArray[] = new int[k];
        for(int i = 0; i < k; i++) {
            upNumArray[i] = nums[nums.length - k + i];
        }
        for (int i = 1; i <= nums.length - k; i++) {
            nums[nums.length-i] = nums[nums.length - k - i]; 
        }
        for(int i = 0; i < k; i++) {
            nums[i] = upNumArray[i];
        }
    }
}