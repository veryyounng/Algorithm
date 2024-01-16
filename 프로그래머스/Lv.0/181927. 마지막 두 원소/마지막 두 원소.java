import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int a = num_list[num_list.length - 1];
        int b = num_list[num_list.length - 2];
        
        ArrayList<Integer> members = new ArrayList<>();
        
        for(int i = 0; i < num_list.length; i++){
            members.add(num_list[i]);
        }
        
        if(a > b){
            members.add(a - b);
        }
        else{
            members.add(2 * a);
        }
        
        int[] answer = new int[members.size()];
        for(int i = 0; i < members.size(); i++){
            answer[i] = members.get(i);
        }
        return answer;
    }
}