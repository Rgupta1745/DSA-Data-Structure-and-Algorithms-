class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int currentSumMin = nums[0];
        int maxSumMin = nums[0] ;

        int currentSumMax = nums[0];
        int maxSumMax = nums[0];
        int totalSum = 0;

        for(int i=0; i<n ; i++){
            totalSum+=nums[i];
        }

        for(int i= 1 ; i<n ; i++){

            currentSumMax = Math.max(nums[i] , currentSumMax+nums[i]);
            maxSumMax =  Math.max(maxSumMax , currentSumMax);

            currentSumMin = Math.min(nums[i] , currentSumMin+nums[i]);
            maxSumMin =  Math.min(maxSumMin , currentSumMin);

        }

        if(maxSumMax <0){
            return maxSumMax;
        }

        return Math.max(maxSumMax , totalSum-maxSumMin);
      
    }
}