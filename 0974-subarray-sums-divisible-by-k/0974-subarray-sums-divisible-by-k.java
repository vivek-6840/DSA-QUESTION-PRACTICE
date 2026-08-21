import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> f = new HashMap<>();

        f.put(0, 1);

        int ans = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int rem = sum % k;

            if (rem < 0) {
                rem += k;
            }

            if (f.containsKey(rem)) {
                ans += f.get(rem);
            }

            f.put(rem, f.getOrDefault(rem, 0) + 1);
        }

        return ans;
    }
}
