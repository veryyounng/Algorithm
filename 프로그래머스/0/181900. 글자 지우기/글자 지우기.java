class Solution {
    public String solution(String my_string, int[] indices) {
        String[] temp = my_string.split("");
        for(int i = 0; i < indices.length; i++){
            temp[indices[i]] = "";
        }
        String answer = "";
        for(int i = 0; i < temp.length; i ++){
            answer += temp[i];
        }
        return answer;
    }
}