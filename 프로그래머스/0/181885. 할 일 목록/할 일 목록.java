import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> li = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                li.add(todo_list[i]);
            }
        }
        String[] answer = new String[li.size()];
        for(int i = 0; i < li.size(); i++){
            answer[i] = li.get(i);
        }
        return answer;
    }
}