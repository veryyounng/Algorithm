import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        int i = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while(i < arr.length){
            if(stack.empty() || stack.peek() < arr[i]){
                stack.push(arr[i]);
                i++;
            }else if(stack.peek() >= arr[i]){
                stack.pop();
            }
        }
        return stack;
    }
}