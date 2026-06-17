class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length ; 
        int[] ans = new int[n-k+1];
        int i =0 ; 
        int j =0 ;
        int idx= 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        while(j < n ){
           freq.put(nums[j], freq.getOrDefault(nums[j],0)+1);
           maxHeap.offer(nums[j]);

           if(j-i+1 ==k){
            while(!maxHeap.isEmpty() && freq.getOrDefault(maxHeap.peek(),0)==0){
                maxHeap.poll();
            }
            ans[idx++]= maxHeap.peek();
            freq.put(nums[i], freq.get(nums[i]) - 1);
            i++;
           }
           j++;
        }
         return ans ; 
    }
}