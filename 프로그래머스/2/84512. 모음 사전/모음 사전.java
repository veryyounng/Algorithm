import java.util.*;

class Solution {
     private static final String[] arr = {"A", "E", "I", "O", "U"};
    private static int count = 0;
    private static int answer = 0;

    public static int solution(String word) {
        count = 0;
        answer = 0;

        dfs("", word);

        return answer;
    }

    private static void dfs(String currentStr, String word) {
        if (currentStr.length() > 5) {
            return;
        }
        if (currentStr.equals(word)) {
            answer = count;
            return;
        }

        count++;
        for (int i = 0; i < arr.length; i++) {
            dfs(currentStr + arr[i], word);
        }
    }

}