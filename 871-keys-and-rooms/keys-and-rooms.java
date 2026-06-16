class Solution {
    public void dfs(List<List<Integer>> rooms, int src , boolean[] visited){
        if(visited[src]){
            return ;
        }
        visited[src] = true;

        for (int key : rooms.get(src)) {
            dfs(rooms,key , visited);
        }

    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n= rooms.size();
        boolean[] visited = new boolean[n];
        dfs(rooms , 0 , visited);

        for (boolean room : visited) {
            if (!room) {
                return false;
            }
        }
        return true;

    }
}