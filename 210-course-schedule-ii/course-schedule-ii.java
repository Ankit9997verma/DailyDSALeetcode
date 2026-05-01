class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n =numCourses;
        int m = prerequisites.length ;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =0 ; i< numCourses ; i++){
            list.add(new ArrayList<>());
        }
        for(int i =0 ; i< m ; i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];

            list.get(b).add(a);
        }

        int[] indegree = new int[n];
        for(int i =0 ; i< n ; i++){
            for(int nbr : list.get(i) ){
                indegree[nbr]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0 ; i< n ; i++){
          if(indegree[i]==0){
            queue.add(i);
          }
        }
        int[] ans = new int[n];
        
        int i =0 ;
        while(!queue.isEmpty()){
            int num = queue.poll();
            ans[i]=num;
            i++;
            for(int nbr : list.get(num) ){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    queue.add(nbr);
                }
            }
        }
        if(i==n)  return ans ; 
        return new int[]{};
       

    }
}