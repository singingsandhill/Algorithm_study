class Solution {
    public int[] solution(String s) {
        
        int count = 0;
        int rmZero = 0;
        
        while(!s.equals("1")){
            int numZero = s.length()-s.replace("0","").length();
            rmZero += numZero;
            
            s = s.replace("0","");
            s = Integer.toBinaryString(s.length());
            count++;
                        
        }
        return new int[] {count,rmZero};
    }
}