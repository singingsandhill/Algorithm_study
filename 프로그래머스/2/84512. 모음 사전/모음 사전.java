import java.util.*;

class Solution {
    public int solution(String word) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        Map<Character, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < vowels.length; i++) {
            indexMap.put(vowels[i], i);
        }

        int[] weight = {781, 156, 31, 6, 1}; // 자리별 가중치
        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int order = indexMap.get(c); // A=0, E=1, ...
            answer += order * weight[i] + 1; // +1은 자기 자신
        }

        return answer;
    }
}