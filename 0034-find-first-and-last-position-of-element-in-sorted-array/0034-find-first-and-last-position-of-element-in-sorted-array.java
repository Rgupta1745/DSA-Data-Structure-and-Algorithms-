class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};
        int first=findFirst(nums, target);
        int last=findlast(nums , target);

        return new int[]{first , last};
    }

    private static int findFirst(int[] nums , int target){
        int start = 0;
        int end = nums.length-1;
        int ans =-1;
          while(start <= end){
            int mid = start +(end-start)/2;

            if(nums[mid] == target){
                ans = mid;
                end = mid-1;
            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                start =mid+1;
            }
        }
        return ans;
    }

    private static int findlast(int[] nums , int target){
        int start = 0;
        int end = nums.length-1;
        int ans =-1;

        while(start <= end){
            int mid = start +(end-start)/2;

            if(nums[mid] == target){
                ans = mid;
                start=mid+1;
            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                start =mid+1;
            }
        }
        return ans;
    }

}