import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(n);
        
        while(n != 1){
            if(n%2==0){
                n = n/2;
            }else if(n % 2 == 1){
                n = 3 * n + 1;
            }
             li.add(n);
        }
        
        int[] answer = new int[li.size()];
        for(int i = 0; i < li.size(); i++){
            answer[i] = li.get(i);
        }
        
        return answer;
    }
}