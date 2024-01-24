import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int odd = 0; 
        int even = 0; 
        odd += num_list[0];
        System.out.print(even);
        for(int i = 1; i < num_list.length; i++){
        if(i % 2 == 0){
            odd += num_list[i];
        }else if(i % 2 == 1){
            even += num_list[i];
        }
        }
        return Math.max(even, odd);
    }
}