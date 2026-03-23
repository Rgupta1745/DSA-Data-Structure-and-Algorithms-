class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i<nums.length ; i++){
            pq.add(nums[i]);
            int size = pq.size();

            if(size > k){
                pq.poll();
            }
        }
        int peak = pq.peek();
        return peak;
    }
}