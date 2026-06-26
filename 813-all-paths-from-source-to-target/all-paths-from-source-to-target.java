class Solution {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> ans = new ArrayList<>();

        Queue<List<Integer>> q = new LinkedList<>();

        List<Integer> start = new ArrayList<>();
        start.add(0);

        q.offer(start);

        int target = graph.length - 1;

        while (!q.isEmpty()) {

            List<Integer> path = q.poll();

            int node = path.get(path.size() - 1);

            if (node == target) {
                ans.add(path);
                continue;
            }

            for (int next : graph[node]) {

                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(next);

                q.offer(newPath);
            }
        }

        return ans;
    }
}