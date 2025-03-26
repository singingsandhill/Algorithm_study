class Solution {
    public String solution(int a, int b) {
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;

        // 1월부터 (a-1)월까지의 일수 합산
        for (int i = 1; i < a; i++) {
            totalDays += daysInMonth[i];
        }

        // + b일 더하기 (당월 날짜)
        totalDays += (b - 1); // 1일부터 시작이므로 -1

        return week[totalDays % 7];
    }
}