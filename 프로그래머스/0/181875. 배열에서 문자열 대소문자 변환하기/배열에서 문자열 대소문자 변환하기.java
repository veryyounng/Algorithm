import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> li = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++){
            if(i % 2 == 1){
                li.add(strArr[i].toUpperCase());
            }else if(i % 2 == 0){
                li.add(strArr[i].toLowerCase());
            }
        }
        String arr[] = li.toArray(new String[li.size()]); 

        return arr;
    }
}