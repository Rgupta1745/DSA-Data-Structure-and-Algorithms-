class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int requiredSum = k*threshold;
        int windowSum = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        if(windowSum >= requiredSum){
            count++;
        }
        for (int j = k; j < n; j++) {
            windowSum+=arr[j];
            windowSum-=arr[j-k];

            if (windowSum >= requiredSum) {
                count++;
            }
            
        }
        return count;

    }
}