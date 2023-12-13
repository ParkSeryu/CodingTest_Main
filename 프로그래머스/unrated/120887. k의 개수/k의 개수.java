class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(; i <= j; i++){
            char ch = Character.forDigit(k, 10);
            char[] chArr = String.valueOf(i).toCharArray();
            for(int a = 0; a < chArr.length; a++){
                if(chArr[a] == ch){
                    answer++;
                }
            }
        }
        return answer;
    }
}