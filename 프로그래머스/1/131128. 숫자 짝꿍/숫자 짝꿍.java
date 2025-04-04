class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        // X와 Y에 포함된 각 숫자의 개수 카운트
        for (char c : X.toCharArray()) {
            xCount[c - '0']++;
        }

        for (char c : Y.toCharArray()) {
            yCount[c - '0']++;
        }

        StringBuilder result = new StringBuilder();

        // 큰 수부터 내려가며 공통된 숫자를 최소 개수만큼 append
        for (int i = 9; i >= 0; i--) {
            int minCount = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < minCount; j++) {
                result.append(i);
            }
        }

        // 결과 처리
        if (result.length() == 0) {
            return "-1";
        }

        // 모두 0이면 "0"
        if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
    }
}