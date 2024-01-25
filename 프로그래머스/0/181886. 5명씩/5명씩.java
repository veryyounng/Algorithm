import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> li = new ArrayList<>();
        for(int i= 0; i < names.length; i++){
            if(i % 5 == 0){
                li.add(names[i]);
            }
        }
        String[] answer = new String[li.size()];
        for(int i = 0; i < li.size(); i++){
            answer[i] = li.get(i);
        }
        return answer;
    }
}