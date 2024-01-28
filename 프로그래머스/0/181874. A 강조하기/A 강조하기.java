class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char c :  myString.toCharArray()){
            if(c == 'a'){
                String tmp = String.valueOf(c);
                answer += tmp.toUpperCase();
            }else if(c != 'A' && c != 'a'){
                String tmp = String.valueOf(c);
                answer += tmp.toLowerCase();
            }else if(c == 'A'){
                answer += String.valueOf(c);
            }
        }
        return answer;
    }
}