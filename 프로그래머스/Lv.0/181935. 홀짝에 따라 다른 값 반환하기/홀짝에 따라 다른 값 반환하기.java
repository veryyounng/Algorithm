class Solution {
    public int solution(int n) {
        int sum = 0;
        int mul = 0;
        
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                sum += i;
            }else{
                mul += Math.pow(i,2);
            }
        }
        return n % 2 == 1? sum : mul;
    }
}