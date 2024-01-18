import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        int i = 0; 
        while(i < arr.length){
            if(li.size() == 0){
                li.add(arr[i]);
                i++;
            }else if( li.get(li.size() - 1) < arr[i]){
                li.add(arr[i]);
                i++;
            }else if(li.get(li.size() - 1 ) >= arr[i]){
                li.remove(li.size() - 1);
            }
        }
        
        int[] stk = new int[li.size()];
        for(int j = 0; j < li.size(); j++){
            stk[j] = li.get(j);
        }
        
        return stk;
    }
}