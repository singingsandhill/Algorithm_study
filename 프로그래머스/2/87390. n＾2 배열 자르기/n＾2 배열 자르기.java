class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left + 1);
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            long idx = left + i;
            int row = (int) (idx / n);
            int col = (int) (idx % n);
            result[i] = Math.max(row, col) + 1;
        }

        return result;
    }
}