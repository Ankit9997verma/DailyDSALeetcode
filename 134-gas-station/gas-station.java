class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totGas=0;
        int totCost =0 ;

        for(int val : gas){
            totGas += val ;
        }
        for(int val : cost){
            totCost += val ;
        }
        if(totGas < totCost) return -1;

        // unique solution is always available 

        int start =0;
        int curr =0 ; 
        for(int i=0 ; i< gas.length  ; i++){
            curr = curr + gas[i] - cost[i];

            if(curr < 0){
                start = i+1;
                curr=0;
            }

        }
        return start ;
    }
}