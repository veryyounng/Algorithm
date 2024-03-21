class Solution {
    public int solution(int[] numbers, int target) {
        return find(numbers, target, 0, 0);
    }
    private int find(int[] numbers, int target, int index, int currentSum){
        if(index == numbers.length){
            return currentSum == target? 1 : 0;
        }
        int add = find(numbers, target, index+1, currentSum + numbers[index]);
        int subStract = find(numbers, target, index+1, currentSum - numbers[index]);
        return add + subStract;
    }
}