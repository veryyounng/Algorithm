import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = Integer.parseInt("" + a + b);
        int answer2 = 2 * a * b;
        
        return Math.max(answer, answer2);
    }
}