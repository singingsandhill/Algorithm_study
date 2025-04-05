import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌도 있고 도난도 당한 경우 제거
        for (int l : lost) {
            boolean isDuplicate = false;
            for (int i = 0; i < reserve.length; i++) {
                if (l == reserve[i]) {
                    reserve[i] = -1; // 이미 처리된 것으로 표시
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) lostList.add(l);
        }

        for (int r : reserve) {
            if (r != -1) reserveList.add(r);
        }

        // 빌려주기 시도
        for (int r : reserveList) {
            if (lostList.contains(r - 1)) {
                lostList.remove(Integer.valueOf(r - 1));
            } else if (lostList.contains(r + 1)) {
                lostList.remove(Integer.valueOf(r + 1));
            }
        }

        return n - lostList.size();
    }
}