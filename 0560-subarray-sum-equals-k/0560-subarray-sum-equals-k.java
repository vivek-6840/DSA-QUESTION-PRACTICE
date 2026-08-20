import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has occurred once
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            // Calculate current prefix sum
            sum += num;

            // Check if sum - k exists
            int required = sum - k;

            if (map.containsKey(required)) {
                count += map.get(required);
            }

            // Store/update current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
