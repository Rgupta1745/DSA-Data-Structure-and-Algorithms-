class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] pSum = new int[nums.length];
        pSum[0] = nums[0];
        int count = 0;

        for(int i =1 ; i< nums.length ; i++){
            pSum[i] = pSum[i-1]+nums[i];
        }
        Map<Integer ,Integer> hMap = new HashMap<>();

        for(int j =0; j<nums.length ; j++){
            int val = pSum[j] - k;

            if(pSum[j] == k) count++;

            if(hMap.containsKey(val)){
                count+=hMap.get(val);
            }
                hMap.put(pSum[j] , hMap.getOrDefault(pSum[j] , 0)+1);
        
        }

        return count;
    }
}