class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int cnt = 0; 
        int len = number.length;
        
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                for(int k = j+1; k < len; k++){
                    answer = number[i] + number[j] + number[k];
                    if(answer == 0){
                        cnt ++;
                    }
                }
            }
        }
        return cnt;
    }
}