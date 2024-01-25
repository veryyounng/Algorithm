import java.util.*;

class Solution {
    public int solution(int N, int number) {
        // dp[i] : i번째에 만들 수 있는 숫자들의 집합
        ArrayList<HashSet<Integer>> dp = new ArrayList<>();

        for (int i = 0; i <= 8; i++) {
            dp.add(new HashSet<>());
        }

        // 초기화: N, NN, NNN, ...
        int base = N;
        for (int i = 1; i <= 8; i++) {
            dp.get(i).add(base);
            base = base * 10 + N;
        }

        // 동적 계획법을 통한 수식 생성
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j < i; j++) {
                for (int num1 : dp.get(j)) {
                    for (int num2 : dp.get(i - j)) {
                        dp.get(i).add(num1 + num2);
                        dp.get(i).add(num1 - num2);
                        dp.get(i).add(num1 * num2);

                        if (num2 != 0) {
                            dp.get(i).add(num1 / num2);
                        }
                    }
                }
            }

            // 목표 숫자가 있는지 확인
            if (dp.get(i).contains(number)) {
                return i;
            }
        }

        return -1;  // 최솟값이 8보다 크면 -1을 반환
    }
}
