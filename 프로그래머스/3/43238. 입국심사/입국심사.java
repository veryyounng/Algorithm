import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);

        long left = 1;
        long right = (long)times[times.length - 1] * n;
        long answer = Long.MAX_VALUE;

        while (left <= right) {
            long mid = (left + right) / 2;
            long total = 0;

            // mid 시간 동안 각 심사대에서 처리할 수 있는 인원 수 계산
            for (int time : times) {
                total += mid / time;
            }

            // 처리 가능한 인원 수가 n보다 작으면 시간을 늘려야 함
            if (total < n) {
                left = mid + 1;
            } else {
                // 처리 가능한 인원 수가 n 이상이면 시간을 줄여본다
                answer = Math.min(answer, mid);
                right = mid - 1;
            }
        }

        return answer;
    }
}