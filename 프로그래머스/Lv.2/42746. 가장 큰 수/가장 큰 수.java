import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        // 정수 배열을 문자열로 변환
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // 문자열을 조합하여 비교하는 Comparator 정의
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        });

        // 정렬된 문자열을 이어 붙여서 가장 큰 수 생성
        StringBuilder answer = new StringBuilder();
        for (String str : strNumbers) {
            answer.append(str);
        }

        // 첫 번째 숫자가 0인 경우 예외 처리
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }
}