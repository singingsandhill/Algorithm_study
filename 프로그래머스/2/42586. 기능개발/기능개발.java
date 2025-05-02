import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        // 1) 남은 개발 일수 계산
        int[] days = new int[n];
        for (int i = 0; i < n; i++) {
            int remain = 100 - progresses[i];
            days[i] = (remain + speeds[i] - 1) / speeds[i];  // 올림 처리
        }

        // 2) 배포 그룹 나누기
        List<Integer> releases = new ArrayList<>();
        int curDeployDay = days[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (days[i] <= curDeployDay) {
                // 이 기능은 앞 기능과 함께 배포
                count++;
            } else {
                // 새로운 배포 그룹 시작
                releases.add(count);
                curDeployDay = days[i];
                count = 1;
            }
        }
        // 마지막 그룹 추가
        releases.add(count);

        // 3) List<Integer> → int[]
        return releases.stream()
                       .mapToInt(Integer::intValue)
                       .toArray();
    }
}