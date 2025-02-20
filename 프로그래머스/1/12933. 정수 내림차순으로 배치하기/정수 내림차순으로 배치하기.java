import java.util.*;

class Solution {
    public long solution(long n) {
        String[] num = String.valueOf(n).split("");
        
        Arrays.sort(num,Collections.reverseOrder());
        
        String sortednum = String.join("",num);
        
        return Long.parseLong(sortednum);
        
    }
}