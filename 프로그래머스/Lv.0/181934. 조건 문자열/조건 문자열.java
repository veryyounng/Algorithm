class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        switch(eq){
                case("="):
                if(ineq.equals("<")){
                    if(n <= m){
                        answer = 1;
                        break;
                    }else{
                        answer = 0;
                        break;
                    }
                }else{
                    if(n >= m){
                        answer = 1;
                        break;
                    }else{
                        answer = 0;
                        break;
                    }
                }
                
                case("!"):
                if(ineq.equals("<")){
                    if(n < m){
                        answer = 1;
                        break;
                    }else{
                        answer = 0;
                        break;
                    }
                }else{
                    if(n > m){
                        answer = 1;
                        break;
                    }else{
                        answer = 0;
                        break;
                    }
                }
        }
        return answer;
    }
}