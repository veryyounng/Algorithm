import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> mon = new HashSet<>();  
        for(int i = 0; i < nums.length; i++){
            mon.add(nums[i]);
        }
        int answer = 0;
        int n = nums.length / 2;
        if(mon.size() > n){
            answer = n;
        }else{
            answer = mon.size();
        }
        return answer;
    }
}