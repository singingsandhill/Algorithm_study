import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> minPress = new HashMap<>();

        // 1. 각 문자의 최소 누름 수 계산
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int press = i + 1; // i번째 위치는 i+1번 눌러야 함
                minPress.put(c, Math.min(minPress.getOrDefault(c, Integer.MAX_VALUE), press));
            }
        }

        int[] answer = new int[targets.length];

        // 2. 각 target 문자열에 대해 최소 누름 수 계산
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            for (char c : targets[i].toCharArray()) {
                if (minPress.containsKey(c)) {
                    count += minPress.get(c);
                } else {
                    count = -1; // 작성 불가능
                    break;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}