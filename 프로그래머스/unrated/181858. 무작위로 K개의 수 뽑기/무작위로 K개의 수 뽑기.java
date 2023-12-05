class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i = 0; i < answer.length; i++){
            answer[i] = -1;
        }
        
        int idx = 0;
        
        for(int i = 0; i < arr.length; i++){
            boolean flag = true;
            for(int j = 0; j < answer.length; j++){
                if(arr[i] == answer[j] && answer[j] != -1){
                    flag = false;
                    break;
                }
            }
            if(flag) answer[idx++] = arr[i];
            if(idx == k) break;
        }
        
        
        return answer;
    }
}