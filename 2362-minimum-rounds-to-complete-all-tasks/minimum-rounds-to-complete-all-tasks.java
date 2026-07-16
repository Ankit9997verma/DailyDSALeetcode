class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer , Integer> map =new HashMap<>();
        for(int task: tasks){
            map.put(task , map.getOrDefault(task , 0)+1);
        }
        
        int count =0 ; 
        for(int freq: map.values()){
            if(freq == 1) return -1 ;
            if(freq%3 ==0) count+=freq/3;
            else if(freq%3 == 1){
                count+= (freq-4)/3+2;
            }else{
                count+=freq/3 +1;
            } 
        }
        return count ; 
    }
}