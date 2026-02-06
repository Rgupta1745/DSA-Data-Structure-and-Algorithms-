class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length ;
        int windowSum = 0;
        int left =0;
        int minimumLength = Integer.MAX_VALUE;

       for(int right =0 ; right<n ; right++){
        windowSum += nums[right];

        while( windowSum >= target){
            minimumLength = Math.min(minimumLength , right-left+1);
            windowSum-=nums[left];
            left++;
        }
       }
       return minimumLength == Integer.MAX_VALUE ? 0 : minimumLength;
    }
}