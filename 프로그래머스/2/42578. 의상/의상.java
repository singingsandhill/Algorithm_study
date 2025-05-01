import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String[] cloth : clothes) {
            String type = cloth[1];
            countMap.put(type, countMap.getOrDefault(type, 0) + 1);
        }

        int result = 1;
        for (int cnt : countMap.values()) {
            result *= (cnt + 1);
        }

        return result - 1;
    }
}