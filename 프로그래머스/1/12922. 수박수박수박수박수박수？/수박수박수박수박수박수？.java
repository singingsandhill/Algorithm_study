class Solution {
    public String solution(int n) {
        String word = "수박";
        if(n%2 == 1) return word.repeat(n/2)+"수";
        else return word.repeat(n/2);
    }
}