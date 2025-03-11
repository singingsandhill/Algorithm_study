class Solution {
    
    public int max_com(int n, int m ){
        int small = Math.min(n,m);
        int big = Math.max(n,m);
        
        while(small !=0){
            int temp = small;
            small = big%small;
            big = temp;
        }
        return big;
    }
    
    public int[] solution(int n, int m) {
        int max_common = max_com(n,m);
        int min_common = (n*m)/max_common;
        return new int[] {max_common,min_common};
    }
}