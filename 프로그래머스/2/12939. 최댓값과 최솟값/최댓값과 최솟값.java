import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmpArr = s.split(" ");
        int[] arr = new int[tmpArr.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(tmpArr[i]);
        }
        Arrays.sort(arr);
        answer = "" + arr[0] + " " + arr[arr.length - 1];
        return answer;
    }
}