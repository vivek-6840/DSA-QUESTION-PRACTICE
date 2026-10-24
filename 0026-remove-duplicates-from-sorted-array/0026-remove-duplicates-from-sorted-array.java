class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) {
            return 0;
        }
        int low =0;
        for(int high=1; high<nums.length; high++) {
            if(nums[low]!=nums[high]) {
                low++;
                nums[low] = nums[high];
            }
        }
        return low+1;
    }
}