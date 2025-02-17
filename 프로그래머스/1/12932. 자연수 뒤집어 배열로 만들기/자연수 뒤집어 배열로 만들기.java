class Solution {
    public int[] solution(long n) {
        
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        int len = num.length();
        
        for (int i=0; i<len; i++){
            answer[i] = Integer.parseInt(num.substring((len-i-1),(len-i))) ;
        }
        
        return answer;
    }
}