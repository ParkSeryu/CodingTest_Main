class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] chArr = my_string.toCharArray();
        
        for(int[] query : queries){
            String temp = "";
            for(int i = query[1]; i >= query[0]; i-- ){
                temp += chArr[i];
            }
            
            char[] tempChar = temp.toCharArray();
            int j = 0;
            for(int i = query[0]; i <= query[1]; i++){
                 chArr[i] = tempChar[j++];
            }
     
        }
        
        for(int i = 0; i < chArr.length; i++){
            answer += chArr[i];
        }
        
        
        return answer;
    }
}