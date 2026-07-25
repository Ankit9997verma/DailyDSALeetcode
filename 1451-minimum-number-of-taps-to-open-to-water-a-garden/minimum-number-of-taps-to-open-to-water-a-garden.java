class Solution {
    public int minTaps(int n, int[] ranges) {
        // example :- ranges {3,3,1,1,2,0}
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =0 ; i< ranges.length ; i++){
            ArrayList<Integer> list1 = new ArrayList<>();
            int left = Math.max(0 , i-ranges[i]);
            int right = Math.min(n , i+ ranges[i]);
            list1.add(left);
            list1.add(right);
            list.add(list1);
        }
        // list :- [[0,3],[0,4],[1,3],[2,4],[2,5],[5,5]];
        int[] startEnd= new int[n+1];
        for(int i=0 ;i<=n ; i++){
            for(int j =0 ; j<list.size() ; j++){
                if(i== list.get(j).get(0)){
                    startEnd[i]=Math.max(startEnd[i] , list.get(j).get(1) );
                }
            }
        }
        // startEnd :- [4,3,4,0,0,5];

        int taps =0 ; 
        int maxSum =0 ; 
        int currSum =0 ;
        int i=0 ; 
        while(i <= n){
            if(i>maxSum){
                return -1;
            }
            if(i> currSum){
                taps++;
                currSum=maxSum;
            }
            maxSum = Math.max(maxSum , startEnd[i]);
            i++;
        }
        return taps ; 
    }
}