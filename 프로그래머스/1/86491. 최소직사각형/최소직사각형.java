class Solution {
    public int solution(int[][] sizes) {
        int max_size = 0;
        int min_size = 0;
        
        for(int i=0; i<sizes.length; i++){
            max_size = Math.max(max_size,Math.max(sizes[i][0],sizes[i][1]));
            min_size = Math.max(min_size, Math.min(sizes[i][0],sizes[i][1]));
        }
        return max_size*min_size;
    }
}