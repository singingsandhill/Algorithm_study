import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> discountMap = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            boolean matched = true;
            for (String key : wantMap.keySet()) {
                if (discountMap.getOrDefault(key, 0) != wantMap.get(key)) {
                    matched = false;
                    break;
                }
            }

            if (matched) answer++;
        }

        return answer;
    }
}