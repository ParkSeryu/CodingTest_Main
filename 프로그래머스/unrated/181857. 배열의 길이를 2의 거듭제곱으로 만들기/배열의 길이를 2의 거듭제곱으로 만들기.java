class Solution {
    public int[] solution(int[] arr) {
        int su = 2;

        if(arr.length == 1){
            return arr;
        }
        
        while(arr.length > su){
            su *= 2;
        }
        
        int[] answer = new int[su];
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        
        
        return answer;
    }
}