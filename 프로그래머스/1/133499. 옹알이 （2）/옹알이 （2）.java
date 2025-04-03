class Solution {
    public int solution(String[] babbling) {
        String[] sounds = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String word : babbling) {
            String replaced = word;

            for (int i = 0; i < sounds.length; i++) {
                replaced = replaced.replaceAll(sounds[i], String.valueOf(i));
            }

            // 연속된 같은 숫자 발음이 있으면 skip
            if (replaced.matches(".*(00|11|22|33).*")) continue;

            // 모든 발음이 숫자로 바뀌었는지 확인
            if (replaced.matches("[0123]+")) {
                count++;
            }
        }

        return count;
}
}