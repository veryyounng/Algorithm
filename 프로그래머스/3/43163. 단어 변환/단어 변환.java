import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        
        if(!Arrays.asList(words).contains(target)){
            return 0;
        }
        
        Queue <String> q = new LinkedList<>();
        q.offer(begin);
        int answer = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                String current = q.poll();
                
                if(current.equals(target)){
                    return answer;
                }
                
                for(String word : words){
                    if(canConvert(current, word)){
                        q.offer(word);
                    }
                }
            }
            answer++;
        }
        
        
        return 0;
    }
    
    public boolean canConvert(String str1, String str2){
        int count = 0; 
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                count++;
            }
        }
        return count == 1;
    }
}