class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String temp = String.valueOf(num);
        for(int i  = 0; i < temp.length(); i++){
            if(temp.charAt(i) == Character.forDigit(k, 10)){
                return i + 1;
            }
        }
        return answer;
    }
}