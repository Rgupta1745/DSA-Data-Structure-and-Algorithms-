class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length ; 
        int col = matrix[0].length;
        int[] arr = new int[row * col];
        int k = 0;

        //2D matrix flattend into array
        for(int i =0 ; i<row ; i++){
            for(int j =0; j<col; j++){
                arr[k++] = matrix[i][j];
            }
        }
        //Binary Search
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left +(right-left)/2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                right = mid -1;
            }else{
                left = mid+1;
            }
        }
        return false;
        
    }
}