class Solution {
    public boolean BinarySearch(int target  ,int[] nums1 ){
        int start = 0 ; 
        int end  = nums1.length -1 ;

        while(start <= end){
            int mid = start +(end - start)/2 ;
            if(nums1[mid]==target){
                return true ;
            }
            else if(nums1[mid]> target){
                end = mid -1 ;
            }else {
                start = mid+1 ;
            }
        }
        return false ;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int x  : nums1){
            map.put(x , map.getOrDefault(x,0)+1);
        }
        for (int x : nums2) {

            if (BinarySearch(x, nums1) && map.getOrDefault(x, 0) > 0) {
                ans.add(x);
                map.put(x, map.get(x) - 1);
            }
        }
        
        int size = ans.size();
        int[] answer = new int[size];
        for(int i =0 ; i< size ; i++){
            answer[i]= ans.get(i);
        }
        return answer ; 
    }
}