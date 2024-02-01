import java.util.*;
class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);

        int answer = 0;
        int left = 1;  // 최소 거리
        int right = distance;  // 최대 거리

        while (left <= right) {
            int mid = (left + right) / 2;
            int removedRocks = 0;
            int prevRock = 0;

            for (int rock : rocks) {
                if (rock - prevRock < mid) {
                    // 현재 바위를 제거하는 경우
                    removedRocks++;
                } else {
                    // 바위를 제거하지 않는 경우, 최솟값 갱신
                    prevRock = rock;
                }
            }

            // 마지막 바위와 도착지점 간의 거리 체크
            if (distance - prevRock < mid) {
                removedRocks++;
            }

            // 이분 탐색 범위 조정
            if (removedRocks > n) {
                right = mid - 1;
            } else {
                answer = Math.max(answer, mid);
                left = mid + 1;
            }
        }

        return answer;
    }
}