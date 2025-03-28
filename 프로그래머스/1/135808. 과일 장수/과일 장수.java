import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a, b) -> b - a); // 내림차순 정렬

        // 2. m개씩 상자 구성
        for (int i = 0; i + m <= arr.length; i += m) {
            int min = arr[i + m - 1]; // 이 상자에서 가장 낮은 점수
            answer += min * m;
        }
        return answer;
    }
}