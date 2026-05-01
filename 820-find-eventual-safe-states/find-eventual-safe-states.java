

class Solution {

    public boolean dfs(int node, int[][] graph,
                       boolean[] visited, boolean[] path, boolean[] safe) {

        visited[node] = true;
        path[node] = true;
        safe[node]=false ;

        for (int nbr : graph[node]) {

            if (!visited[nbr]) {
                if (dfs(nbr, graph, visited, path, safe)) {
                    return true; 
                }
            } 
            else if (path[nbr]) {
                return true; 
            }
        }

        path[node] = false;
        safe[node] = true; 
        return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {

        int V = graph.length;

        boolean[] visited = new boolean[V];
        boolean[] path = new boolean[V];
        boolean[] safe = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, path, safe);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (safe[i]) ans.add(i);
        }

        return ans;
    }
}