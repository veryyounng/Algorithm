class Solution {
    public int solution(String myString, String pat) {
        String a = myString.toUpperCase();
        String b = pat.toUpperCase();
        if(a.contains(b)){
            return 1;
        }return 0;
    }
}