class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        // 시작 좌표 찾기
        int x = 0, y = 0;
        for (int i = 0; i < h; i++) {
            int idx = park[i].indexOf('S');
            if (idx != -1) {
                x = i;
                y = idx;
                break;
            }
        }

        // 방향 벡터
        int[] dx = { -1, 1, 0, 0 }; // N, S, W, E
        int[] dy = { 0, 0, -1, 1 };
        String dir = "NSWE";

        // 명령 수행
        for (String route : routes) {
            String[] parts = route.split(" ");
            char d = parts[0].charAt(0);
            int n = Integer.parseInt(parts[1]);

            int dirIdx = dir.indexOf(d);
            int nx = x, ny = y;

            boolean valid = true;
            for (int i = 1; i <= n; i++) {
                int tx = x + dx[dirIdx] * i;
                int ty = y + dy[dirIdx] * i;

                if (tx < 0 || tx >= h || ty < 0 || ty >= w || park[tx].charAt(ty) == 'X') {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                x += dx[dirIdx] * n;
                y += dy[dirIdx] * n;
            }
        }

        return new int[]{x, y};
    }
}