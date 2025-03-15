class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLen = t.length()-p.length();
        int pLen = p.length();
            
        for(int i=0; i<=tLen; i++){
            String subNumS = t.substring(i,i+pLen);
            Long subNum = Long.parseLong(subNumS);
            Long Num = Long.parseLong(p);
            if (subNum <=Num) answer++;
        }
        return answer;
    }
}