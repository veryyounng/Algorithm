import java.util.*;

class Solution {
    public  List<Integer> solution(int[] answers) {
        int[] stu = {0,0,0};
        
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};


        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) stu[0]++;
            if (answers[i] == two[i % 8]) stu[1]++;
            if (answers[i] == three[i % 10]) stu[2]++;
        }

        int maxScore = Math.max(stu[0], Math.max(stu[1], stu[2]));
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < 3; i++){
             if(maxScore == stu[i]){
                 answer.add(i+1);
             }
        }
        return answer;
    }
}