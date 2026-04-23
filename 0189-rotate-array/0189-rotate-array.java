class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] reverse = new int[n];
        for(int i = 0; i<n ; i++){
            int idx = (i+k)%n;

            reverse[idx]=nums[i];
        }

        for(int j=0; j<n ; j++ ){
            nums[j]=reverse[j];
        }
    }
}