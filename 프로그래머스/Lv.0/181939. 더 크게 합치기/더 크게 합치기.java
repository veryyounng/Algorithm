class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int answer2 = 0;
        
        answer += Integer.parseInt("" + a + b);
        answer2 += Integer.parseInt("" + b + a);
        
        return answer >= answer2? answer : answer2;
    }
}