class Solution {
    public int solution(String myString, String pat) {
        String a = "";
        String b = "";
        for(int i = 0; i < myString.length(); i++){
            if(Character.isUpperCase(myString.charAt(i))){
                a += (char)(myString.charAt(i));
            }else{
                a += (char)(myString.charAt(i) - 32);
            }
        }
        for(int i = 0; i < pat.length(); i++){
            if(Character.isUpperCase(pat.charAt(i))){
                b += (char)(pat.charAt(i));
            }else{
                b += (char)(pat.charAt(i) - 32);
            }
        }
        if(a.contains(b)){
            return 1;
        }else{
            return 0;
        }
    }
}