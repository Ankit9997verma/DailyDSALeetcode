class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length; 
        Queue<Integer> queue= new LinkedList<>();
        for(int i=0 ; i<n ; i++){
            queue.add(i);
        }
        int[] result= new int[n];
        Arrays.sort(deck);
        for(int ele: deck){
            result[queue.poll()]=ele;
            queue.add(queue.poll());
        }
        return result;
    }
}