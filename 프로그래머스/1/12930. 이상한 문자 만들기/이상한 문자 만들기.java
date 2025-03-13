class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ", -1);
        
        for (int i = 0; i < words.length; i++) {
            StringBuilder transformedWord = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                if (j % 2 == 0) {
                    transformedWord.append(Character.toUpperCase(c));
                } else {
                    transformedWord.append(Character.toLowerCase(c));
                }
            }
            result.append(transformedWord);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
        
    }
}