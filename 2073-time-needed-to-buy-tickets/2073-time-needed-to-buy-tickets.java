// 2073// https://leetcode.com/problems/time-needed-to-buy-tickets/ 
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0 ; 
        Queue<Integer> que = new LinkedList<>();

        for(int i = 0 ; i< tickets.length ; i++){
            que.offer(i);
        }
        while(!que.isEmpty()){
            count++;
            int front = que.poll();
            tickets[front]--;

            if(tickets[front] != 0 ){
                que.offer(front);
            }else{
                if(front == k){
                    return count;
                }
            }
        }
           
        return count;
    }
}