class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List <List<Integer>> list1= new ArrayList<>();
        Arrays.sort(arr);

        int mindiff= Integer.MAX_VALUE;
        for(int i =0 ; i<arr.length-1 ; i++){
            mindiff=Math.min(mindiff , arr[i+1]-arr[i]);
        }
        for(int i =0 ; i<arr.length-1 ; i++){
            if(arr[i+1]-arr[i]==mindiff){
                list1.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return list1;
    }
}