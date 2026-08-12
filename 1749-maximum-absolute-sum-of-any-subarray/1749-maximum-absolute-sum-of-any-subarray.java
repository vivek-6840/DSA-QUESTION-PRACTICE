class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEndinghere = 0;
        int minEndinghere = 0;
        int maxSum = 0;
        int minSum = 0;
        for(int num : nums) {
            maxEndinghere = Math.max(num , maxEndinghere+num);
            maxSum = Math.max(maxSum , maxEndinghere);
            minEndinghere = Math.min(num,minEndinghere+num);
            minSum = Math.min(minSum,minEndinghere);
        }
        return Math.max(maxSum,-minSum);
    }
}