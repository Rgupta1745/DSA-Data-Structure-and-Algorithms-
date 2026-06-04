class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;

        for(int j = 0; j<n;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        // for(int j =1 ; j<n ;j++){
        //     if(nums[i] != nums[j]){
        //         i++;
        //         int temp = nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //     }
        // }
        return i+1;
    }
}