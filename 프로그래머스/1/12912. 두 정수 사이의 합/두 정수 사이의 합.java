class Solution {
    public long solution(int a, int b) {
        
        int big = 0;
        int small = 0;
        
        if(a>b){
            big = a; small = b;
            
            if(a-b==0) return a;
        } else {
            big = b; small = a;
            
            if(b-a==0) return a;
        }
        
        long answer = 0;
        
        for(int i=small; i<=big; i++){
            answer+=i;
        }
        
        return answer;
    }
}