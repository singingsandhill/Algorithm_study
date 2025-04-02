class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int maxRank = 0;
        int minRank = 0;
        int cntMin = 0;
        int cntMax = 0;
        
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j< lottos.length; j++){
                if(lottos[i]==win_nums[j]){
                    cntMin++;
                    cntMax++;
                }
            }
            if(lottos[i]==0){
                    cntMax++;
                }
        }
        maxRank = ranking(cntMax);
        minRank = ranking(cntMin);
        
        answer[0]=maxRank;
        answer[1]=minRank;        
        
        return answer;
    }
    public int ranking( int num){
        System.out.println(num);
        switch(num){
            case 0 : return 6;
            case 1 : return 6;
            case 2 : return 5;
            case 3 : return 4;
            case 4 : return 3;
            case 5 : return 2;
            case 6 : return 1;
            default : return 6;
        }
        
    }
}