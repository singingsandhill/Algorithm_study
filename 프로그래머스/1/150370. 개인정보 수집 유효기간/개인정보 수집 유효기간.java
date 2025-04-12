import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();

        // 1. terms를 Map으로 변환
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        int todayDays = toDays(today); // 기준일 변환

        // 2. privacy를 순회하면서 만료 여부 체크
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            int collectedDay = toDays(parts[0]); // 수집일을 일수로 변환
            int validMonth = termMap.get(parts[1]); // 유효기간
            int expiredDay = collectedDay + validMonth * 28;

            if (expiredDay <= todayDays) {
                result.add(i + 1); // 파기 대상 (1-based index)
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // 날짜를 총 일수로 변환하는 함수
    private int toDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}