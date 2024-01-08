import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> q = new LinkedList<>();
        List<Integer> al = new ArrayList<>();
        int cnt = 0;
        
        int[] day = new int[progresses.length];
		
for(int i = 0; i < progresses.length; i++) {
	if((100 - progresses[i]) % speeds[i] == 0) {
		day[i] = (100 - progresses[i]) / speeds[i];
	}
	else {
		day[i] = ((100 - progresses[i]) / speeds[i]) + 1;
	}
	q.add(day[i]);
}
        int before = q.peek();
        
        while(!q.isEmpty()){
            if(q.peek() <= before){
                q.poll();
                cnt++;
            }else{
                al.add(cnt);
                cnt = 1;
                before = q.poll();
            }
        }
        al.add(cnt);
        
        int[] answer = new int [al.size()];
        for(int i = 0; i < al.size(); i++){
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}