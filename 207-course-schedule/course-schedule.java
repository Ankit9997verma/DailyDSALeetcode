class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }

       int indegree[]= new int[numCourses];
       for(int[] query: prerequisites){
        int courses=query[1]; // independent quesry
        int depend = query[0];
        indegree[depend]++;
        graph.get(courses).add(depend);

       } 
       int count=0;
       Queue<Integer> queue = new LinkedList<>();
       for(int i=0; i<numCourses;i++){
        if(indegree[i]==0){
            queue.add(i);
        }
       }
       while(!queue.isEmpty()){
        int element=queue.poll();
        count++;
        for(int dependent:graph.get(element)){
            indegree[dependent]--;
            if(indegree[dependent]==0){
                queue.add(dependent);
            }
        }
       }
       return count==numCourses;
    }
}