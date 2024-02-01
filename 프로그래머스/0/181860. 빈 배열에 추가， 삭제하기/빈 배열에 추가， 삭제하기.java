import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < flag.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i]*2; j++){
                    stack.push(arr[i]);
                }
            }
                else{
                    for(int k = 0; k < arr[i]; k++){
                        stack.pop();
                    }
                }
            }
        System.out.print(stack);
        // int[] answer = new int[stack.size()];
        // for(int i = 0; i < answer.length; i++){
        //     answer[i] = stack.pop();
        // }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}