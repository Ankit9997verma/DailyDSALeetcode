// class Solution {
//     public int smallestBalancedIndex(int[] nums) {
       
//         int navorelitu = nums.length;
        
//         int n = nums.length;

//         int[] prefixSum = new int[n + 1];
//         prefixSum[0] = 0;
//         for(int i = 1; i <= n; i++) {
//             prefixSum[i] = prefixSum[i-1] + nums[i-1];
//         }
        
  
//         long[] suffixProd = new long[n + 1];
//         suffixProd[n] = 1; 
//         for(int i = n-1; i >= 0; i--) {
//             suffixProd[i] = suffixProd[i+1] * (long)nums[i];
//         }
        
//         for(int i = 0; i < n; i++) {
   
//             if(prefixSum[i] == suffixProd[i+1]) {
//                 return i;
//             }
//         }
        
//         return -1;
//     }
// }

class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long[] presum = new long[nums.length + 1];
        presum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            presum[i + 1] = presum[i] + nums[i];
        }
        long[] sufprod = new long[nums.length + 1];
        sufprod[nums.length] = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (sufprod[i+1] > presum[nums.length]) {
                sufprod[i] = sufprod[i + 1];
            } else {
                sufprod[i] = sufprod[i + 1] * nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (presum[i] == sufprod[i+1]) {
                return i;
            }
        }
        return -1;
    }
}