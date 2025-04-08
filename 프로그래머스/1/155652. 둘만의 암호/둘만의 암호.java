import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for(char c : skip.toCharArray()){
            skipSet.add(c);   
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            int count = 0;
            char next = ch;
            
            while(count < index){
                next++;
                if(next > 'z') next='a';
                
                if(skipSet.contains(next)) continue;
                count++;
            }
            answer.append(next);
        }
        return answer.toString();
    }
}