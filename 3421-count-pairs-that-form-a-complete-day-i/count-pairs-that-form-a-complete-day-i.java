class Solution {
    public int countCompleteDayPairs(int[] hours) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int count =0 ; 
        for(int h : hours){
            int rem = h % 24 ; 
            int comp = (24 - rem) % 24;

            if(map.containsKey(comp)){
                count+= map.get(comp);
            }
            map.put(rem , map.getOrDefault(rem , 0) +1);

        }
        return count ; 
    }
}