class StockSpanner {
    ArrayList<Integer>l;
    public StockSpanner() {
        l=new ArrayList<>();
    }
    
    public int next(int price) {
        l.add(price);
        int count=0;
        for(int i=l.size()-1;i>=0;i--){
            if(l.get(i)<=price) count++;
            else break;
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */