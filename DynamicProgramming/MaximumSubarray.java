package DynamicProgramming;

class MaximumSubarray {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(array));
    }

    // 解きなおし
    static int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int num = nums[i];

            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }
        return maxSubarray;
    }
}