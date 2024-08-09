import java.util.*;
class Solution {
    int answer = -1;
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        int[] dr = {1,-1,0,0};
        int[] dc = {0,0,1,-1};
        
        Deque<int[]> q = new ArrayDeque<>();
        
        //init bfs
        q.add(new int[] {0,0,1});
        visited[0][0]=true;
        
        //bfs
        while(!q.isEmpty()){
            int[] cur = q.remove();
            int r = cur[0];
            int c = cur[1];
            int dist = cur[2];
            
            if(r==n-1&&c==m-1) return dist;
            
            for(int i=0; i<4; i++){
                int nr = r+dr[i];
                int nc = c+dc[i];
                
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&maps[nr][nc]==1&&!visited[nr][nc]){
                    visited[nr][nc]=true;
                    q.add(new int[]{nr,nc,dist+1});
                }
            }
        }
        return answer;
    }
}