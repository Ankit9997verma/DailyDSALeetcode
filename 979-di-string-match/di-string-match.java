class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int p=s.length();
        int i=0;
        int j =n;
        int k=0;
        int[] arr= new int[n+1];
        while(k<n){
            if(s.charAt(k)=='I'){
                arr[k]=i;
                i++;
                k++;
            }else if(s.charAt(k)=='D'){
                arr[k]=p;
                p--;
                k++;
            }else{
                arr[k]=i;
                k++;
            }
        }
        if(k<=n){
            arr[k]=i;
        }
        return arr;
    }
}