class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length; 
        int answer = length >= 11? 0 : 1;
        for(int num : num_list){
            if(length >= 11){
                answer += num;
            }else{
                answer *= num;
            }
        }
        return answer;
    }
}