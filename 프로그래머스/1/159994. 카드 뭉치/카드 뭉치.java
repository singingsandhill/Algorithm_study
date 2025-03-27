class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;
        
        for(String word : goal){
            if(index1<cards1.length && cards1[index1].equals(word)){
                index1++;
            } else if(index2<cards2.length && cards2[index2].equals(word)){
                index2++;
            } else {
                //System.out.println("index1 : " + index1+" index2 : " + index2);
                return "No";
            }
        }
        return "Yes";
    }
}