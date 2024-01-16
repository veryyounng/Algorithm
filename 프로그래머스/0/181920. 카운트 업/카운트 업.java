import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int le = end_num - start_num + 1;
        ArrayList<Integer> li = new ArrayList<>();
        
        int[] answer = new int[le];
        
        for(int i = start_num; i <= end_num; i++){
            li.add(i);
        }
        for(int i = 0; i < li.size(); i++){
            answer[i] = li.get(i);
        }
        return answer;
    }
}