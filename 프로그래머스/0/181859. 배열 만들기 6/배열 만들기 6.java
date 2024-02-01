import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        ArrayList<Integer> stk = new ArrayList<>();
        
        while(i < arr.length){
           int size = stk.size();
            
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else if(stk.get(size - 1) == arr[i]){
                stk.remove(size - 1);
                i++;
            }else if(stk.get(size - 1) != arr[i]){
                stk.add(arr[i]);
                i++;
            }
        }
        int[] answer =new int[stk.size()];
        for(int j = 0; j < answer.length; j++){
            answer[j] = stk.get(j);
        }
        return answer.length == 0? new int[]{-1} : answer;
    }
}