class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        // first calculate totalSum
        for(int i=0; i<nums.length; i++) {
            totalSum+= nums[i];
        }
        int leftSum = 0;
        // now find the pivot
        for(int i=0; i<nums.length; i++) {
            int rightSum = totalSum -leftSum-nums[i];
           
            if(leftSum==rightSum) {
                return i;
            }
            leftSum = leftSum+ nums[i];
        }
        return -1;
    }
}