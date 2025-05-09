import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        // 배열을 뒤에서부터 처리
        for (int i = n - 1; i >= 0; i--) {
            int current = numbers[i];

            // stack에서 현재보다 작거나 같은 수는 버림
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            // stack이 비어있으면 뒷 큰수가 없음
            answer[i] = stack.isEmpty() ? -1 : stack.peek();

            // 현재 값을 stack에 추가
            stack.push(current);
        }

        return answer;
    }
}