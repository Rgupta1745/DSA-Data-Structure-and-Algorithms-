
import java.util.*;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has remainder 0
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            // Handle negative remainders
            int remainder = ((prefixSum % k) + k) % k;

            // Check if same remainder exists
            count += map.getOrDefault(remainder, 0);

            // Update frequency
            map.put(remainder,
                    map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}
