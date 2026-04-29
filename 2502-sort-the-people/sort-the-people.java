class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length ;
        int[] sorted = heights.clone();
        Arrays.sort(sorted);

        String[] result = new String[n];
        boolean [] visited = new boolean [n];

        int k =0 ; 
        for(int i = n-1 ; i>=0 ; i--){
            int h = sorted[i];

            for(int j =0 ; j<n ; j++){
                if(heights[j]== h && !visited[j]){
                    result[k++] = names[j];
                    visited[j]=true;
                    break;
                }
            }
        }
        return result ; 
    }
}