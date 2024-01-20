import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int num = 0;
        ArrayList<Integer> li = new ArrayList<>();
        for(String t : intStrs){
            num = Integer.parseInt(t.substring(s, s+l));
            if(num > k){
                li.add(num);
            }
        }
        int[] answer = new int[li.size()];
        for(int i = 0; i < li.size(); i++){
            answer[i] = li.get(i);
        }
        return answer;
    }
}