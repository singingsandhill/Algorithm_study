class Solution {
    public int solution(String s) {
        String temp = "";
        String[] num = {"zero","one","two","three","four","five",
                                     "six","seven","eight","nine"};
        
        StringBuilder answer = new StringBuilder();
        
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                answer.append(c);
            } else{
                temp += c;
                for(int i=0; i<num.length; i++){
                    if(num[i].equals(temp)){
                        answer.append(i);
                        temp="";
                        break;
                    }
                }
            }
        }
        
        return Integer.parseInt(answer.toString());
    }
}