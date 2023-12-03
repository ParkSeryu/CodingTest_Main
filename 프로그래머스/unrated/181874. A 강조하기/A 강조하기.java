class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'A'){
                answer += 'A';
            }
            else if(Character.isUpperCase(myString.charAt(i))){
                answer += (char)(myString.charAt(i) + 32);
            }
            else{
                answer += myString.charAt(i);
            }
        }
        
        return answer;
    }
}