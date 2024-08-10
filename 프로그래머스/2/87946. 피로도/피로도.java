public class Solution {
    int answer = 0;
    int n;
    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        n = dungeons.length;
        visited = new boolean[n];
				// ✅ 재귀를 이용하여 dungeons의 원소를 완전탐색한다.
        backtrack(k, 0, dungeons);
        return answer;
    }

    public void backtrack(int k, int cnt, int[][] dungeons) {
				//✅ 최대 cnt를 answer에 업데이트 한다.
        if (cnt > answer) {
            answer = cnt;
        }
				//✅ dungeons를 순회한다.
        for (int i = 0; i < n; i++) {
					//✅ 현재 피로도 k가 i번 째 던전의 필요피로도보다 크거나 같으면서, 방문한 적 없으면
            if (k >= dungeons[i][0] && !visited[i]) {
								//✅ i 번째 원소를 방문한다.
                visited[i] = true;
								//✅ 재귀함수를 호출한다.
                backtrack(k - dungeons[i][1], cnt + 1, dungeons);
								//✅ i 번째 원소 방문을 취소한다.
                visited[i] = false;
            }
        }
    }
}