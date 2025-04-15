import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 신고된 유저별 신고자 목록
        Map<String, Set<String>> reportedMap = new HashMap<>();
        // 유저별 신고 성공으로 받은 메일 수
        Map<String, Integer> mailCount = new HashMap<>();

        // 초기화
        for (String id : id_list) {
            reportedMap.put(id, new HashSet<>());
            mailCount.put(id, 0);
        }

        // 신고 기록 처리 (중복 제거됨)
        for (String r : new HashSet<>(Arrays.asList(report))) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            reportedMap.get(reported).add(reporter);
        }

        // 정지 대상 확인 및 메일 수 카운트
        for (String reported : reportedMap.keySet()) {
            Set<String> reporters = reportedMap.get(reported);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    mailCount.put(reporter, mailCount.get(reporter) + 1);
                }
            }
        }

        // id_list 순서대로 결과 반환
        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            result[i] = mailCount.get(id_list[i]);
        }

        return result;
    }
}