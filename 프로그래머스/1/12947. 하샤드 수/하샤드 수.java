class Solution {
    public boolean solution(int x) {
        int num = 0;
        int y = x;
        while(x>=1){
            num += x%10;
            x = x/10;
        }
        boolean answer = true;
        if(!(y%num == 0)) {
            answer = false;
        }
        return answer;
    }
}