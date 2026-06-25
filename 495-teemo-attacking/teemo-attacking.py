class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        if not timeSeries :
            return 0 
        ans =0 
        for i in range(len(timeSeries)-1):
         ans+= min(duration , timeSeries[i+1] - timeSeries[i])    
        ans += duration 
        return ans 