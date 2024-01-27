class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int answer2 = 1;
        int length = num_list.length;
        for(int i : num_list){
            if(length >= 11){
                answer += i;
            }else{
                answer2 *= i;
            }
        }
        if(length >= 11){
            return answer;
        }else{
            return answer2;
        }
    }
}