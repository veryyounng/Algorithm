class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s, e+1);
        StringBuilder sb = new StringBuilder(answer);
        sb.reverse();
        
        StringBuilder result = new StringBuilder(my_string);
        result.replace(s, e+1, sb.toString());
        
        return result.toString();
    }
}