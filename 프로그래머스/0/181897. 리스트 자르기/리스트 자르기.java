import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        ArrayList<Integer> li = new ArrayList<>();
        int[] answer = {};
        
        switch(n){
            case 1 :
                answer = Arrays.copyOfRange(num_list, 0, b+1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
            case 3: 
                answer = Arrays.copyOfRange(num_list, a, b+1);
                break;
            case 4:
                for(int i = a; i <= b; i += c){
                    li.add(num_list[i]);
                }
                answer = new int[li.size()];
                for(int i = 0; i < li.size(); i++){
                    answer[i] = li.get(i);
                }
        }
        return answer;
    }
}