
class Solution {

    public int[] sortArray(int[] nums) {

        int[] temp = new int[nums.length];

        mergeSort(nums, temp, 0, nums.length - 1);

        return nums;
    }

    // Divide the array
    public void mergeSort(int[] nums, int[] temp,
                          int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        mergeSort(nums, temp, low, mid);

        mergeSort(nums, temp, mid + 1, high);

        merge(nums, temp, low, mid, high);
    }

    // Merge two sorted halves
    public void merge(int[] nums, int[] temp,
                      int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } 
            else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining left elements
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy remaining right elements
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // Copy sorted elements back
        for (int x = low; x <= high; x++) {
            nums[x] = temp[x];
        }
    }
}
