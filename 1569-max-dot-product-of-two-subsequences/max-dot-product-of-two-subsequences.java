class Solution {
    public int seen( int[] nums1 , int [] nums2, int i , int j, Integer[][]dp ){
        if(i==nums1.length || j==nums2.length){
            return Integer.MIN_VALUE;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        int take =nums1[i]*nums2[j]+Math.max(0,seen(nums1,nums2, i+1, j+1,dp));
        int nottake= Math.max(seen(nums1,nums2,i+1,j,dp), seen(nums1,nums2,i,j+1,dp));

        return dp[i][j]=Math.max(take,nottake);
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        Integer[][] dp= new Integer [nums1.length+1][nums2.length+1];
       return seen(nums1,nums2,0,0, dp);
        
    }
}