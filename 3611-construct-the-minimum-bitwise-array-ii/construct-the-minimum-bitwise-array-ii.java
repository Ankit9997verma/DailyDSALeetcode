// 

import java.util.*;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int m = nums.get(i);

            if ((m & 1) == 0) {
                ans[i] = -1;
                continue;
            }
            int temp = m;
            int t = 0;
            while ((temp & 1) == 1) {
                t++;
                temp >>= 1;
            }
            ans[i] = m - (1 << (t - 1));
        }

        return ans;
    }
}
