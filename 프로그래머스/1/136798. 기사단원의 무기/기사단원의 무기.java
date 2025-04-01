class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        for(int j=2; j<=number; j++){
            int temp = numdiv(j);
            if(temp > limit) {
                answer += power;
                // System.out.println("limit : "+temp);
            } else if(temp <= limit){
                answer += temp;
                // System.out.println(temp);
            }
        }
        
        return answer;
    }
    
    public Integer numdiv(int num){
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (i != num / i) count++;
            }
        }
        return count;
    }
}