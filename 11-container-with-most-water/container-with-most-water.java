class Solution {
    public int maxArea(int[] height){
        int left = 0; 
        int right = height.length-1;
        int max=0;
        while(left< right){
            int length= Math.min(height[left], height[right]);
            int breath = right - left ;
            int area = length * breath; 
            max= Math.max(area, max);
            if(height[left]< height[right]){
                left++;
            }else{
                right--;            
        
    } }
    return max; 
    } 


    }