import java.util.Arrays;

class Solution {
    private static final long mod = 1234567;
    private long[] memo;
    
    public long solution(int n) {
        memo = new long[n+1];
        Arrays.fill(memo,-1);
        return dfs(n);
    }
    
    long dfs(int k){
        // 이미 계산했으면 바로 종료
        if (memo[k] != -1){
            return memo[k];
        }
        
        if(k ==1){
            return memo[k]=1;
        }
        if(k==2){
            return memo[k]=2;
        }
        memo[k] = (dfs(k-1)+dfs(k-2)) % mod;
        return memo[k];
    }
}