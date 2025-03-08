class Solution {
    public boolean solution(String s) {
        
        boolean answer = true;
        
        if (!(s.length() == 6 || s.length() == 4) ) return false;
        
        for(int i=0; i<s.length(); i++){
            try{
                Integer.parseInt(s.substring(i,i+1));
            } catch (Exception e){
                return false;
            }
        }
        return answer;
    }
}