import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                li.add(i);
            }
        }
        if(li.size() == 0){
            return new int[]{-1};
        }
        
        int start = li.get(0);
        int end = li.get(li.size() - 1);
        int[] answer = Arrays.copyOfRange(arr, start, end+1);
        return answer;
    }
}