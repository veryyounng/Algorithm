import java.util.*;

public class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    private int dfs(int[] numbers, int target, int index, int sum) {
        // 모든 숫자를 탐색했을 때
        if (index == numbers.length) {
            // 최종 합이 타겟과 같으면 1을 반환
            return sum == target ? 1 : 0;
        }
        
        // 현재 숫자를 더하거나 빼는 두 가지 경우를 재귀적으로 호출
        int add = dfs(numbers, target, index + 1, sum + numbers[index]);
        int subtract = dfs(numbers, target, index + 1, sum - numbers[index]);
        
        // 두 경우의 수를 합산하여 반환
        return add + subtract;
    }
}
