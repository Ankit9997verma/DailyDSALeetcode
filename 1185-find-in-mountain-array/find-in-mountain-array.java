/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int incBinarySearch(MountainArray arr , int start , int end , int target){
        while(start<= end){
            int mid = start+(end-start)/2;
            int val = arr.get(mid);
            if(val== target){
                return mid ; 

            }
            else if(val>target){
                end = mid-1;
            }else {
                start= mid+1;
            }
        }
        return -1 ;
    }
    public int decBinarySearch(MountainArray arr  , int start , int end , int target){
        while(start<=end){
            int mid = start+(end-start)/2;
             int val = arr.get(mid);
            if(val==target){
                return mid ;
            }else if(val>target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start =0; 
       
        int end =mountainArr.length() - 1;
        int peak =-1;
        while(start<= end){
            int mid = start+(end-start)/2;
             int midVal = mountainArr.get(mid);
            if(mid > 0 && mid < mountainArr.length()-1){
              if(midVal> mountainArr.get(mid-1) && midVal > mountainArr.get(mid+1)){
                peak = mid;
                break ;
              }
              else if(mountainArr.get(mid-1) > midVal){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
        }
         else if(mid == 0){
                peak = mountainArr.get(0) > mountainArr.get(1) ? 0 : 1;
                break;
            }
            else if(mid == mountainArr.length()-1){
                peak = mountainArr.get(mid) > mountainArr.get(mid-1) ? mid : mid-1;
                break;
            }
    }
    int left = incBinarySearch(mountainArr , 0 , peak , target);

        if(left != -1) return left;

        return decBinarySearch(mountainArr , peak+1 , mountainArr.length()-1 , target);

}
}