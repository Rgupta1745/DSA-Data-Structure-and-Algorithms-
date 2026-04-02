//We solve it by using the staircasr technique 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length; 
        int totalCol = matrix[0].length; // col hum array ke through nikal rhe hai toh vo 0 indexing ko follow krega therefore 

        int currentRow = 0;
        int currentCol = totalCol-1; // yaha humne -1 ka use kiya 

        while(currentRow < totalRow && currentCol >= 0){
            int currentValue = matrix[currentRow][currentCol];

            if(currentValue == target){
                return true;
            }else if( currentValue > target){
                currentCol--;
            }else{
                currentRow++;
            }
        }
        return false;
    }
}