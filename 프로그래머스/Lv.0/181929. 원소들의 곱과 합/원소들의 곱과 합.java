class Solution {
    public int solution(int[] num_list) {
        int mult = 1;
        int sum = 0;
        
        for(int i = 0; i < num_list.length; i++){
            mult *= num_list[i];
            sum += num_list[i];
        }
        double sum_d = Math.pow(sum , 2);
        
        return mult < sum_d ? 1 : 0;
    }
}