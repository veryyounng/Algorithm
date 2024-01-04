import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        //23:12
        //string, integer map 만들기
        //participant 빠른 for문 돌려서 getOrDefault str 있으면 +1, 없으면 0
        //completion 빠른 for문 돌려서 map.get해서 -1 
        //map에서 value가 0이 아니면 return
        
         Map<String, Integer> map = new HashMap<>();
        
        for(String str : participant){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        for(String str : completion){
            map.put(str,  map.get(str)-1);
        }
        for(String key: map.keySet()){
            if(map.get(key)!= 0){
                return key;
            }
        }
        return null;
    }
}