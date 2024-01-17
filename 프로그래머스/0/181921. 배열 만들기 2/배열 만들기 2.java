import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] empty = {-1};
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            if(String.valueOf(i).matches("[05]+")){
                list.add(i);
            }
        }
            int[] answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
        return answer.length == 0 ? empty : answer;
        
        }
        
    }