class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum =0;
        sum = prices[0]+prices[1];
        if(sum<money){
            return (money-sum);
        }
        else if(sum>money){
            return money ;
        }
        return 0;
    }
}