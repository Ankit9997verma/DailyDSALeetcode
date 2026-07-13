class Solution {
    private void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;

        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                dfs(nei, graph, visited);
            }
        }
    }
    public int removeStones(int[][] stones) {
        int n = stones.length ;
        List<List<Integer>> graph = new ArrayList<>();

        for(int i =0 ; i< n ; i++){
            graph.add(new ArrayList<>());
        }

        for(int i =0 ; i< n ; i++){
            for(int j =i+1 ; j < n ; j++){
                if(stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        boolean[] visited = new boolean[n];
        int components =0 ; 
        for(int i =0 ; i< n ; i++){
            if(!visited[i]){
                dfs(i , graph , visited);
                components++;
            }
        }
        return n - components ;
    }
}