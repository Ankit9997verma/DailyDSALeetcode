class Solution {
    public void helper(int n , StringBuilder sb , ArrayList<String> list , char last){
        if(sb.length()==n){
            list.add(sb.toString());
            return ;
        }
        int length =sb.length();
        if(last!='a'){
            helper(n , sb.append('a') , list , 'a');
            sb.setLength(length);
        }
        if(last!='b'){
            helper(n , sb.append('b') , list , 'b');
            sb.setLength(length);
        }
        if(last!='c'){
            helper(n , sb.append('c') , list , 'c');
            sb.setLength(length);
        }

    }
    public String getHappyString(int n, int k) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(n , sb , list  , '.');
        if(k>list.size()){
            return "";
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}