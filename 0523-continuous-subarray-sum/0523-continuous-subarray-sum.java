
import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Remainder 0 exists before the array starts
        map.put(0, -1);

        long prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            int remainder = (int)(prefixSum % k);

            if (map.containsKey(remainder)) {

                int previousIndex = map.get(remainder);

                // Check subarray length >= 2
                if (i - previousIndex >= 2) {
                    return true;
                }

            } else {

                // Store only the first occurrence
                map.put(remainder, i);
            }
        }

        return false;
    }
}
