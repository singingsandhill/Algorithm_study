class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLen = t.length()-p.length();
        int pLen = p.length();
            
        for(int i=0; i<tLen+1; i++){
            String subNumS = t.substring(i,i+pLen);
            if (subNumS.compareTo(p)<=0) answer++;
        }
        return answer;
    }
}