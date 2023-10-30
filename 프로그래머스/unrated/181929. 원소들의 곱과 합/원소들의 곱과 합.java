class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum_a = 1;
        for (int num : num_list) {
            sum_a *= num;
        }
        
        int sum_b = 0;
        for (int num : num_list) {
            sum_b += num;
        }
        
        sum_b = sum_b * sum_b;
        
        System.out.println(sum_a + " " + sum_b);
        
        if(sum_a < sum_b){
            answer = 1;
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}