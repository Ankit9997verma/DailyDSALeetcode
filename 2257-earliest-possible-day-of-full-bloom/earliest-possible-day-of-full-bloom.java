class Solution {
    class Pair{
        int plant ;
        int grow ; 
        
        Pair(int p , int g){
            plant = p ; 
            grow = g ;
        }
    }
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length ; 
        Pair[] arr= new Pair[n];
        for(int i =0 ; i < n ; i++){
            arr[i]=new Pair(plantTime[i], growTime[i]);
        }
        Arrays.sort(arr,(a,b)-> b.grow - a.grow);

        int currentPlant =0 ; 
        int answer =0 ; 

        for(Pair p : arr){
            currentPlant += p.plant;
            answer = Math.max(answer  , currentPlant + p.grow);
        }
        return answer ;
    }
}