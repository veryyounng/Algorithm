import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {

        ArrayList<String> li = new ArrayList<>();
        int num = 0;
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")){
                li.add(strArr[i]);
            }
        }
        String[] answer = li.toArray(new String[li.size()]);

        return answer;
    }
}