package DynamicProgramming;

class MaximumSubarray {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(array));
    }

    static int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int currentSubArray = nums[0];
        int maxSubArray = nums[0];
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];

            currentSubArray = Math.max(num, currentSubArray + num);
            maxSubArray = Math.max(maxSubArray, maxSubArray + currentSubArray);
        }
        return maxSubArray;
    }
}