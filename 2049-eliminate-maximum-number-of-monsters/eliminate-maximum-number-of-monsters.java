class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
      float[] time = new float[dist.length];
      for(int i=0 ; i< dist.length ; i++){
        time[i]= (float)dist[i]/speed[i];
      }
      Arrays.sort(time);
      int count =0 ; 
      int i =0  ;
      int t=0 ;
      while(i < time.length ){
        if(time[i]>t){
            t++;
            i++;
        }else {
            break ;
        }
      }
      return t ;
    }
}