class Solution {
    public class Pair{
        int cap ;
        int rock;

        Pair(int cap , int rock){
           this.cap = cap ;
           this.rock = rock;
        }
    }
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int  n = capacity.length ; 
        Pair[] arr= new Pair[n];
        for(int i =0 ; i< n ; i++){
            arr[i]=new Pair(capacity[i], rocks[i]);
        }
        Arrays.sort(arr,(a,b)-> (a.cap - a.rock)-(b.cap-b.rock));
        int count =0 ;
        for(Pair p : arr){
            int need = p.cap - p.rock ;
            if(need <= additionalRocks){
                additionalRocks -= need ;
                count++;
            }else{
                break ;
            }
        }
        return count ; 
    }
}