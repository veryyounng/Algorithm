import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        //큐로 구성
        //arr[i]가 없으면 add할 것
        //q.size() == k면 break;
        //q.size() < k면 -1을 k-q.size()만큼 채울 것
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < arr.length; i++){
            if(! q.contains(arr[i])){
                q.add(arr[i]);
            }if(q.size() == k){
                break;
            }
        }
        // System.out.print(q);
        if(q.size() < k){
            while(q.size() < k){
                for(int i = 0; i < k - q.size(); i++){
                q.add(-1);
                }
            }
            
        }
        return q.stream().mapToInt(Integer :: intValue).toArray();
    }
}