class Solution {
    int count=0;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length ; 
        int[] visited = new int[n];

        for(int i = 0 ; i< n ; i++){
            if(visited[i] == 0){
                count++;
                DFS(isConnected , visited , i);
            }
        }
        return count ;
    }
    private static void DFS(int[][] isConnected , int[] visited , int i ){
        visited[i] =1 ; 
        for(int j = 0 ; j< isConnected.length ; j++){
            if(isConnected[i][j] ==1 && visited[j] ==0 ){
                DFS(isConnected, visited , j);
            }
        }
    }
}