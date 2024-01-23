import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0; i < num_list.length; i+=n){
            li.add(num_list[i]);
        }
        int[] answer = new int[li.size()];
        for(int i = 0; i < li.size(); i++){
            answer[i] = li.get(i);
        }
        return answer;
    }
}