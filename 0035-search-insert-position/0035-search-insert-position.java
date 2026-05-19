class Solution {
    public static int lower( int[] nums , int target , int n){
        int start=0, end = n-1;
        int ans = n;

        while(start <= end){
            int mid= start +(end-start)/2;

            if(nums[mid] >= target ){
                ans = mid;
                end = mid-1;
            }else{
                start =mid+1;
            }
        }
        return ans;
    }
   
    public int searchInsert(int[] nums, int target) {
        int n = nums.length ;
        int ans1= lower(nums , target , n);
        if(ans1 == n || nums[ans1]!= target ) return ans1;
           
        return ans1;
    }
}