import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        Map<Character, Integer> score = new HashMap<>();
        
        for(char c : "RTCFJMAN".toCharArray()){
            score.put(c,0);
        }
        
        for(int i=0; i<survey.length; i++){
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            int choice = choices[i];
            
            if(choice < 4){
                score.put(disagree, score.get(disagree) + (4 - choice));
            } else if (choice > 4){
                score.put(agree, score.get(agree) + (choice - 4));
            }
        }
        
        StringBuilder result = new StringBuilder();
        result.append(score.get('R') >= score.get('T') ? 'R' : 'T');
        result.append(score.get('C') >= score.get('F') ? 'C' : 'F');
        result.append(score.get('J') >= score.get('M') ? 'J' : 'M');
        result.append(score.get('A') >= score.get('N') ? 'A' : 'N');
        
        return result.toString();
                      
        
    }
}