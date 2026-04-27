class Solution {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> bankSet = new HashSet<>(Arrays.asList(bank));
        HashSet<String> visited = new HashSet<>();

        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);

        int level =0 ;
        char[] genes = {'A', 'C','G','T'};

        while(!queue.isEmpty()){
            int n = queue.size();

            while(n-- > 0 ){
                String curr = queue.poll();
                if(curr.equals(end)) return level;
                for(int i=0 ; i<curr.length() ; i++){
                    char[] arr = curr.toCharArray();
                    for(char ch : genes){
                        arr[i]= ch ;
                        String neighbour = new String(arr);
                        if(!visited.contains(neighbour) && bankSet.contains(neighbour)){
                            queue.offer(neighbour);
                            visited.add(neighbour);
                        }
                    }
                }
            }
            level++;
        }
        return -1 ; 
    }
}