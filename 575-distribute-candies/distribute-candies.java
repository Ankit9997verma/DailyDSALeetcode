class Solution {
    public int distributeCandies(int[] candyType) {
      int  n=candyType.length;
      HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<n ; i++){
            set.add(candyType[i]);
        }
        int ans= Math.min(n/2, set.size());
        return ans;
    }
}