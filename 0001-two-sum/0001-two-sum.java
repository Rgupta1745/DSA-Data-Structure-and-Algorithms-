class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hashMap = new HashMap<>();

        for(int i=0 ; i< nums.length ;i++){
            int newNum = target-nums[i];

            if(hashMap.containsKey(newNum)){
                int n =hashMap.get(newNum);
                return new int[]{n,i};
            }
            hashMap.put(nums[i] , i);
        }
        return new int[]{-1,-1};
    }
}