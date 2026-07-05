class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            
            if (currentSum == target) {
                // The problem requires 1-indexed answers
                return new int[]{left + 1, right + 1};
            } else if (currentSum < target) {
                left++; // Need a larger sum
            } else {
                right--; // Need a smaller sum
            }
        }
        
        return new int[]{-1, -1}; // Fallback case
    }
}