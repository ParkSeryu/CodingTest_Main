class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            while(array[i] > 0){
                int temp = array[i] % 10;
                array[i] /= 10;
                if(temp == 7){
                    answer++;
                }
            }
        }
        return answer;
    }
}