class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        for(char c : myString.toCharArray()){
            if(c == 'A'){
                answer += "B";
            }else{
                answer += "A";
            }
        }

        // 패턴이 존재하는지 검사
        return answer.contains(pat) ? 1 : 0;
    }
}