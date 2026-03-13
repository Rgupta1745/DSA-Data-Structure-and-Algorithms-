class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count =  0;
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0 ; i< tickets.length ; i++){
            q.offer(i);
        }
        while(!q.isEmpty()){
            count++;
            int front = q.poll();
            tickets[front]--;

            if(tickets[front] != 0 ){
                q.offer(front);
            }else{
                if(front ==k ){
                    return count;
                }
            }
        }
        return count;
    }
}