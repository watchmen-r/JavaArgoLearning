package ArrayEasy;

class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2 };
        System.out.println(removeDuplicate(nums));

    }

    // 26
    public static int removeDuplicate(int[] nums) {
        if(nums.length == 0) return 0;

        int pointer = 0;

        for(int num : nums) {
            if(pointer == 0 || num > nums[pointer - 1]) {
                nums[pointer] = num;
                pointer++;
            }
        }
        return pointer;
    }
}