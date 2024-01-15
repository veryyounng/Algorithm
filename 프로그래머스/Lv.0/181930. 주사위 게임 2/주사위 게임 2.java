class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] arr = {a, b, c};
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                }
            }
        }
        switch(cnt){
            case 0:
                answer = a + b + c;
                break;
            case 1 :
                answer = (int) ((a+b+c) * ((Math.pow(a,2)) + (Math.pow(b,2)) + (Math.pow(c,2))));
                break;
            case 3 : 
                answer = (int) ((a+b+c) * ((Math.pow(a,2)) + (Math.pow(b,2)) + (Math.pow(c,2))) * ((Math.pow(a,3)) + (Math.pow(b,3)) + (Math.pow(c,3))));
        }
        return answer;
    }
}