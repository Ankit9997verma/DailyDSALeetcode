class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
         Queue<Integer> q = new LinkedList<>();
         int n = tickets.length;
         for(int i=0 ;i< n  ; i++){
            q.add(i);
         }
         int time=0;
            while(tickets[k]>0){
                int index=q.poll();
                tickets[index]--;
                time=time+1;

                if (tickets[index] > 0) {
                q.add(index);
            }
            }
         return time;
    }
}