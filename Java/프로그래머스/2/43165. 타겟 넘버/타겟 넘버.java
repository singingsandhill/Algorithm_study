class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,target,0,0);
        return answer;
    }
    void dfs(int[] numbers, int target, int index, int cur){
        if(index==numbers.length){
            if(target==cur){
                answer++;
            }
            return;
        }
        dfs(numbers,target,index+1,cur+numbers[index]);
        dfs(numbers,target,index+1,cur-numbers[index]);
    }
}