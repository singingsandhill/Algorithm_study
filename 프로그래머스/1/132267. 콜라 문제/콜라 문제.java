class Solution {
    public int solution(int a, int b, int n) {
        int answer = n/a*b; //처음에 받은 콜라병
        int bottle = n/a*b + n%a;
        
        while(bottle >= a){
            answer += bottle/a*b;
            bottle = bottle/a*b + bottle%a; 
        }
        return answer;
    }
}