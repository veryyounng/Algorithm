class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        int num = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(n == num_list[i]){
                num ++;
            }
        }
        if(num > 0){
                answer = 1;
            }
        return answer;
    }
}