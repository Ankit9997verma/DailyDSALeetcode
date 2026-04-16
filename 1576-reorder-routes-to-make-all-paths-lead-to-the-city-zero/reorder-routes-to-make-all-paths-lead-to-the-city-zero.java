class Solution {

    public void dfs(int node, List<List<Integer>> forwardNbrs, 
                    List<List<Integer>> backwardNbrs, 
                    int[] ans, boolean[] visited) {

        visited[node] = true;

        // forward neighbors (need to change direction)
        for (int nbr : forwardNbrs.get(node)) {
            if (!visited[nbr]) {
                ans[0] += 1;
                dfs(nbr, forwardNbrs, backwardNbrs, ans, visited);
            }
        }

        // backward neighbors (no need to change)
        for (int nbr : backwardNbrs.get(node)) {
            if (!visited[nbr]) {
                dfs(nbr, forwardNbrs, backwardNbrs, ans, visited);
            }
        }
    }

    public int minReorder(int n, int[][] connections) {

        List<List<Integer>> forwardNbrs = new ArrayList<>();
        List<List<Integer>> backwardNbrs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            forwardNbrs.add(new ArrayList<>());
            backwardNbrs.add(new ArrayList<>());
        }

        for (int i = 0; i < connections.length; i++) {
            int a = connections[i][0];
            int b = connections[i][1];

            forwardNbrs.get(a).add(b);
            backwardNbrs.get(b).add(a);
        }

        boolean[] visited = new boolean[n];
        int[] ans = new int[1]; 

        dfs(0, forwardNbrs, backwardNbrs, ans, visited);

        return ans[0];
    }
}