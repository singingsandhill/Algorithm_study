import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String ss = s+s;
        
        for (int i=0; i<s.length(); i++){
            if(isValid(ss.substring(i,s.length()+i))){
                answer++;
            }
        }
        
        return answer;
    }
    boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char c : s.toCharArray()){
                if(c=='('||c=='{'||c=='['){stack.push(c);}
                else{
                    if(stack.isEmpty()) return false;
                    char k = stack.pop();
                    if((k=='('&& c!=')')||(k=='{'&&c!='}')||(k=='['&&c!=']')) return false;

            }
        } return stack.isEmpty();    
    }
}
