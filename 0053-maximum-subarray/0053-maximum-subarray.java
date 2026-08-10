class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = currentSum + nums[i];
            int v2 = nums[i];

            currentSum = Math.max(v1, v2);
            sum = Math.max(sum, currentSum);
        }

        return sum;
    }
}