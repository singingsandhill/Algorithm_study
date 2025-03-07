class Solution {
    public long solution(int price, int money, int count) {
        
        long total_price = 0;
        
        for(int i=1; i<=count; i++){
            total_price += i*price;
        }
        
        long answer = total_price-money;
        
        if(answer<0) return 0;

        return answer;
    }
}