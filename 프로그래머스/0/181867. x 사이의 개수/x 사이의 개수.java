class Solution {
    public int[] solution(String myString) {
        String[] answer = myString.split("x", myString.length());
        int[] answer2 = new int[answer.length];
        for(int i = 0; i < answer.length; i++){
            answer2[i] = answer[i].length();
        }
        return answer2;
    }
}