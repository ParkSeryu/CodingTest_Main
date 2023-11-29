class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(int)Math.ceil((double)num_list.length / n)];
        answer[0] = num_list[0];
        for(int i = 1, idx = 1, j = 0; i < num_list.length; i++){
            j++;
            if(n == j){
                answer[idx++] = num_list[i];
                j = 0;
            }
        }
        return answer;
    }
}