import java.lang.Math;

class Solution {
    public long solution(long n) {
        double num =  Math.sqrt(n);
        long answer = 0;
        if(num%1 == 0){
            answer = (long)Math.pow((double)num+1,2);
        } else {
            return -1;
        }
        return answer;
    }
}