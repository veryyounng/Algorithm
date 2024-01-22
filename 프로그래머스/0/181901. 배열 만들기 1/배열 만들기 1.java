import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                li.add(i);
            }
        }
        int[] answer = new int[li.size()];
        for(int i = 0; i < li.size(); i++){
            answer[i] = li.get(i);
        }
        return answer;
    }
}