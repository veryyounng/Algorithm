import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 학생들의 체육복 상태를 저장하는 배열
        int[] clothes = new int[n];
        Arrays.fill(clothes, 1); // 초기값은 1로 설정 (체육복이 있는 상태)

        // 도난당한 학생들은 체육복을 하나 잃음
        for (int l : lost) {
            clothes[l - 1]--;
        }

        // 여벌의 체육복을 가져온 학생들은 체육복을 하나 얻음
        for (int r : reserve) {
            clothes[r - 1]++;
        }

        // 체육복 빌려주기
        for (int i = 0; i < n; i++) {
            if (clothes[i] == 0) {
                // 도난당한 학생이면
                if (i - 1 >= 0 && clothes[i - 1] == 2) {
                    // 앞번호의 학생이 여벌이 있으면 빌려줌
                    clothes[i]++;
                    clothes[i - 1]--;
                } else if (i + 1 < n && clothes[i + 1] == 2) {
                    // 뒷번호의 학생이 여벌이 있으면 빌려줌
                    clothes[i]++;
                    clothes[i + 1]--;
                }
            }
        }

        // 체육수업을 들을 수 있는 학생 수 계산
        int answer = 0;
        for (int c : clothes) {
            if (c > 0) {
                answer++;
            }
        }

        return answer;
    }
}
