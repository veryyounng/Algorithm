import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;
        
        for(int i = 0; i < operations.length; i++){
            st = new StringTokenizer(operations[i]);
            char c = st.nextToken().charAt(0);
            int num = Integer.parseInt(st.nextToken());
        
        switch(c){
            case 'I':
                min.add(num);
                max.add(num);
                break;
            
            case 'D':
                if(max.isEmpty()) break;
                if(num == 1){
                    int d = max.poll();
                    min.remove(d);
                }
                if(num == -1){
                    int d = min.poll();
                    max.remove(d);
                }
        }
      }

        if(max.isEmpty()){
            return new int[] {0,0};
        }
        return new int[] {max.peek(), min.peek()};

    }
}