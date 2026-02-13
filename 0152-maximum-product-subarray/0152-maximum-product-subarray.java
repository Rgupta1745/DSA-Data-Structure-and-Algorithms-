class Solution {
    public int maxProduct(int[] nums) {
        int maxCurrent = nums[0];
        int minCurrent = nums[0];

        int result = nums[0];
        for(int i =1 ; i < nums.length ; i++){
            int current = nums[i];
            int prevMax = maxCurrent ;

            maxCurrent= Math.max(current , Math.max(prevMax*current , minCurrent*current));
            minCurrent = Math.min(current , Math.min(prevMax*current , minCurrent*current));

            result = Math.max(result , maxCurrent);

        }
        return result ;
    }
}