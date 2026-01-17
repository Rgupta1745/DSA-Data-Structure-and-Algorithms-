class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
      int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]==val){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }else{
                count++;

            }
        }
       int first = 0;
       int lasts = nums.length-1;
       while (first<lasts) {
        int temp  = nums[first];
        nums[first]=nums[lasts];
        nums[lasts]=temp;
        first++;
        lasts--;
       }


        return count;
    }
}