class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] test = binomial.split(" ");
        if(test[1].equals("+")){
            answer = Integer.parseInt(test[0]) + Integer.parseInt(test[2]);
        }else if(test[1].equals("-")){
            answer = Integer.parseInt(test[0]) - Integer.parseInt(test[2]);
        }else{
            answer = Integer.parseInt(test[0]) * Integer.parseInt(test[2]);
        }
        return answer;
    }
}