class Solution {
    public int maxProfit(int[] arr) {
        int buy = Integer.MAX_VALUE;
        int profit =0 ; 
        for(int i =0 ; i<arr.length ; i++){
            if(arr[i] < buy){
                buy = arr[i];
            }
            if(buy < arr[i]){
                profit = Math.max(profit , arr[i]-buy);
            }

        }
        return profit ;
    }
}