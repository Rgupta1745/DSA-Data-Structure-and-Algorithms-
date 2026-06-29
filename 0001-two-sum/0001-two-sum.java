class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int first= 0;
        int second = 1;
        for(int i=first; i<nums.length ; i++){
            for(int j= second; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    list.add(i);
                    list.add(j);
                }
            }
            first++;
            second++;
        }
        

        int[] result = new int[list.size()];
        for(int k =0;k< list.size();k++){
            result[k] =list.get(k);
        }

        return result;
    }
}