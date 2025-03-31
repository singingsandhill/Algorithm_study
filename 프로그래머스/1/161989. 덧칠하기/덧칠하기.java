class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int init = section[0];
        for(int i=1; i < section.length; i++){
            if(section[i] < init+m){
                continue;
            } else if(section[i] >= init+m){
                init = section[i];
                answer += 1;
            }
        }
        return answer;
    }
}