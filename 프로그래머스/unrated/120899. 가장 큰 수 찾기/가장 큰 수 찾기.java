
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        findMax(answer, array);
        return answer;
    }
    
    private void findMax(int[] answer, int[] array){
        int max = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                answer[0] = max;
                answer[1] = i;
            }
        }
    }
}