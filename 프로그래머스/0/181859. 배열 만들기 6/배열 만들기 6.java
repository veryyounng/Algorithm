import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for(int c : arr){
            if(!stk.empty() && stk.peek() == c){
                stk.pop();
            }else{
                stk.push(c);
            }
        }
        return stk.empty()? new int[] {-1} : stk.stream().mapToInt(Integer :: intValue).toArray();
    }
}