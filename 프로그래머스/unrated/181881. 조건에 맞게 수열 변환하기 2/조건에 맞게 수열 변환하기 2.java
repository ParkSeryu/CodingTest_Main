class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true){
            int[] arr2 = new int[arr.length];
            
            for(int i = 0; i < arr.length; i++){
                arr2[i] = arr[i];
            }
            
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr2[i] /= 2;
                }
                else if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr2[i] *= 2 + 1;
                }
            }
            
            boolean flag = true;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != arr2[i]){
                    flag = false;
                    break;
                }
            }
            
            answer++;

            if(flag){
                if(answer == 1) answer = 0;
                return answer;
            }
            
            for(int i = 0; i < arr.length; i++){
                arr[i] = arr2[i];
            }
        }
    }
}