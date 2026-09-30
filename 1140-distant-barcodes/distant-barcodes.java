class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int n = barcodes.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : barcodes){
            map.put(i, map.getOrDefault(i,0)+1 );
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        int i =0;
        int[] res= new int[n];
        while(!pq.isEmpty()){
            int code = pq.poll();
            int freq= map.remove(code);
            while(freq-- > 0){
                if(i>=n) i=1;
                res[i]=code;
                i+=2;
            }
        }
        return res;
    }
}