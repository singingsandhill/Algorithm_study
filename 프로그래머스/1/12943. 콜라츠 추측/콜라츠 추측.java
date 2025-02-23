class Solution {
    public int solution(int num) {
        int answer = 0;
        while(num != 1){
            if(num%2==0){
                answer ++;
                num = num/2;
            } else {
                if ((num > (Integer.MAX_VALUE - 1) / 3) || answer>=500){
                    return -1;  }
                num = num*3+1; answer ++; }
        }
        return answer;
    }
}