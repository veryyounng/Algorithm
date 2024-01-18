class Solution {
    public int solution(int[][] sizes) {
        int length = 0; 
        int height = 0; 
        for(int[] arr: sizes){
            length = Math.max(length, Math.max(arr[0], arr[1]));
            height = Math.max(height, Math.min(arr[0], arr[1]));
        }
        int answer = length * height;
        return answer;
    }
}