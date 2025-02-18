class Solution {
    public int solution(String s) {
        int answer = 0;
        int sign = 1;
        int startIndex = 0;
        
        if(s.charAt(0)=='-'||s.charAt(0)== '+'){
            sign = (s.charAt(0)=='-') ? -1 :1 ;
            startIndex = 1;
        }
        int number = Integer.parseInt(s.substring(startIndex));
        answer = sign * number;
        return answer;
    }
}