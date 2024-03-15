public class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int lenP = p.length();
        int lenT = t.length();

        // t 문자열에서 p와 같은 길이의 부분문자열을 탐색
        for (int i = 0; i <= lenT - lenP; i++) {
            String substring = t.substring(i, i + lenP);
            // 부분문자열이 나타내는 수 계산
            long numSubstring = Long.parseLong(substring);
            // 나타내는 수가 p보다 작거나 같으면 count 증가
            if (numSubstring <= Long.parseLong(p)) {
                count++;
            }
        }

        return count;
    }
}
