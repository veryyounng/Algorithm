import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        
        String[] nonEmptyArr = Arrays.stream(answer)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);
        Arrays.sort(nonEmptyArr);
        return nonEmptyArr;
    }
}