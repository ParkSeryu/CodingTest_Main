class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        int idx = 0;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    arr[i] = -1;
                    idx++;
                }
            }
        }
        idx = arr.length - idx;
        answer = new int[idx];
        
        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] != -1 ){
                answer[j++] = arr[i];            
            }
        }
        
        return answer;
    }
}