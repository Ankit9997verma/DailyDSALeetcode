class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> ankit=new PriorityQueue<>(Collections.reverseOrder());
        for(int element:stones){
            ankit.add(element);

            }
        
        while(ankit.size()>1){
            int ansh=ankit.poll();
            int  satyam=ankit.poll();
            int shivansh=ansh-satyam;
            if(shivansh>0){
                ankit.add(shivansh);

            }

        }
        return ankit.isEmpty()?0:ankit.peek();
        
    }
}