import java.util.*;

class Solution {
    public int solution(String word) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        int[] weight = {781, 156, 31, 6, 1}; // 각 자릿수의 가중치
        int index = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int position = Arrays.binarySearch(vowels, c); // 현재 문자의 위치를 찾음
            index += weight[i] * position + 1; // 가중치를 곱하고 1을 더함
        }

        return index;
    }
}
