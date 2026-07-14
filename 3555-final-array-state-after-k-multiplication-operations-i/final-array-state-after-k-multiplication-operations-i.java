class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        while (k > 0) {

            int min = nums[0];
            int index = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                    index = i;
                }
            }
            nums[index] *= multiplier;

            k--;
        }

        return nums;
    }
}