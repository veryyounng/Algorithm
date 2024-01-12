class Solution {
    public int solution(int a, int b) {
        return Math.max(
            (int)Math.pow(10, (int)Math.log10(b) + 1) * a + b,
            2 * a * b
        );
    }
}