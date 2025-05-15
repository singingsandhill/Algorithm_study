import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dr = {1,0,-1,0};
        int[] dc = {0,1,0,-1};
        
        boolean[][] visited = new boolean[n][m];
        Deque<int[]> queue = new ArrayDeque<>();
        
        // init
        queue.add(new int[]{0,0,1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int[] cur = queue.remove();
            int r = cur[0], c = cur[1], dist = cur[2];
            
            if (r==n -1 && c== m-1){
                return dist;
            }
            
            for(int d=0; d<4; d++){
                int nr = r +dr[d], nc = c+ dc[d];
                
                if(nr >= 0 && nr < n && nc >=0 && nc < m && maps[nr][nc]==1){
                    if(!visited[nr][nc]){
                        visited[nr][nc] = true;
                        queue.add(new int[] {nr,nc,dist+1});
                    }
                }
            }
        }
        
        return -1;
    }
}