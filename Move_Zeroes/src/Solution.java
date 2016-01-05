public class Solution {

    public int[] moveZeroes(int[] nums) {
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[current] = nums[i];
                current++;
            }
        }
        while (current < nums.length) {
            nums[current] = 0;
            current++;
        }
        return nums;
    }

}