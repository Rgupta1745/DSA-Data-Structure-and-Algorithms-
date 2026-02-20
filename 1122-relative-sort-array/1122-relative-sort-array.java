class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int[] count = new int[1001];
        for(int h : arr1){
            count[h]++;
        }

        int index =0;
        int[] result = new int[arr1.length];

        for(int num : arr2){
            while(count[num] > 0){
                result[index++] = num;
                count[num]--;
            }
        }

        for(int num = 0 ; num<= 1000 ; num++){
            while(count[num]>0){
                result[index++] = num;
                count[num]--;
            }
        }
        return result;
    }
}