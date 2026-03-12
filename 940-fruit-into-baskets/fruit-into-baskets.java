class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int i =0 ; 
        int j =0;
        int maxi =0 ; 
        int k =2 ;
        while( j < arr.length){
            map.put(arr[j], map.getOrDefault(arr[j],0)+1);
            if(map.size()<= k){
                maxi= Math.max(maxi , j-i+1);
                j++;
            }else if( map.size()> k ){
                while(map.size()> k){
                    map.put(arr[i], map.get(arr[i])-1);
                   if(map.get(arr[i]) == 0) {
                        map.remove(arr[i]);
                    }
                    i++;
                }
                j++;
            }
        }
        return maxi ;
    }
}