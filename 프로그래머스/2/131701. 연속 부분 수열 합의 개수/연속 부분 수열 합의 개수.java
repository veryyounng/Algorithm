
import java.util.*;

class Solution {
    public int solution(int[] elements) {

        int n = elements.length;
        Set<Integer> sumSet = new HashSet<>();

        // 원형 수열을 위해 배열 두 배로 확장
        int[] extended = new int[2 * n];
        for (int i = 0; i < n; i++) {
            extended[i] = elements[i];
            extended[i + n] = elements[i];
        }

        // 부분 수열의 합 계산
        for (int length = 1; length <= n; length++) { // 부분 수열의 길이
            for (int start = 0; start < n; start++) { // 시작 인덱스
                int sum = 0;
                for (int k = 0; k < length; k++) { // 길이만큼 합 계산
                    sum += extended[start + k];
                }
                sumSet.add(sum); // 합을 Set에 추가
            }
        }

        return sumSet.size(); // 중복 제거된 합의 개수 반환
    }

}
